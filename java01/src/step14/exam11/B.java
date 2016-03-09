package step14.exam11;

public class B extends A {
  @Override // 컴파일러에게 오버라이드 검사 요청
  public void m1() {
    System.out.println("B.m1()");
  }

  // 새 메서드 추가
  public void m3() {
    System.out.println("B.m3()");
  }
}
