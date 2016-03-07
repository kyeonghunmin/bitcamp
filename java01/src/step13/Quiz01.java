/* 문제1) 입력 받은 두 수 중 더 큰 수를 출력하시오.
> java -cp bin step13.Quiz01 34 78
> 78
*/

package step13;

public class Quiz01 {
  public static void main(String[] args) {
    int[] a = new int[args.length];
    for (int i = 0; i < args.length; i++) {
      a[i] = Integer.parseInt(args[i]);
    }

    if (a[0] < a[1]) {
      System.out.println(a[1]);
    } else {
      System.out.println(a[0]);
    }
    
  }
}
