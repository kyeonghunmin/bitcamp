/* 주제 : String 물건에 들어있는 문자열의 길이를 알아내기 */
package step03;

public class Exam06 {
  public static void main(String[] args) {
    String s1 = "Hello";
    String s2 = "안녕하세요";

    // String 설계도(클래스)로 만든 모든 물건은
    // length() 도구를 사용할 수 있다.
    // length() : String 물건에 들어있는 문자열의 개수를 알려준다.

    System.out.printf("%d %d\n", s1.length(), s2.length());
    // length()를 통해 문자열의 길이를 확인할 수 있다.
  }
}

/* 물건의 도구를 사용하는 방법?
=> 객체의 메서드를 호출하는 방법
=> 물건이름.도구명(값);

물건에 대해 사용할 수 있는 도구를 알아내는 방법?
=> API(Application Programming Interface) 문서를 참고하라!

String 물건의 API는?
=> String은 java.lang 패키지에 있다.
=> 패키지 링크를 클릭하면 그 패키지에 소속된 클래스 목록을 출력한다.
=> String 클래스를 선택하면 그 클래스의 정보를 출력한다.
=> 메서드 목록을 확인하라.
=> 메서드 정보(method signature = function prototype):
  - 메서드명
  - 메서드를 이용할 때 반드시 넘겨 주어야 할 값(argument)
  - 메서드를 실행한 후 리턴되는 값의 종류(return type)
*/
