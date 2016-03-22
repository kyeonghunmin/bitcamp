// 주제 : 1에서 10까지 더하기 (재귀 호출)

package step22.exam01;

public class Sigma {
  public static void main(String[] args) {
    int sum = 0;
    for (int i = 1; i <= 10; i++) {
      sum += i;
    }

    System.out.println(sum);

    System.out.println("------------------");

    sum = computeSigma(10);
    System.out.println(sum);
  }
  static int computeSigma(int value) {
    for (int i = 0; i < (10 - value); i++) System.out.print(" ");
    System.out.printf("computeSigma(%d)\n", value);
    if (value == 1)
      return value;
    else
      return value + computeSigma(value - 1);
  }
}
