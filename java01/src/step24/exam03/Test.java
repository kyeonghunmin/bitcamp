package step24.exam03;

public class Test implements B {
  public void m1() {} // B가 상속받은 A 인터페이스의 메서드도 구현해야 한다.
  public void m2() {} // B가 상속받은 A 인터페이스의 메서드도 구현해야 한다.
  public void m3() {}

}

// 인터페이스 구현
// => B 인터페이스의 메서드도 구현해야 하지만,
//    B의 수퍼 인터페이스인 A의 메서드도 구현해야 한다.
