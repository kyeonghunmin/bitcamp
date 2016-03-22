// 주제 : RuntimeException 예외 던지고 받기

package step19;

public class Test8 {
  public static void main(String[] args) {
    MyClass obj = new MyClass();
    // obj.m1();

    try {
      obj.m1();
    } catch (RuntimeException e) {
      System.out.println("m1에서 오류발생");
    }
  }
}
