// 주제 : Exception 예외 던지고 받기

package step19;

public class Test9 {
  public static void main(String[] args) { //throws Exception {
    MyClass obj = new MyClass();
    // obj.m2();

    try {
      obj.m2();
    } catch (Exception e) {
      System.out.println("m2에서 오류발생");
    }
  }
}
