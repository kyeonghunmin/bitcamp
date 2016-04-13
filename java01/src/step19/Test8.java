// 주제 : RuntimeException 예외 던지고 받기

package step19;

public class Test8 {
  public static void main(String[] args) {
    MyClass obj = new MyClass();
    
    //1) RuntimeException 예외를 처리하지 않으면
    // 자동으로 상위 호출자(JVM)에게 전달한다.
    // obj.m1();

    //2) try ~ catch로 예외 처리를 할 수도 있다.
    try {
      obj.m1();
    } catch (RuntimeException e) {
      System.out.println("m1에서 오류발생");
    }
  }
}
