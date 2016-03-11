package bitcamp.pms.controller;

import java.util.Scanner;
import bitcamp.pms.domain.Task;

public class TaskController {
  private Scanner keyScan;
  private Task[] tasks = new Task[1000];
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
    System.out.print("테스크관리> ");
    return keyScan.nextLine();
  }

  private void doAdd() {
    while (true) {
      Task task = new Task();
      System.out.print("테스크명? ");
      task.setTitle(keyScan.nextLine());
      System.out.print("설명? ");
      task.setDescription(keyScan.nextLine());

      if (confirm("저장하시겠습니까?(y/n) ")) {
        tasks[count++] = task;
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
      if (tasks[i] != null) {
        System.out.printf("%d, ", i);
        System.out.println(tasks[i]);
      }
    }
  }

  private void doUpdate() {
    System.out.print("변경할 테스크 번호는? ");
    String input = keyScan.nextLine().toLowerCase();

    if (confirm("변경하시겠습니까?(y/n) ")) {
      Task task = new Task();
      System.out.printf("테스크명(%s)? ", tasks[Integer.parseInt(input)].getTitle());
      task.setTitle(keyScan.nextLine());
      System.out.printf("설명(%s)? ", tasks[Integer.parseInt(input)].getDescription());
      task.setDescription(keyScan.nextLine());

      tasks[Integer.parseInt(input)] = task;
      System.out.println("변경하였습니다.");
    } else {
      System.out.println("변경 취소하였습니다.");
    }
  }

  private void doDelete() {
    System.out.print("삭제할 테스크의 번호는? ");
    String input = keyScan.nextLine().toLowerCase();
    if (confirm("삭제하시겠습니까?(y/n) ")) {
      tasks[Integer.parseInt(input)] = null;
      count--;
      for (int i = 0; i < count; i++) {
        if (tasks[i] == null) {
          tasks[i] = tasks[i + 1];
          tasks[i + 1] = null;
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
