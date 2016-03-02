/* 주제 : String 물건 만들기 */
package step03;

public class Exam01 {
  public static void main(String[] args) {

    // 문자열 리터럴로 String 물건 만들기
    String s1 = "Hello";      // String이라는 클래스는
                              // new char[5], int length 등이 담겨져 있어서
                              // 이러한 명령들을 통해 Hello를 저장하게 된다.
                              // new String("Hello")와 같다.

    // new 명령을 사용하여 명시적으로 String 물건을 만들기
    String s2 = new String("Hello");    // 2개 모두 사용가능하다.

    System.out.printf("%s %s\n", s1, s2);
  }
}
