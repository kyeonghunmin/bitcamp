package bitcamp.pms;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.Scanner;

import bitcamp.pms.context.ApplicationContext;
import bitcamp.pms.context.request.RequestHandler;
import bitcamp.pms.context.request.RequestHandlerMapping;

public class ProjectApp {
  static ApplicationContext appContext;
  static RequestHandlerMapping requestHandlerMapping;
  static Scanner keyScan = new Scanner(System.in);

  public static void main(String[] args) {
    appContext = new ApplicationContext("bitcamp.pms");
    requestHandlerMapping = new RequestHandlerMapping(appContext);
    appContext.addBean("stdinScan", keyScan);

    String input;
    do {
      input = prompt();
      processCommand(input);
    } while (!input.equals("quit"));

    keyScan.close(); // 항상 다 쓴 자원은 해제해야 한다.
  }

  static void processCommand(String input) {
    String[] cmds = input.split(" ");

    if (cmds[0].equals("quit")) {
      doQuit();
    } else if (cmds[0].equals("about")) {
      doAbout();
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
}
