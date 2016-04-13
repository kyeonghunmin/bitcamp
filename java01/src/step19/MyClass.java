package step19;

public class MyClass {
  public void m1() {
    // 호출자에게 예외를 던진다.
    // throw [Throwable의 인스턴스];
    throw new RuntimeException("ok");
  }

  public void m2() throws Exception {
    // 호출자에게 Exception 예외를 던진다.
    // => Exception 예외를 던질 때는 반드시 메서드 선언부에
    //    어떤 예외를 던지는지 명시해야 한다.
    // => 문법
    //    void 메서드명 throws 예외1, 예외2, 예외3 { ... }
    throw new Exception("오호라");
  }
}
