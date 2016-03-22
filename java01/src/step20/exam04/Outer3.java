// member inner class 사용하기

package step20.exam04;

public class Outer3 {
  int no = 20;

  public void m1() {
    System.out.println("Outer3.m()");
  }

  public void m2() {
    class Inner {
      int no = 100;
      public void test(int no) {
        System.out.println(no);
        System.out.println(this.no);
        System.out.println(Outer3.this.no);
      }
    }
    Inner p = new Inner();
    p.test(8888);
    this.m1();
  }
}
