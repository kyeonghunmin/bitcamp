// 주제 : super와 this 키워드

package step14.exam11;

public class Test {
  public static void main(String[] args) {
    C p = new C();
    p.test();
  }
}

/*
this.메서드();
- 현재 클래스부터 상위 클래스로 따라 올라가면서 메서드를 찾는다.

super.메서드();
- 부모 클래스부터 상위 클래스로 따라 올라가면서 메서드를 찾는다.
*/
