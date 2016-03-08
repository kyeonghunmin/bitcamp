// 주제 : 수퍼 클래스에 기본 생성자가 없을 때 오류 발생하는 상황

package step14.exam09;

public class Test {
  public static void main(String[] args) {
    B p = new B();
    System.out.println(p.v1);
    System.out.println(p.v2);
    System.out.println(p.v3);
    System.out.println(p.v4);
    System.out.println(p.v5);
  }
}
