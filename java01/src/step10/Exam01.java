/* 주제 : 캡슐화 적용 전
 */
package step10;

public class Exam01 {
  static class  Score {
    String name;
    int kor;
    int eng;
    int math;
    int sum;
    float aver;

    Score(String name, int kor, int eng, int math) {
      this.name = name;
      this.kor = kor;
      this.eng = eng;
      this.math = math;
    }


    void summary() {
      this.sum = this.kor + this.eng + this.math;
    }

    void average() {
      this.aver = this.sum / 3f;
    }
  }

  public static void main(String[] args) {
    Score s = new Score("홍길동", 100, 100, 100);

    // 특정 항목에 대해 유효 범위를 벗어나는 값으로 변경
    s.kor = 120;  // 점수가 120점으로 잘못 입력된 경우 -> 그대로 출력된다.
                  // 문법 OK, 작업은 무효하다. (점수는 0 ~ 100이어야 함)

    s.summary();
    s.average();

    // 특정 항목의 값을 임의로 변경
    s.sum = 88;   // 문법 OK, 작업은 무효하다.
    // 위 코드가 문법적으로는 문제가 없지만,
    // 유효한 명령인가?

    System.out.printf("%s, %d, %d, %d, %d, %f\n",
      s.name, s.kor, s.eng, s.math, s.sum, s.aver);

  }
}


/* 무효한 값을 설정할 때?
- 문법 상으로는 문제가 없지만,
  프로그램의 목적에는 부합하지 않는 경우가 발생
- 이런 문제가 발생한 이유?
  1) 인스턴스 변수에 임의적으로 접근할 때
  2) 내부에서 사용되어야 할 명령어를 외부에서 사용할 때
- 해결책?
  => 외부로부터 변수나 메서드에 대해 격리시키기 (캡슐화, encapsulation)
- 캡슐화 격리 레벨
1) private : 내부에서만 접근 가능
2) public : 완전 공개
3) (default) : 같은 패키지에 소속된 클래스에서는 접근 가능
4) protected : 같은 패키지 + 자식 클래스에서는 접근 가능
*/
