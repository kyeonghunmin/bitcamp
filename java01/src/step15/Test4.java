// 주제 : 다형적 변수

package step15;

public class Test4 {
  public static void main(String[] args) {
    DeveloperCalculator c = new DeveloperCalculator();

    // 상위 클래스의 레퍼런스는 하위 클래스의 인스턴스를 가리킬 수 있다.
    CalculatorPlus c2 = new DeveloperCalculator();  // 가능
    Calculator c3 = new DeveloperCalculator();      // 가능
    // c2, c3 변수가 상위 클래스를 의미하기 때문에 가능하다.
    Calculator c4 = new CalculatorPlus();           // 가능

    // 하위 클래스의 레퍼런스는 상위 클래스의 인스턴스를 가리킬 수 없다.
    // DeveloperCalculator c5 = new CalculatorPlus();  // 오류
    // DeveloperCalculator c6 = new Calculator();      // 오류
    // CalculatorPlus c7 = new Calculator();           // 오류
  }
}

/*
다형성 - 다형적 변수(polymorphic variables)
=> 레퍼런스 변수에 다양한 인스턴스 주소를 저장할 수 있다.
=> 규칙
   상위 클래스의 레퍼런스는 하위 클래스의 인스턴스 주소를 저장할 수 있다.
*/
