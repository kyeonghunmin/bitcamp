/* 주제 : 캡슐화 적용 후
- 외부 클래스의 메서드는 내부 클래스의 격리 레벨에 상관없이
  무제한 접근이 가능하다.
  => 격리 레벨을 테스트 하기 위해 Score 클래스를 일반 클래스로 만들어 테스트한다.
일반 클래스?
패키지 직속 클래스
중첩 클래스?
다른 클래스 안에 선언된 클래스
 */
package step10;

public class Exam02 {
  public static void main(String[] args) {
    Score s = new Score("홍길동", 100, 100, 100);

    // 외부에서 접근할 때?
    //s.kor = 120;  // 컴파일 오류 발생

    s.summary();
    s.average();

    // 외부에서 접근할 때?
    //s.sum = 88;   // 컴파일 오류 발생

    // 인스턴스 변수에 직접 접근할 수 없기 때문에
    // 다음과 같이 명령어를 작성할 수 없다.
    // System.out.printf("%s, %d, %d, %d, %d, %f\n",
    // s.name, s.kor, s.eng, s.math, s.sum, s.aver);
    System.out.printf("%s, %d, %d, %d, %d, %f\n",
      s.getName(), s.getKor(), s.getEng(), s.getMath(),
      s.getSummary(), s.getAverage());

  }
}


/* 격리 레벨을 높이면 값을 꺼낼 수 없다.
- 해결책?
  값을 넣고 꺼내주는 연산자를 추가한다.
- 값을 꺼내는 연산자 => 겟터(getter)
  int getKor() {}
- 값을 저장하는 연산자 => 셋터(setter)
  int setKor(int value) {}
*/

/* 개선점?
- 현재 Score는 인스턴스를 생성할 때 값을 저장할 수 있다.
- 인스턴스를 생성한 후에는 값을 변경할 수 없다.
- 왜? 모든 변수가 private으로 접근 레벨이 높아졌기 때문이다.
- 해결책? 값을 설정해주는 연산자를 추가한다. ==> 셋터 추가



*/
