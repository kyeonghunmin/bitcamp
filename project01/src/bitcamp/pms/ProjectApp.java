package bitcamp.pms;

import java.util.Scanner;
import bitcamp.pms.controller.MemberController;
import bitcamp.pms.controller.ProjectController;
import bitcamp.pms.controller.TaskController;

public class ProjectApp {
  static Scanner keyScan = new Scanner(System.in);
  static MemberController memberController = new MemberController();
  static ProjectController projectController = new ProjectController();
  static TaskController taskController = new TaskController();

  public static void main(String[] args) {
    memberController.setScanner(keyScan);
    projectController.setScanner(keyScan);
    taskController.setScanner(keyScan);


    String input = null;

    do {
      input = prompt();
      processCommand(input);
    } while (!input.equals("quit"));

    keyScan.close();
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
    System.out.println("안녕히 가세요!");
  }

  static void doError() {
    System.out.println("잘못된 명령어입니다.");
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
      case "task":
        taskController.service();
        break;
      default:
        System.out.println("없는 메뉴입니다.");
    }
  }
}
