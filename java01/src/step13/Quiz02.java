/*
문제2) 두 수 사이에 있는 수 중에서 짝수 값을 출력하시오.
> java -cp bin step13.Quiz02 4 12
> 4, 6, 8, 10, 12
*/
package step13;

public class Quiz02 {
  public static void main(String[] args) {
    int[] a = new int[args.length];
    for (int i = 0; i < args.length; i++) {
      a[i] = Integer.parseInt(args[i]);
    }

    for (int i = a[0]; i <= a[1] - 1; i++) {
      if ((i % 2) == 0) {
        System.out.printf("%d, ", i);
      }
    }
    if ((a[args.length - 1] % 2) == 0) {
      System.out.printf("%d\n", a[args.length - 1]);
    } else {
      System.out.println();
    }

  }
}
