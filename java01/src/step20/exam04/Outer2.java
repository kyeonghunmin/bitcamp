// member inner class 사용하기
package step20.exam04;

public class Outer2 {
  static void m() { // 스태틱 멤버에서 접근하기
  }

  void m2() { // 인스턴스 멤버에서 접근하기
    Outer1.no1 = 10; // OK. 인스턴스 멤버는 스태틱 멤버에 당연히 접근 가능!
    no1 = 20; // OK.
    no2 = 30; // OK. 인스턴스 멤버 접근 가능!
    m2(); // OK. 인스턴스 멤버 접근 가능!
  }

  static int no1;
  int no2;

  // 중첩 클래스에서 바깥 클래스의 멤버에 접근하기
  // => 인스턴스(멤버) 중첩 클래스는 바깥 클래스의 스태틱 멤버에 접근할 수 있다.
  // => 인스턴스 중첩 클래스는 바깥 클래스의 인스턴스 멤버에 접근할 수 있다.
  // => 즉 인스턴스 메서드와 동일하다.
  class Inner {
    public void test2() {
      no1 = 100; // OK!
      m();  // OK!
      no2 = 100; //OK
      System.out.println("Inner.test2()....");
    }
  }




}
