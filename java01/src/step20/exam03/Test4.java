// 주제 : member inner class 사용
// => 인스턴스 중첩 클래스

package step20.exam03;

public class Test4 {
  public static void main(String[] args) {
    Outer3 p = new Outer3();
    p.no = 20;
    p.m();
    
    Outer3.Inner p2 = p.new Inner();
    p2.m2();
  }
}
