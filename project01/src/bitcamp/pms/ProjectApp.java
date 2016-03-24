package bitcamp.pms;

import java.util.Scanner;
import bitcamp.pms.controller.MemberController;
import bitcamp.pms.controller.ProjectController;

public class ProjectApp {
  static Scanner keyScan = new Scanner(System.in);
  static MemberController memberController;
  static ProjectController projectController;

  public static void main(String[] args) {
    try {
      memberController = new MemberController();
      projectController = new ProjectController();
    } catch (Exception e) {
      System.out.println("데이터 파일을 읽는데 오류가 발생했습니다.");
    }

    memberController.setScanner(keyScan); // <-- 의존 객체 주입
    projectController.setScanner(keyScan);

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
    try {
      memberController.save();
      projectController.save();
      System.out.println("데이터를 저장했습니다.");
    } catch (Exception e) {
      System.out.println("데이터 저장에 실패했습니다.");
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

    switch (cmds[1]) {
      case "member":
        memberController.service();
        break;
      case "project":
        projectController.service();
        break;
      default:
        System.out.println("없는 메뉴입니다.");
    }

  }
}
