/* 주제 : 후위 증가/감소 연산자 */
package step04;

public class Exam10 {
  public static void main(String[] args) {
    int i = 10;
    i++;    // postfix 증가 연산자
    i++;
    i++;
    System.out.println(i);

    int j = 10;
    j--;    // postfix 감소 연산자
    j--;
    j--;
    System.out.println(j);

    i = 10;
    j = 10;
    System.out.printf("%d %d\n", i++, j--);
    System.out.printf("%d %d\n", i, j);

    // 전위 연산자는 먼저 값을 증가시킨 다음에 그 자리에 값을 놓는다.
    // 후위 연산자는 값을 먼저 놓은 다음에 변수의 값을 증가시킨다.
  }
}
