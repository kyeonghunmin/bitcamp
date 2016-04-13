// 주제 : final 메서드의 의미

package step12;

public class Exam14 {
  class MyClass extends Car11 {
    @Override
    public int plus(final int a, final int b) {
      return a + b + 100;
    }
  }

  public static void main(String[] args) {
    int result = Car10.plus(20, 30);
  }
}
/*
# 메서드 앞에 final을 붙이는 경우
- 하위 클래스가 재정의하는 것을 막기 위함이다.
- final 클래스와 마찬가지로 보안상 재정의하지 말아야 하는 메서드에 대해
  final을 붙이면 된다.
*/