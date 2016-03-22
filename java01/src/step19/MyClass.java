package step19;

public class MyClass {
  public void m1() {
    throw new RuntimeException("ok");
  }

  public void m2() throws Exception {
    throw new Exception("오호라");
  }
}
