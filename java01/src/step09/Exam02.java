/* 주제 : class로 사용자 정의 타입 만들기 */
package step09;

public class Exam02 {
  static class  Score {
    String name;
    int kor;
    int eng;
    int math;
    int sum;
    float aver;
  }

  public static void main(String[] args) {
    Score[] scores = new Score[3];// 인스턴스 주소를 저장할 레퍼런스 변수 3개 생성

    scores[0] = new Score();  // 인스턴스 생성
    scores[0].name = "홍길동";
    scores[0].kor = 100;
    scores[0].eng = 90;
    scores[0].math = 100;

    scores[1] = new Score();
    scores[1].name = "임꺽정";
    scores[1].kor = 90;
    scores[1].eng = 90;
    scores[1].math = 80;

    scores[2] = new Score();
    scores[2].name = "유관순";
    scores[2].kor = 100;
    scores[2].eng = 100;
    scores[2].math = 100;

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
