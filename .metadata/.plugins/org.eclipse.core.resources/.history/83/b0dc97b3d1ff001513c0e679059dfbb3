package step31;

import java.util.Scanner;

public class Test02 {

  public static void main(String[] args) {
    Scanner keyScan = new Scanner(System.in);
    
    // 정규식 (정규표현식; Reqular Expression)에서 역슬래시를 문자로 사용하려면
    // "\\" 식으로 지정해야 한다.
    // 예) "a\\b\\c" --> a\b\c를 출력한다.
    // String regex = "a\\b\\c"; // -> a\b\c 가 리턴된다. (정규식 표현이 아님)
    // 이유?
    // 자바 문자열에서 \\는 '\' 문자를 의미한다.
    // 만약 \\를 자바 문자열로 표현하고 싶다면 "\\\\"로 해야 한다.
    
    // 해결책
    String regex = "a\\\\b\\\\c";
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
