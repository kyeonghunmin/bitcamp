package step17.quiz;

import java.util.Scanner;

public class Yesno {
  private String yn;

  void setYn() {
    Scanner keyScan = new Scanner(System.in);
    System.out.print("정말 저장하시겠습니까? (y/n) ");
    this.yn = keyScan.nextLine();
  }

  boolean ynEquals() {
    return !(yn.equals("y")) && !(yn.equals("n")) &&
           !(yn.equals("Y")) && !(yn.equals("N")) ? true : false;
  }

  boolean yesEquals() {
    if (yn.equals("y") || yn.equals("Y")) {
      return true;
    }
    return false;

  }

  boolean noEquals() {
    if (yn.equals("n") || yn.equals("N")) {
      return true;
    }
    return false;
  }

}
