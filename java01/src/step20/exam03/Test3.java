// 주제 : top level inner class 사용 3

package step20.exam03;

import static step20.exam03.Outer2.Inner; // static 을 붙여 Inner 클래스 import

public class Test3 {
  public static void main(String[] args) {
    // top level inner class의 인스턴스 생성하기
    Inner p = new Inner();    // 외부클래스(Outer2)를 생략할 수 있음
    p.m2();

  }
}
