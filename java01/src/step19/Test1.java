// 주제 : 예외 처리 전

package step19;

public class Test1 {
  public static void main(String[] args) {
    Calculator1 calc = new Calculator1();
    calc.plus(10);
    calc.divide(0); // 계산 오류 발생
    // JVM : 예외 상황을 보고하고, 즉시 실행을 종료한다.


    System.out.println(calc.result);
  }
}

/*
예외 상황에 대한 JVM의 태도
- 개인 프로그램인 경우 즉시 실행을 멈춰도 상관없다.
- 서비스 같은 여러 사용자가 동시에 사용하는 공용 프로그램인 경우
  실행을 멈추는 것은 매우 치명적인 상황이 된다.
- 해결책?
  => 개발자가 예외 상황을 다룰 수 있는 문법을 제시
  => 예외 처리 문법
*/
