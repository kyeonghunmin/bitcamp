// 주제 : 하위 클래스에서 부모 클래스의 protected 멤버에 접근하기

package step14.exam10; // 상위 패키지에 마음대로 접근할 수 없다.
                       // 패키지명이 정확히 같아야만 같은 패키지로 취급한다.

import step14.Calculator2;

public class Childcalc extends Calculator2 {
  public void testAccess() {

    // 1) public 멤버에 접근하기
    this.remainder(3); // this 생략 가능

    // 2) (default) 멤버에 접근하기
    // this.abs2();  // 오류 (패키지가 달라서 접근 불가)

    // 3) protected 멤버에 접근하기
    this.abs();

    // 4) private 멤버에 접근하기
    this.abs3();
  }
}

/*
캡슐화 접근 관리
- private : 그 클래스 내부에서만 접근 가능
- (default) : 같은 패키지에 소속된 클래스만 접근 가능
- protected : 같은 패키지 + 자식클래스만 접근 가능
- public : 모두 접근 가능
*/
