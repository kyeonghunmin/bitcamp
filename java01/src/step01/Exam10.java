/* 주제 : 각 진수의 표현 */
package step01;

public class Exam10 {
  public static void main(String[] args) {
    System.out.println(12);   // 10진수
    System.out.println(014);  //  8진수
    System.out.println(0b1100); //  2진수
    System.out.println(0B1100); //  2진수
    System.out.println(0b00001100); //  2진수
    System.out.println(0b0000_1100); //  2진수
    System.out.println(0xc);  // 16진수
    System.out.println(0x000c);  // 16진수
    System.out.println(0x0000_000c);  // 16진수


  }
}

/*
16진수의 의미?
- 2진수의 단축 표기법으로 유용.
- 즉, 2진수 4비트를 묶어서 16진수 한 개의 숫자로 표현할 수 있다.
- 16진수를 2진수로 바꾸기가 쉽다.
10진수 => 12
2진수  => 0000 1100
16진수 => 0C
*/
