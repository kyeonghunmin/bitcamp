package bitcamp.pms.controller;

import java.util.Scanner;
import java.sql.Date;
import bitcamp.pms.domain.Project;

public class ProjectController {
  private Scanner keyScan;
  private Project[] projects = new Project[1000];
  private int count = 0;

  public void setScanner(Scanner keyScan) {
    this.keyScan = keyScan;
  }

  public void service() {
    String input = null;
    while (true) {
      input = prompt();
      if (input.equals("main")) {
        break;
      } else if (input.equals("add")) {
        doAdd();
      } else if (input.equals("list")) {
        doList();
      } else if (input.equals("update")) {
        doUpdate();
      } else if (input.equals("delete")) {
        doDelete();
      } else {
        System.out.println("지원하지 않는 명령어입니다.");
      }
    }
  }

  private String prompt() {
    System.out.print("프로젝트관리> ");
    return keyScan.nextLine();
  }

  private void doAdd() {
    while (true) {
      Project project = new Project();
      System.out.print("프로젝트명? ");
      project.setTitle(keyScan.nextLine());
      System.out.print("시작일? ");
      project.setStartDate(Date.valueOf(keyScan.nextLine()));
      System.out.print("종료일? ");
      project.setEndDate(Date.valueOf(keyScan.nextLine()));
      System.out.print("설명? ");
      project.setDescription(keyScan.nextLine());

      if (confirm("저장하시겠습니까?(y/n) ")) {
        projects[count++] = project;
        System.out.println("저장하였습니다.");
        break;
      } else {
        System.out.println("저장을 취소하였습니다.");
        break;
      }
    }
  }

  private void doList() {
    System.out.println("--------------------------------");
    for (int i = 0; i < count; i++) {
      if (projects[i] != null) {
        System.out.printf("%d, ", i);
        System.out.println(projects[i]);
      }
    }
  }

  private void doUpdate() {
    System.out.print("변경할 회원 번호는? ");
    String input = keyScan.nextLine().toLowerCase();

    if (confirm("변경하시겠습니까?(y/n) ")) {
      Project project = new Project();
      System.out.printf("프로젝트명(%s)? ", projects[Integer.parseInt(input)].getTitle());
      project.setTitle(keyScan.nextLine());
      System.out.printf("시작일(%s)? ", projects[Integer.parseInt(input)].getStartDate());
      project.setStartDate(Date.valueOf(keyScan.nextLine()));
      System.out.printf("종료일(%s)? ", projects[Integer.parseInt(input)].getEndDate());
      project.setEndDate(Date.valueOf(keyScan.nextLine()));
      System.out.printf("설명(%s)? ", projects[Integer.parseInt(input)].getDescription());
      project.setDescription(keyScan.nextLine());

      projects[Integer.parseInt(input)] = project;
      System.out.println("변경하였습니다.");
    } else {
      System.out.println("변경 취소하였습니다.");
    }
  }

  private void doDelete() {
    System.out.print("삭제할 프로젝트의 번호는? ");
    String input = keyScan.nextLine().toLowerCase();
    if (confirm("삭제하시겠습니까?(y/n) ")) {
      projects[Integer.parseInt(input)] = null;
      count--;
      for (int i = 0; i < count; i++) {
        if (projects[i] == null) {
          projects[i] = projects[i + 1];
          projects[i + 1] = null;
        }
      }
      System.out.println("삭제하였습니다.");
    } else {
      System.out.println("삭제를 취소하였습니다.");
    }
  }

  private boolean confirm(String message) {
    while (true) {
      System.out.printf("%s ", message);
      String input = keyScan.nextLine().toLowerCase();
      if (input.equals("y")) {
        return true;
      } else if (input.equals("n")) {
        return false;
      } else {
        System.out.println("잘못된 명령어입니다.");
      }
    }
  }
}
