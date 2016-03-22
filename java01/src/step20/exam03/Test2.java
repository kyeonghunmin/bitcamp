// 주제 : top level inner class 사용 2

package step20.exam03;

public class Test2 {
  public static void main(String[] args) {
    // top level inner class의 인스턴스 생성하기
    Outer2.Inner p = new Outer2.Inner();
    p.m2();

  }
}
