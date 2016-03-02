/* 주제 : String 주요 도구 사용법2 */
package step03;

public class Exam08 {
  public static void main(String[] args) {
    String s1 = "I will take a bus";
    String s2 = s1.replace('l', 'x');   // s1은 변하지 않고
                                        // l이 x로 바뀐 s2가 새로 생성된다.
                                        // String은 immutable 이기 때문이다.

    System.out.println(s1);      // 절대 기존 내용물은 변경되지 않는다.
    System.out.println(s2);

    String s3 = s1.replace("bus", "taxi");    // 문자열 변환도 가능하다.
    System.out.println(s3);

    String s4 = s3.replace('I', 'U');
    System.out.println(s4);
  }
}
