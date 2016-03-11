package bitcamp.pms;

import java.util.Scanner;
import bitcamp.pms.domain.Member;

public class ProjectApp {
  static Scanner keyScan = new Scanner(System.in);
  static String input = null;
  static int count = 0;
  static Member[] members = new Member[1000];
  static int[] index = new int[1000];
  static String input2 = null;

  public static void main(String[] args) {
    do {
      input = prompt();

      if (input.equals("add")) {
        doAdd();
      } else if (input.equals("quit")) {
        doQuit();
        break;
      } else if (input.equals("list")) {
        doList();
      } else if (input.equals("delete")) {
        doDelete();
      } else if (input.equals("update")) {
        doUpdate();
      } else {
        doError();
      }
    } while(true);
  }

  static boolean confirm(String message, boolean strictMode) {
    String input = null;
    do {
      System.out.printf("%s(y/n) ", message);
      input = keyScan.nextLine().toLowerCase();

      if (input.equals("y")) {
        return true;
      } else if (input.equals("n")) {
        return false;
      } else {
        if (!strictMode) {
          return false;
        }
        System.out.println("잘못된 명령어입니다.");
      }
    } while(true);
  }

  static String prompt() {
    System.out.print("명령> ");
    return keyScan.nextLine().toLowerCase();
  }

  static void doAdd() {
    while (count < 1000) {
      Member member = new Member();

      System.out.print("이름? ");
      member.setName(keyScan.nextLine());
      System.out.print("이메일? ");
      member.setEmail(keyScan.nextLine());
      System.out.print("암호? ");
      member.setPassword(keyScan.nextLine());
      System.out.print("전화? ");
      member.setTel(keyScan.nextLine());

      if (confirm("저장하시겠습니까?", true)) {
        members[count++] = member;
        index[count] = count;

        System.out.println("저장하였습니다.");
        break;
      } else {
        System.out.println("저장을 취소하였습니다.");
        break;
      }
    }
  }

  static void doQuit() {
    System.out.println("안녕히 가세요!");
  }

  static void doList() {
    System.out.println("--------------------------------");
    for (int i = 0; i < count; i++) {
      if (members[i] != null) {
        System.out.printf("%d, ", index[i]);
        System.out.println(members[i]);
      }
    }
  }

  static void doDelete() {
    System.out.print("삭제할 회원의 번호는? ");
    input = keyScan.nextLine().toLowerCase();
    System.out.print("정말로 삭제하시겠습니까?(y/n) ");
    input2 = keyScan.nextLine().toLowerCase();
    if (input2.equals("y")) {
      members[Integer.parseInt(input)] = null;
      count--;
      for (int i = 0; i < count; i++) {
        if (members[i] == null) {
          members[i] = members[i + 1];
          members[i + 1] = null;
        }
      }
      System.out.println("삭제하였습니다.");
    } else if (input2.equals("n")) {
      System.out.println("삭제를 취소하였습니다.");
    } else {
        System.out.println("잘못된 명령어입니다.");
    }
  }

  static void doUpdate() {
    System.out.print("변경할 회원 번호는? ");
    input = keyScan.nextLine().toLowerCase();
    Member member = new Member();
    System.out.printf("이름(%s)? ", members[Integer.parseInt(input)].getName());
    member.setName(keyScan.nextLine());
    System.out.printf("이메일(%s)? ", members[Integer.parseInt(input)].getEmail());
    member.setEmail(keyScan.nextLine());
    System.out.printf("암호(%s)? ", members[Integer.parseInt(input)].getPassword());
    member.setPassword(keyScan.nextLine());
    System.out.printf("전화(%s)? ", members[Integer.parseInt(input)].getTel());
    member.setTel(keyScan.nextLine());
    System.out.print("변경하시겠습니까?(y/n) ");
    input2 = keyScan.nextLine().toLowerCase();
    if (input2.equals("y")) {
      members[Integer.parseInt(input)] = member;
      System.out.println("변경하였습니다.");
    } else if (input2.equals("n")) {
        System.out.println("변경을 취소했습니다.");
    } else {
        System.out.println("잘못된 명령어입니다.");
    }
  }

  static void doError() {
    System.out.println("잘못된 명령어입니다.");
  }
}
