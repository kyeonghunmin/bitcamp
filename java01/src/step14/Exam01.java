// 주제 : 상속

package step14;

public class Exam01 {
  public static void main(String[] args) {
    // 기존 클래스 사용
    // 2 * 3 + 7  % 3 = ? (연산자 우선순위 무시, 순차적으로 계산)
    Calculator calc = new Calculator();
    calc.plus(2);
    calc.multiple(3);
    calc.plus(7);
    // 나머지를 구하는 메서드가 없기 때문에 기존 클래스로 계산할 수 없다.
    System.out.println(calc.result);

    System.out.println("----------------");

    // 기존 클래스의 기능을 확장한 서브 클래스를 사용한다.
    Calculator2 calc2 = new Calculator2();
    calc2.plus(2);
    calc2.multiple(3);
    calc2.plus(7);
    calc2.remainder(3);
    // 나머지를 구하는 메서드가 없기 때문에 기존 클래스로 계산할 수 없다.
    System.out.println(calc2.result);
  }
}

/* 상속
- 기존 클래스의 기능을 확장하는 문법.
- 이점
  => 기존 코드의 재사용. (개발비용 절감효과)
  => 기존 코드를 손대지 않기 때문에 새 기능 추가에 따른 위험도가 덜하다.
  => 기능 확장이 쉽다.
- 종류
  => 슈퍼 클래스에서 하위 클래스로 확장하는 것을 "specialization" 이라 한다.
  => 서브 클래스들의 공통점을 추출해 수퍼 클래스를 정의하는 것을
     "generalization" 이라 한다.
*/
