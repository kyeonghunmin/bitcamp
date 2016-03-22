package step20.exam05;

public class Outer1 {
  static int v1;
  static void m1() {}
  int v2;
  void m2() {}



  // 1) top level inner class
  static class Inner1 {
    void test() {
      v1 = 10;
      m1();
    }
  }

  // 2) member inner class
  class Inner2 {}

  public void m() {
    // 3) local inner class
    class Inner3 {}

    // 4) anonymous inner class
    Object obj = new Object() {};

  }
}
