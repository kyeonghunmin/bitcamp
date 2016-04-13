// 주제 : Exception 예외 던지고 받기

package step19;

public class Test9 {
  public static void main(String[] args) { //throws Exception {
    MyClass obj = new MyClass();
    
    // Exception 예외는 반드시 처리해야 한다.
    // => try ~ catch ~ 로 처리하든
    // => 메서드 선언부에 어떤 예외가 발생하는 지 명시하든
    // 예) void main(String[] args) throws Exception {...}
    // obj.m2();

    try {
      obj.m2();
    } catch (Exception e) {
      System.out.println("m2에서 오류발생");
    }
  }
}
