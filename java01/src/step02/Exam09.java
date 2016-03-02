/* 주제 : 3차원 배열 */
package step02;

public class Exam09 {
  public static void main(String[] args) {
    int[][][] scores = {
      { // 3학년 1반
        {100, 90, 90},
        {90, 90, 90},
        {80, 100, 60}
      },
      { // 3학년 2반
        {90, 70, 70},
        {100, 100, 50},
      },
      { // 3학년 3반
        {50, 50, 50},
        {10, 10, 50},
        {40, 40, 40},
        {10, 10, 50}
      },
    };

    System.out.printf("%d %d %d\n", scores[1][1][0],
                                    scores[1][1][1],
                                    scores[1][1][2]);
  }
}
