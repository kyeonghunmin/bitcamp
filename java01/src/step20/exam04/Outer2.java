// member inner class 사용하기

package step20.exam04;

public class Outer2 {
  static void m() {

  }

  void m2() {
    Outer1.no1 = 10;
    no1 = 20;
    no2 = 30;
    m();
  }

  static int no1;
  int no2;

  class Inner {
    public void test2() {
      no1 = 100;
      m();
      no2 = 100;
      System.out.println("Inner.test2()");
    }
  }
}
