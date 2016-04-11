package step23.step03;

// 서브 클래스에게 공통 필드나 메서드를 상속해주는 용도의 클래스이기 때문에
// 추상 클래스로 선언한다. (abstract)
// - 추상 클래스는 인스턴스를 생성할 수 없다.
public abstract class AbstractHello {
  // 어차피 서브 클래스에서 재정의할 메서드라면 수퍼 클래스에서 구현할 필요 없음
  // => 추상 메서드로 선언하라!
  // => 추상 메서드는 또 다른 의미로 서브 클래스에게 반드시 이 메서드를
  //    구현하라고 강제하는 문법이기도 하다.
  public abstract String greet(); // 추상 메서드 ({}를 생략한다)
}
