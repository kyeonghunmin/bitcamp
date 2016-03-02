/* 주제 : String 주요 도구 사용법3 */
package step03;

public class Exam09 {
  public static void main(String[] args) {
    String s1 = "we";
    String s2 = "taxi";
    String s3 = String.format("Will %s take a %s?", s1, s2);
    System.out.println(s3);
  }
}

// static method
// - String.format()
// - 별도의 객체가 없어도 된다.

// instance method (nonstatic method)
// - s1.concat(), s1.replace()
// - 별도의 객체가 필요하다.


/* 도구(method)의 종류
=> static method
  - 클래스 이름으로 바로 사용할 수 있는 도구
  - 특정 물건에 상관없이 사용할 수 있다.
  - 예) String.format(...)

=> instance method
  - 반드시 물건이 있어야만 사용할 수 있는 도구
  - 특정 물건에 대해 작업을 수행한다.
  - 예) s1.concat(...), s1.replace(...)

API 문서를 보고 메서드의 종류를 알아내기
=> method signature의 static이 선언되어 있으면 static 메서드이다.
=> 그 밖에는 모두 인스턴스(non-static) 메서드이다.
*/
