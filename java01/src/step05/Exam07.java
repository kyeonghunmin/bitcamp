/* 주제 : 다중 분기 switch2 */
package step05;

public class Exam07 {
  public static void main(String[] args) {
    int job = 2;  // 1 : 일반관리직, 2 : 운영팀, 3 : 개발
    switch (job) {
      case 1:
        System.out.println("오피스 자격증");
      case 2:
        System.out.println("리눅스 자격증");
      case 3:
        System.out.println("자바 자격증");
      default:
        System.out.println("자격증 필요없음");
    }

    // switch 문은 break를 만날 때까지 멈추지 않고 실행한다.
    // => 특별한 경우가 아니면 break를 빠뜨리지 말라!
  }
}
