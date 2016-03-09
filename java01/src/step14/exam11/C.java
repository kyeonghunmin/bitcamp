package step14.exam11;

public class C extends B {
  @Override // 컴파일러에게 오버라이드 검사 요청
  public void m2() {
    System.out.println("C.m2()");
  }

  // 새 메서드 추가
  public void m4() {
    System.out.println("C.m4()");
  }

  public void test() {
    // 의미
    // => this 레퍼런스에 저장된 인스턴스를 가지고 m3() 메서드를 호출한다.
    // => m3() 메서드 호출 과정
    // => 1) 현재 클래스에서 찾아본다.
    // => 2) 없으면, 상속받은 상위 클래스에서 찾아본다. (접근 권한이 있을 때)
    // => 3) 없다면 상위 클래스의 상위 클래스를 찾아본다.
    // * 메서드를 호출할 때마다 클래스 계층 구조(class hierarchy)를
    //   훑기 때문에 C와 같은 functional 언어보다 실행 속도가 느리다.
    this.m3();    // B.m3()
    this.m2();

    // 재정의(override)하기 전에 메서드
    // => 지정된 메서드를 수퍼 클래스에서 상위 클래스로 찾아봐라.
    // 수퍼 클래스부터 계층 구조 위로 따라가면서 해당 메서드를 찾아라.
    super.m2(); // 현재 클래스에 정의된 m2()는 무시하고
                // 상위 클래스부터 위쪽으로 m2()를 찾는다.

    super.m1(); // 현재 클래스에 메서드가 있든 없든 상관없이
                // 상위 클래스부터 위쪽으로 m2()를 찾는다.

    // super.super.m1();  // 오류, super.은 수퍼 클래스를 말하는 것이 아님.

    this.m4();  // 현재 클래스부터 상위 클래스로 따라 올라가면서
                // 메서드를 찾는다.
    // super.m4();  // 에러, super는 상위 클래스부터 따라 올라가면서
                    // 메서드를 찾기 때문이다.
  }
}
