/*퀴즈 : 다음 값을 저장하고 지시에 따라 내용을 출력하시오!
- 학생 30명의 국어, 영어, 수학, 평균, 합계 점수
- 인덱스 5번 학생의 점수를 저장하라. 점수는 다음과 같다.
  국어: 100, 영어: 90, 수학: 50
- 인덱스 5번 학생의 국어, 영어, 수학, 합계, 평균을 출력하라!
*/
package step02;

public class Quiz03 {
  public static void main(String[] args) {
    int[][] score = new int[30][4];
    float[] avg = new float[30];

    score[5][0] = 100;
    score[5][1] = 90;
    score[5][2] = 50;
    score[5][3] = score[5][0] + score[5][1] + score[5][2];

    avg[5] = score[5][3] / 3;

    System.out.printf("%d %f\n", score[5][3], avg[5]);
  }
}
