package bitcamp.pms;

import java.util.Scanner;
import java.util.HashMap;
import bitcamp.pms.controller.MenuController;
import bitcamp.pms.controller.MemberController;
import bitcamp.pms.controller.ProjectController;
import java.util.Collection;

public class ProjectApp {
  static HashMap<String,MenuController> menuMap = new HashMap<>();
  // MenuController 인터페이스를 사용하는 클래스들을 저장하겠다는 뜻.
  static Scanner keyScan = new Scanner(System.in);

  public static void main(String[] args) {
    // 메뉴 처리기를 menuMap에 등록한다.
    menuMap.put("member", new MemberController());
    menuMap.put("project", new ProjectController());

    Collection<MenuController> controllers = menuMap.values();
    for (MenuController controller : controllers) {
      try {
        controller.init();
      } catch (RuntimeException e) {
        System.out.println(e.getMessage());
      }
    }

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
    } else if (cmds[0].equals("go")) {
      doGo(cmds);
    } else {
      doError();
    }
  }

  static String prompt() {
    System.out.print("명령> ");
    return keyScan.nextLine().toLowerCase();
  }

  static void doQuit() {
    Collection<MenuController> controllers = menuMap.values();
    for (MenuController controller : controllers) {
      controller.destroy();
    }
    System.out.println("안녕히 가세요!");
  }

  static void doError() {
    System.out.println("올바르지 않은 명령어입니다.");
  }

  static void doAbout() {
    System.out.println("비트캠프 80기 프로젝트 관리 시스템!");
  }

  static void doGo(String[] cmds) {
    if (cmds.length < 2) {
      System.out.println("메뉴 이름을 지정하세요.");
      System.out.println("예) go member");
      return ;
    }

    // 작업에 필요한 재료를 준비
    HashMap<String,Object> paramMap = new HashMap<>();
    paramMap.put("stdin", keyScan);
    // 확장성을 고려하여 keyScan을 바로 service()로 넘기지 않고 맵에 담아서 넘긴다.

    MenuController controller = menuMap.get(cmds[1]);
    if (controller != null) {
      controller.service(paramMap);
    } else {
      System.out.println("없는 메뉴입니다.");
    }
  }
}
