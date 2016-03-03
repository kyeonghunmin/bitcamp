/* 주제 : 메서드의 접근 레벨
- 메서드는 보통 외부에서 접근할 수 있도록 개방한다. => public으로 선언.
  그러나 메서드 중에서 내부에서만 써야하는 경우,
  인스턴스 변수처럼 격리 레벨을 올린다. => private 등
 */
package step10;

public class Exam04 {
  public static void main(String[] args) {
    Score3 s = new Score3("홍길동", 100, 100, 100);

    s.setKor(50);

    // Score2에서는 summary()와 average()의 접근 레벨이 default이기 때문에
    // 같은 패키지에 속해있는 모든 클래스에서 사용가능 했다.
    // Score3에서는 두 메서드 모두 private 레벨을 갖기 때문에
    // 다음과 같이 외부에서 사용할 수 없다.
    //s.summary();  // 컴파일 오류
    //s.average();  // 컴파일 오류

    System.out.printf("%s, %d, %d, %d, %d, %f\n",
      s.getName(), s.getKor(), s.getEng(), s.getMath(),
      s.getSummary(), s.getAverage());

  }
}


/* 캡슐화?
- 클래스의 용도에 맞게끔 내부 멤버(변수, 메서드)의 접근 레벨을 조정하는 문법이다.
- 잘못된 접근을 차단함으로써 클래스의 오용을 막을 수 있다.
*/
