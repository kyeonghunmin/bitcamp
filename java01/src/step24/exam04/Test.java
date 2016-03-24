package step24.exam04;

public class Test implements C {
  public void m1() {} // A와 B 만족
  public void m2() {} // A 만족
  public void m3() {} // B 만족
  public void m4() {} // C 만족


}

// 인터페이스 구현
// => 클래스 입장에서는 구현되지 않은 메서드이기 때문에
//    다중 인터페이스에서 서로 중복되는 메서드가 있다고 할지라도
//    구현하는데 문제가 되지 않는다.
