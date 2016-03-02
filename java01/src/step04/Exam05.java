/* 주제 : 비트 연산자 사용 */
package step04;

public class Exam05 {
  public static void main(String[] args) {
    // & (AND) => 특정 비트들을 걸러내는 효과가 있다.
    int a = 0b0101_0011;
    int b = 0b0000_1111;
    String result = Integer.toBinaryString(a & b);  // 0000_0011
    System.out.println(result);

    // | (OR) => 특정 비트의 값을 강화하는 효과가 있다.
    result = Integer.toBinaryString(a | b);  // 0101_1111
    System.out.println(result);

    // ~ (NOT) => 전체 비트의 값을 반전시키는 효과가 있다.
    result = Integer.toBinaryString(~a);  // 1010_1100
    System.out.println(result);

    // ^ (Exclusive OR) => 특정 비트의 값을 제거(반전)하는 것.
    // 영상 크로마킹 기법에 많이 사용한다.
    // (배경과 같은색을 XOR 하여 배경색을 날리는 효과)
    a = 0b0101_0011;
    b = 0b0000_1111;
    result = Integer.toBinaryString(a ^ b);  // 0101_1100
    System.out.println(result);
  }
}
