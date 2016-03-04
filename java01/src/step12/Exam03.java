/* 주제 : 인스턴스 변수에 접근
 */
package step12;

public class Exam03 {

  int instanceValue = 1000;

  public void instanceMethod() {
    this.instanceValue = 2000;
  }

  static {
    // 인스턴스 주소가 있어야만 접근할 수 있다.
    // instanceValue = 3000;  // error
    // static 블록은 인스턴스를 실행하기도 전에 실행되기 때문에
    // 인스턴스 주소가 있을 턱이 없다. => this 변수가 존재하지도 않음
    //                                    클래스가 로딩될때 스태틱 블록이 실행되기 떄문
    // this.instanceValue = 3000; // error
  }

  // 스태틱 메서드는 인스턴스 주소 없이 호출할 수 있다.
  // 만약 인스턴스 주소 없이 호출하면 어떡할
  static void staticMethod() {
    // 스태틱 메서드는 this라는 변수가 없다.
    // this.instanceValue() = 4000;  // error
  }

  public static void main(String[] args) {
    Exam03.staticMethod();
    // 인스턴스 주소 없이는 인스턴스 변수에 접근할 수 없다.
    // main()도 스태틱이기 때문에 인스턴스 변수에 접근할 수 없다.
    instanceValue = 5000; // error

    // 인스턴스 메서드는 인스턴스 주소 없이 호출할 수 없다.
    // Exam03.instanceMethod(); // error

  }
}

/* 인스턴스 변수 및 메서드에 접근
- 인스턴스 주소가 있어야만 가능하다.

자바 메서드의 종류
1) 인스턴스가 있어야만 작업이 가능한 명령어는
   => 인스턴스 메서드에 작성한다.
2) 인스턴스 없이 작업할 수 있는 명령어는
   => 스태틱 메서드에 작성한다.










*/
