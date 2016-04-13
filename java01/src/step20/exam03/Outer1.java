package step20.exam03;

public class Outer1 {
  // 1) top level inner class
  // => static 멤버이다.
  // => 클래스 이름으로 사용 가능.
  static class TopLevelInner {

  }

  // 2) member inner class
  // => instance 멤버이다.
  // => 인스턴스가 있어야만 사용 가능.
  class MemberInner {

  }

  public void m() {
    // 3) local inner class
    // => 메서드의 로컬 변수처럼 메서드 안에서만 사용 가능.
    class LocalInner {

    }
  }

  // 4) anonymous inner class
  // => 클래스 이름이 없기 때문에 클래스 선언과 동시에 인스턴스를 생성해야 한다.
  // => 문법
  // new [수퍼클래스|인터페이스](생성자파라미터값,...) {
  //   클래스 멤버 선언
  // }
  Object obj = new Object() {   // Object의 생성자 호출
    public void m() {
    }
  };

  public void test() {
    Object = p;
    p = new ();
    p = new ();
  }
}
