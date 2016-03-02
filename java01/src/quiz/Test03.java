/*
 출처: codefights.com

 배열의 전체 길이를 L이라고 하자.
 배열을 절반(L/2)으로 나눌 때, 앞쪽 부분과 뒤쪽 부분의 위치를 바꿔라.
 예)
 [2, 4, 5, 6, 4, 3, 7, 8] => [4, 3, 7, 8, 2, 4, 5, 6]

한 줄에 버그가 있다. 고쳐라!
*/
package quiz;

public class Test03 {
  public static void main(String[] args) {
    int[] values = {2, 4, 5, 6, 4, 3, 7, 8};

    int tmp;
    for (int i = 0; i < values.length / 2; i++) {
      tmp = values[i];
      values[i] = values[i + values.length / 2];
      values[i + values.length / 2] = tmp;
    }

    for (int i : values) {
      System.out.print(i + " ");
    }
  }
}
