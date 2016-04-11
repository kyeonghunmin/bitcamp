package bitcamp.pms;

import java.io.InputStream;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import bitcamp.pms.context.ApplicationContext;
import bitcamp.pms.context.request.RequestHandler;
import bitcamp.pms.context.request.RequestHandlerMapping;
import bitcamp.pms.dao.MemberDao;
import bitcamp.pms.domain.Member;

public class ProjectApp {
  static ApplicationContext appContext;
  static RequestHandlerMapping requestHandlerMapping;
  static Scanner keyScan = new Scanner(System.in);
  static MemberDao memberDao;
  static int aa;
  
  public static void main(String[] args) throws Exception {
    appContext = new ApplicationContext("bitcamp.pms");
    requestHandlerMapping = new RequestHandlerMapping(appContext);
    appContext.addBean("stdinScan", keyScan);
    
    try {
      InputStream inputStream = Resources.getResourceAsStream(
          "conf/mybatis-config.xml");
      appContext.addBean("sqlSessionFactory", new SqlSessionFactoryBuilder().build(inputStream));
    } catch (Exception e) {
      System.out.println("mybatis 준비 중 오류발생\n시스템을 종료하겠습니다.");
      e.printStackTrace();
      return;
    }
 
    boolean b = true;
    String input = null;
    do {
      System.out.println("1) 로그인");
      System.out.println("2) 회원가입");
      System.out.print("선택? ");
      input = keyScan.nextLine();
      if (input.equals("1")) {
        b = doLogin();
      } else if (input.equals("2")) {
        b = doJoin();
      }
    } while (!b);
   
    do {
      input = prompt();
      processCommand(input);
    } while (!input.equals("quit"));

    keyScan.close(); // 항상 다 쓴 자원은 해제해야 한다.
  }

  static void processCommand(String input) throws Exception {
    String[] cmds = input.split(" ");

    if (cmds[0].equals("quit")) {
      doQuit();
    } else if (cmds[0].equals("about")) {
      doAbout();
    } else if (cmds[0].equals("unsubscribe")) {
      doUnsub();
    } else {
      RequestHandler requestHandler = (RequestHandler)requestHandlerMapping.getRequestHandler(cmds[0]);
      
      if (requestHandler == null) {
        doError();
        return;
      }
      
      Method method = requestHandler.getMethod();
      Object obj = requestHandler.getObj();
      try {
        ArrayList<Object> args = new ArrayList<>();
        Parameter[] params = method.getParameters();
        Object arg = null;
        
        for (Parameter param : params) {
          arg = appContext.getBean(param.getType());
          args.add(arg);
        }
        
        method.invoke(obj, args.toArray());
      } catch (Exception e) {
        System.out.print("명령 처리 중에 오류가 발생했습니다.");
        e.printStackTrace();
      }
    }
  }

  static String prompt() {
    System.out.print("명령> ");
    return keyScan.nextLine().toLowerCase();
  }

  static void doQuit() {
    System.out.println("안녕히 가세요!");
  }

  static void doError() {
    System.out.println("올바르지 않은 명령어입니다.");
  }

  static void doAbout() {
    System.out.println("비트캠프 80기 프로젝트 관리 시스템!");
  }
  
  static void doUnsub() throws Exception {
    InputStream inputStream = Resources.getResourceAsStream(
        "conf/mybatis-config.xml");
    SqlSessionFactory sqlSessionFactory = 
          new SqlSessionFactoryBuilder().build(inputStream);

    MemberDao memberDao = new MemberDao();
    memberDao.setSqlSessionFactory(sqlSessionFactory);
    
    System.out.print("정말로 탈퇴하시겠습니까?(y/n) ");
    String sub = keyScan.nextLine().toLowerCase();
    if (sub.equals("y")) {
      memberDao.delete(aa);
      
      System.out.println("회원 정보를 삭제하였습니다.");
      doQuit();
    }
  }
  
  static boolean doLogin() throws Exception {
    System.out.print("이메일: ");
    String email = keyScan.nextLine();
    System.out.print("암호: ");
    String pass = keyScan.nextLine();
    
    InputStream inputStream = Resources.getResourceAsStream(
                        "conf/mybatis-config.xml");
    SqlSessionFactory sqlSessionFactory = 
        new SqlSessionFactoryBuilder().build(inputStream);

    MemberDao memberDao = new MemberDao();
    memberDao.setSqlSessionFactory(sqlSessionFactory);
    
    List<Member> list = memberDao.selectList();
    
    for (Member m : list) {
      if (!m.getEmail().equals(email)) {
        System.out.println("등록되지 않은 사용자입니다.");
        return false;
      } else if (!m.getPassword().equals(pass)) {
        System.out.println("암호가 맞지 않습니다.");
        return false;
      } else {
        aa = m.getNo();
        System.out.printf("환영합니다. %s님\n", m.getName());
        return true;
      }
    }
    return false;
  }
  
  static boolean doJoin() throws Exception {
    InputStream inputStream = Resources.getResourceAsStream(
        "conf/mybatis-config.xml");
    SqlSessionFactory sqlSessionFactory = 
        new SqlSessionFactoryBuilder().build(inputStream);

    MemberDao memberDao = new MemberDao();
    memberDao.setSqlSessionFactory(sqlSessionFactory);
    
    Member member = new Member();
    
    System.out.print("이름: ");
    member.setName(keyScan.nextLine());
    while (true) {
      System.out.print("이메일: ");
      String input = keyScan.nextLine();
      if (input.matches("^[_a-zA-Z0-9-\\.]+@[\\.a-zA-Z0-9-]+\\.[a-zA-Z]+$")) {
        member.setEmail(input);
        break;
      } else {
        System.out.println("이메일 형식이 맞지 않습니다.");
      }
    }
    
    while (true) {
      System.out.print("암호: ");
      String input = keyScan.nextLine();
      if (Pattern.matches("^(?=.*[0-9])(?=.*[?!@])(?=.*[a-zA-Z]).{4,10}$", input)) {
        member.setPassword(keyScan.nextLine());
        break;
      } else {
        System.out.println("암호 형식이 맞지 않습니다.");
      }
    }
    
    while (true) {
      System.out.print("전화: ");
      String input = keyScan.nextLine();
      if (Pattern.matches("[0-9]{3,4}[-][0-9]{4}", input)) {
        member.setPassword(keyScan.nextLine());
        break;
      } else {
        System.out.println("전화 형식이 맞지 않습니다.");
      }
    }
    
    memberDao.insert(member);
    System.out.println("회원 가입되었습니다.");
    return false;
  }
  
  
}
