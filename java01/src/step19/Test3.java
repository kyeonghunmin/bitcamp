// 주제 : 예외 정보 다루기

package step19;

public class Test3 {
  public static void main(String[] args) {
    Calculator1 calc = new Calculator1();
    calc.plus(10);

    try {
      calc.divide(0);
      System.out.println(calc.result);
    } catch (ArithmeticException e) {
      System.out.println("나누기 오류 발생");
      System.out.println(e.getMessage()); // 간단한 오류 정보
      e.printStackTrace();                // 완전한 오류 정보
    }
  }
}

/*



*/
