/*
문제4) 주어진 수를 오름차순으로 정렬하시오.
       프로그램 아규먼트의 개수는 정해져 있지 않다.
> java -cp bin step13.Quiz04 64 5 2 74 13 98
> 2, 5, 13, 64, 74, 98
*/
package step13;

public class Quiz04 {
  public static void main(String[] args) {
    int[] a = new int[args.length];
    for (int i = 0; i < args.length; i++) {
      a[i] = Integer.parseInt(args[i]);
    }

    int tmp;

    for(int i = 0; i < args.length; i++) {
      for (int j = 0; j < args.length - 1; j++) {
        if (a[j] > a[j + 1]) {
          tmp = a[j + 1];
          a[j + 1] = a[j];
          a[j] = tmp;
        }
      }
    }

    for (int i = 0; i < args.length - 1; i++) {
      System.out.printf("%d, ", a[i]);
    }
    System.out.printf("%d\n", a[args.length - 1]);
  }
}
