// final의 활용 4

package step12;

public class Car11 {

  // 메서드 앞에 final을 붙인다.
  // => 하위 클래스에서 재정의하지 못하도록 막는다.
  public final int plus(final int a, final int b) {
    return a + b;
  }

}
