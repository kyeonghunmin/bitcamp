package practice;

import java.util.Scanner;

public class ProjectApp {
  static Scanner keyScan = new Scanner(System.in);
  static ProjectController projectController = new ProjectController();

  public static void main(String[] args) {
    projectController.setScanner(keyScan);

    String input;
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
    System.out.println("안녕히 가세요");
  }

  static void doAbout() {
    System.out.print("비트캠프 80기 프로젝트 관리 시스템");
  }

  static void doError() {
    System.out.print("올바르지 않은 명령어입니다.");
  }

  static void doGo(String[] cmds) {
    if (cmds.length < 2) {
      System.out.println("메뉴 이름을 지정하세요.");
      return;
    }

    switch (cmds[1]) {
      case "project":
        projectController.service();
        break;
      default:
        System.out.println("없는 메뉴입니다.");
    }
  }
}
