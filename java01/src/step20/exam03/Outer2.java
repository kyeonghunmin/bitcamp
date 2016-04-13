// 주제 : top level inner class 선언

package step20.exam03;

public class Outer2 {
  static int no;

  static void m() {
    System.out.println("Outer2.m()");
  }
  
  static class Inner {
    public static void m() {
      System.out.println("Inner.m()");
    }

    public void m2() {
      System.out.println("Inner.m2()");
    }
  }
}
