/* 주제 : 클래스 접근 레벨
 */
package step10.other;

import step10.Score4;   // Score4는 public 레벨을 갖는다.

public class Exam06 {
  public static void main(String[] args) {
    Score4 s = new Score4("홍길동", 100, 100, 100);
    s.setKor(50);

    System.out.printf("%s, %d, %d, %d, %d, %f\n",
      s.getName(), s.getKor(), s.getEng(), s.getMath(),
      s.getSummary(), s.getAverage());

  }
}

/* 클래스 접근 레벨?
- public : 다른 패키지에 공개
- (default) : 같은 패키지 클래스만 접근 가능
- 패키지 직속 클래스를 "패키지 멤버 클래스"라고 부른다.
- 우리가 보통 작성하는 클래스가 모두 패키지 멤버 클래스이다.

클래스 멤버(변수, 메서드, 중첩클래스)의 접근 레벨?
- public : 모두 공개
- (default) : 같은 패키지의 클래스만 접근 가능
- protected : 같은 패키지 + 자식 클래스 (패키지 상관없이 자식클래스는 가능)
- private : 그 클래스 내부에서만 사용 가능

*/
