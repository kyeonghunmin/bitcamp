/*
출처: codefights.com

주어진 숫자에 짝수가 몇 개인지 세어라.
예)
1010 => 2
123 => 1

한 줄에 버그가 있다. 고쳐라!
*/
package quiz;

public class Test01 {
  public static void main(String[] args) {
    int value = 1238694636;
    int result = 0;
    int n = value;
    while (n != 0) {
      if ((n % 2) == 0) {
        result++;
      }
      n /= 10;    // 나누기를 하게되면 1의 자리를 하나씩 버릴 수 있다.
                  // 123869463
                  // 12386946
                  // 1238694  이런식으로 1의 자리가 하나씩 줄어 홀/짝 확인.
    }
    System.out.println(result);
  }
}
