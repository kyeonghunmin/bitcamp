/* 주제 : 0부터 n-1까지 수를 원으로 배치할 때,
          특정 값의 맞은 편에 위치해 있는 수를 리턴하는 메소드를 정의하라.
          메서드 이름 : circleOfNumbers
          이 메서드가 받아야 할 값은 n 값과 맞은 편 값을 알기 위해 전달하는 값.
 */
package step06;

public class Quiz02 {

  static int circleOfNumbers(int n, int a) {
    return (a + (n / 2)) % n;
  }

  public static void main(String[] args) {
    System.out.println(circleOfNumbers(10, 3));
  }
}
