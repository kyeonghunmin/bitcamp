// 주제 : local inner class 선언

package step20.exam03;

public class Outer4 {
  int no;

  void m() {
    // local inner class
    class Inner {
      // local inner class는 static 메서드를 선언할 수 없음
      // public static void m() {
      //   System.out.println("Inner.m()");
      // }

      public void m2() {
        System.out.println("Inner.m2()");
      }
    }
    Inner p = new Inner();
    p.m2();
  }
}
