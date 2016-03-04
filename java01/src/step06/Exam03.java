/* 주제 : 메서드 정의하기 3 */
package step06;

public class Exam03 {

  // 값을 리턴하는 메서드 정의하기
  static String hello() {               // static이 기본이다.
    return "안녕하세요";   // 상수풀에 만들어지고 그 주소를 리턴한다.
  }

  public static void main(String[] args) {
    // 메서드 실행
    // return 값을 받지 않는 경우
    // 값을 반환하는 메서드 실행
    // => 주는 것 안받아도 된다.
    hello();
    // return 값을 받는 경우
    String str = hello();     // 문자열 물건의 주소를 리턴한다.
    System.out.println(str);
    // => 리턴하는 데이터 타입과 다른 변수를 선언하면 할당 오류 발생!
    //int value = hello(); // 오류!
  }
}
