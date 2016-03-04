/* 주제 : 오버로딩을 잘못한 예
 */
package step11;

public class Exam04 {
  static int plus(int a, int b) {
    System.out.println("int, int");
    return a + b;
  }

  // 잘못 오버로딩한 예
  // 1) 변수명만 다른 경우 (변수명은 의미가 없음)
//  static int plus(int b, int a) {
//    return a + b;
//  }

  // 2) 리턴타입만 다른 경우
//  static float plus(int a, int b) {
//    return a + b;
//  }

  // 가능 (타입이 다르기 때문)
  static float plus(byte a, byte b) {
    System.out.println("byte, byte");
    return a + b;
  }

  public static void main(String[] args) {
    System.out.println(plus(10, 20)); // 숫자 10, 20은 int형 literal이다.
    byte b1 = 10, b2 = 20;
    System.out.println(plus(b1, b2));

  }
}
/*













*/
