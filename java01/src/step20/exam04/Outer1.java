// top level inner class 사용하기
package step20.exam04;

public class Outer1 {
  static void m() { // 스태틱 멤버에서 접근하기
    Outer1.no1 = 10; // OK
    no1 = 20; // OK. 같은 클래스의 멤버이니까 클래스명 생략 가능!
    //no2 = 30; // 컴파일 오류! 스태틱 멤버는 인스턴스 멤버에 접근 불가!
    //m2(); // 컴파일 오류! 위와 동일
  }

  void m2() { // 인스턴스 멤버에서 접근하기

  }

  static int no1;
  int no2;

  // 중첩 클래스에서 바깥 클래스의 멤버에 접근하기
  // => 스태틱 중첩 클래스는 바깥 클래스의 스태틱 멤버에 접근할 수 있다.
  // => 스태틱 중첩 클래스는 바깥 클래스의 인스턴스 멤버에 접근할 수 없다.
  // => 즉 스태틱 메서드와 동일하다.
  static class Inner {
    public static void test1() {
      // 메서드의 static 여부는 상관없다.
      // 중첩 클래스가 static이냐 아니냐이다.
      no1 = 100; // OK! 스태틱 멤버는 같은 스태틱 멤버를 사용할 수 있다.
      m();  // OK! 위와 동일
      System.out.println(no1);
      //no2 = 29;// 오류! 인스턴스 멤버 접근 불가!
    }

    public void test2() {
      // 메서드의 static 여부는 상관없다.
      // 중첩 클래스가 static이냐 아니냐이다.
      no1 = 100; // OK! 스태틱 멤버는 같은 스태틱 멤버를 사용할 수 있다.
      m();  // OK! 위와 동일
      System.out.println(no1);
      //no2 = 100; // 오류! 현재 메서드의 스태틱 여부는 상관없다.
                 // 중첩 클래스가 스태틱이나 아니냐가 중요하다.
    }
  }




}
