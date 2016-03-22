// 주제 : 같은 멤버인 메서드에서 중첩 클래스 사용하기

package step20.exam04;

public class Test2 {
  public static void main(String[] args) {
    Outer2 p = new Outer2();
    Outer2.Inner p2 = p.new Inner();
    p2.test2();

  }
}
