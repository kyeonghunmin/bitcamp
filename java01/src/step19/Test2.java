// 주제 : 예외 처리 후

package step19;

public class Test2 {
  public static void main(String[] args) {
    Calculator1 calc = new Calculator1();
    calc.plus(10);
    // 예외 상황을 일으킬 수 있는 코드를
    // try {} 블록 안에 둔다.
    // 예외 상황을 처리하는 코드를
    //catch (예외타입) {} 블록 안에 둔다.
    try {
      calc.divide(2);
      System.out.println(calc.result);
    } catch (ArithmeticException e) {
      System.out.println("나누기 오류 발생");
    }
  }
}

/*
* 예외 처리
try {
  명령
} catch (예외타입 변수) {
  예외처리 코드
}

=> try 블록 안에 있는 명령을 실행하다가 오류가 발생한다.
=> 즉시 실행을 멈추고 catch 블록으로 이동한다.
=> 이때 오류 내용은 인스턴스에 저장되어 있는데,
   catch의 파라미터로 그 인스턴스가 넘어온다.
   당연히, 오류의 타입에 따라 구분하여 파라미터를 선언해야 한다.
=> catch 블록을 실행한다.
=> 그리고 다음 명령을 계속 실행한다.
   => "예외가 발생했다고 결코 멈추지 않는다."

* 예외 처리의 미션
- 시스템에 예외가 발생하더라도 멈추지 않고 계속 실행하게 만드는 것.

* 예외 처리의 비전
- 예외의 관리를 용이하게 하는 것.
  => 기존 방식은 일반 코드와 예외를 처리하는 코드가
     섞여 있어서 코드 가독성이 떨어졌다.
  => 일반 코드에서 예외 처리 코드를 분리하여 표현한다.
     => 코드의 가독성을 높힌다.




*/
