// 주제 : top level inner class 사용

package step20.exam03;

public class Test1 {
  public static void main(String[] args) {
    Outer2.no = 20;     // static 변수 사용
    Outer2.m();         // static 메서드 사용
    Outer2.Inner.m();   // static inner 클래스 사용

  }
}
