// 주제 : 상속 - Generalization (일반화) - 추상 클래스

package step14.exam04;

public class Test {
  public static void main(String[] args) {
    // 승용차 정보를 저장하기 위해 인스턴스 생성
    Sedan c1 = new Sedan();

    // 트럭 정보를 저장하기 위해 인스턴스 생성
    Truck c2 = new Truck();

    // 다음은 무슨 정보를 저장하기 위해 생성하는가?
    // 원래 Car의 존재이유가 무엇인가?
    // Car c3 = new Car();
    // Car 클래스는 추상 클래스이기 때문에 인스턴스를 생성할 수 없다.
  }
}

/*
Generalization의 목적
- 여러 클래스들에 존재하는 공통 코드를 뽑아서 수퍼 클래스로 정의함으로써
  코드의 관리를 쉽게하기 위함. => 코드 정리
- 예) Car 클래스는 Sedan과 Truck의 코드 정리를 위해 만든 클래스이다.
      Car 클래스를 직접 사용하려고 만든 클래스가 아니다.
      그래서 Car 클래스는 사용되어서는 안된다.
      단지 원래의 목적인 하위 클래스들에게 공통 속성이나 기능을 상속해주는
      역할만 하도록 만들어져야 한다.
      => 추상 클래스

abstraction class
- 직접 인스턴스를 생성할 수 없다.
- 추상 메서드를 가질 수 있다.
- 서브 클래스에게 속성이나 메서드를 상속해주는 역할을 한다.
- 문법 : 클래스 선언 앞에 abstract 를 붙인다.
  예) abstract class Myclass {}

Car 클래스를 추상 클래스로 만든다.
- Car의 인스턴스를 생성할 수 없다.
- 그러나 Sedan과 Truck에게 상속을 해주는 역할은 그대로 유효하다.

* Generalization을 수행할 때 만든 수퍼 클래스를 별도로 사용할 필요가
  없기 때문에 추상 클래스를 사용하게 된다.
*/
