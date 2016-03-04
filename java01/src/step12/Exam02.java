/* 주제 : 스태틱 변수(클래스 변수)에 접근
 */
package step12;

public class Exam02 {

  static int staticValue = 10;

  public void instanceMethod() {
    // 스태틱 변수는 클래스 이름으로 접근할 수 있다.
    Exam02.staticValue = 1000;  // 가능

    // 만약 메서드가 스태틱 변수와 같은 클래스에 있다면
    // 클래스명 생략 가능
    staticValue = 2000;   // 가능
  }

  static {
    Exam02.staticValue = 3000;
    staticValue = 4000;
  }

  public static void main(String[] args) {
    Exam02.staticValue = 5000;
    staticValue = 6000;
    System.out.println(staticValue);
  }
}

/*












*/
