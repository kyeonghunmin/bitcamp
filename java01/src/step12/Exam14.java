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
