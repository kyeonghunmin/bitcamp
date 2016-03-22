package step20.exam03;

public class Outer1 {
  // 1) top level inner class
  static class TopLevelInner {

  }

  // 2) member inner class
  class MemberInner {

  }

  public void m() {
    // 3) local inner class
    class LocalInner {

    }
  }

  // 4) anonymous inner class
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
