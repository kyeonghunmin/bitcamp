/* 주제 : 캡슐화 적용 후2
- 셋터 메서드 사용
 */
package step10;

public class Exam03 {
  public static void main(String[] args) {
    Score2 s = new Score2("홍길동", 100, 100, 100);

    // 셋터를 이용하면 인스턴스를 생성한 후에도 값을 변경할 수 있다.
    // 또한 setter 내부에서 값을 저장하기 전에 값의 유효 여부를 검사한다.
    // => 무효한 값이 저장되는 것을 막을 수 있다. (setter의 존재 이유)
    s.setKor(120);  // <-- 오류! ()무효한 점수이기 때문에 값을 넣지 않는다.)
    s.setKor(50);   // <-- 50은 유효한 값이기 때문에 저장될 것이다.

    // 성적을 변경할 때마다 합계와 평균이 자동으로 계산되기 때문에
    // 다음 명령은 필요가 없다.
    // s.summary();
    // s.average();

    System.out.printf("%s, %d, %d, %d, %d, %f\n",
      s.getName(), s.getKor(), s.getEng(), s.getMath(),
      s.getSummary(), s.getAverage());

  }
}


/*
*/
