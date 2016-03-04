/* 주제 : 다중 분기 switch1 */
package step05;

public class Exam06 {
  public static void main(String[] args) {
    int job = 6;  // 1 : 일반관리직, 2 : 운영팀, 3 : 개발
    // switch문은 보통 단순한 분기일 경우 사용한다. (복잡할 때는 if문 사용)
    switch (job) {  // 4byte 정수값만 올 수 있다.
                    // (byte, short, char, int) (jdk7부터는 String도 포함)
      case 1:
        System.out.println("오피스 자격증");
        break;
      case 2:
        System.out.println("리눅스 자격증");
        break;
      case 3:
        System.out.println("자바 자격증");
        break;
      default:
        System.out.println("자격증 필요없음");
    }
  }
}
