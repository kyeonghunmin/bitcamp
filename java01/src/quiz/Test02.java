/*
 출처: codefights.com

 숫자 배열에서 각 이웃하는 숫자간의 차가 가장 큰 것을 알아내기
 예)
 [2, 4, 1, 0] => 3

한 줄에 버그가 있다. 고쳐라!
*/
package quiz;

public class Test02 {
  public static void main(String[] args) {
    int[] values = {2, 4, 1, 0};
    int answer = 1;
    for (int i = 1; i < values.length; i++) {
      if (Math.abs(values[i] - values[i - 1]) > answer) {
        answer = Math.abs(values[i] - values[i - 1]);
      }
    }

    System.out.println(answer);
  }
}
