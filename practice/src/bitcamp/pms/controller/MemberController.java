package bitcamp.pms.controller;

import java.util.ArrayList;
import java.util.Scanner;

import bitcamp.pms.domain.Member;

public class MemberController {
  private Scanner keyScan;
  private ArrayList<Member> members;
  
  public MemberController() {
    members = new ArrayList<>();
  }
  
  public void setScanner(Scanner keyScan) {
    this.keyScan = keyScan;
  }
  
  public void service() {
    String input = null;
    do {
      input = prompt();
      try {
        switch (input) {
          case "add": doAdd(); break;
          case "list": doList(); break;
          case "update": doUpdate(); break;
          case "delete": doDelete(); break;
          case "main": break;
          default:
            System.out.println("지원하지 않는 명령어입니다.");
        }
      } catch (IndexOutOfBoundsException e) {
        System.out.println("유효하지 않은 인덱스입니다.");
      }
    } while (!input.equals("main"));
  }
  
  private String prompt() {
    System.out.print("회원관리> ");
    return keyScan.nextLine().toLowerCase();
  }
  
  private void doAdd() {
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
}
