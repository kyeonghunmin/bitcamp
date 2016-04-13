/* 주제 : 메서드 정의하기 2 */
package step06;

public class Exam02 {

  // 값을 받는 메서드 정의하기
  static void hello(String name) {               // static이 기본이다.
    System.out.printf("안녕하세요 %s님!\n", name);
  }

  public static void main(String[] args) {
    // 값을 받는 메서드 실행
    // => 메서드가 원하는 값을 반드시 넘겨줘야 한다.
    hello("민경훈"); // 메서드가 String 타입을 받으므로 반드시 String 데이터를
                     // 넘겨주어야 한다. (아니면 오류 발생)
    // hello(10); // 만약 메서드가 원하는 타입이 아닌 값을 준다면, 오류!
    hello("민경훈");
    hello("민경훈");
    hello("민경훈");
    hello("민경훈");
    hello("민경훈");
    hello("민경훈");
    hello("민경훈");
    hello("민경훈");
    hello("민경훈");
    hello("민경훈");
    hello("민경훈");
  }
}
