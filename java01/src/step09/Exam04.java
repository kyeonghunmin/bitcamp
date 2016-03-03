/* 주제 : 파라미터를 갖는 생성자
- 인스턴스를 생성할 때 외부에서 주입한 값으로 초기화시키기.
 */
package step09;

public class Exam04 {
  static class  Score {
    String name;
    int kor;
    int eng;
    int math;
    int sum;
    float aver;

    // 생성자가 단 한 개라도 있으면 기본 생성자는 자동으로 붙지 않는다.
    Score(String name, int kor, int eng, int math) {
      this.name = name;
      // this.name : Heap에 있는 인스턴스 변수
      // name : 파라미터 값
      this.kor = kor;
      this.eng = eng;
      this.math = math;
    }
  }

  public static void main(String[] args) {
    Score[] scores = new Score[] {
      new Score("홍길동", 100, 100, 100),
      new Score("임꺽정", 90, 90, 90),
      new Score("유관순", 80, 80, 80)
    };

    for (int i = 0; i < scores.length; i++) {
      scores[i].sum = scores[i].kor + scores[i].eng + scores[i].math;
      scores[i].aver = scores[i].sum / 3f;
    }

    for (int i = 0; i < scores.length; i++) {
      System.out.printf("%s, %d, %d, %d, %d, %f\n",
          scores[i].name, scores[i].kor, scores[i].eng, scores[i].math,
          scores[i].sum, scores[i].aver);
    }
  }
}
