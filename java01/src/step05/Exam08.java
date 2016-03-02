/* 주제 : 다중 분기 switch3 */
package step05;

public class Exam08 {
  public static void main(String[] args) {
    int job = 6;  // 1 : 일반관리직, 2 : 운영팀, 3 : 개발
    switch (job) {
      case 3:
        System.out.println("자바 자격증");
      case 2:
        System.out.println("리눅스 자격증");
      case 1:
        System.out.println("오피스 자격증");
        break;
      default:
        System.out.println("자격증 필요없음");
    }

    // 명령을 겹쳐서 실행하고 싶을 때 break를 사용하지 않을 수 있다.
  }
}
