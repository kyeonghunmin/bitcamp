/* 주제 : 할당 연산자 */
package step04;

public class Exam08 {
  public static void main(String[] args) {
    int i = 10;
    i = i + 5;

    int j = 10;
    j += 5;       // 자기 자신과 연산할 때는 줄여서 표현 가능.

    System.out.printf("%d %d\n", i, j);

    // +=, -=, *=, /=, %=, &=, |=, ^=, <<=, >>=, >>>= 모두 가능
  }
}
