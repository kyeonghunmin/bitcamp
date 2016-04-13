package step31;

import java.util.Scanner;

public class Test09 {

  public static void main(String[] args) {
    Scanner keyScan = new Scanner(System.in);


    // String regex = "(?=.*[a-zA-Z])(?=.*[0-9])(?=.*[!@?]).{4,10}";
    // --> 첫 문자는 a 또는 b, 두 번째 문자는 x 또는 y
    String regex = "(\\d{2,4}-)?\\d{3,4}-\\d{4}";
    
    String input = null;
    
    while (true) {
      System.out.print("입력: ");
      input = keyScan.nextLine();
      if (input.equals("quit"))
        break;
      System.out.println(input.matches(regex));
    }
    
    keyScan.close();
  }

}
