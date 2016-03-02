/* 주제 : 명시적 형변환과 암시적 형변환1 */
package step04;

public class Exam14 {
  public static void main(String[] args) {
    int a = 5;
    int b = 2;
    float f = a / b;    // 정수와 정수의 연산 결과는 정수이다.
    System.out.println(f);  // 2.0
  }
}
/*
연산 규칙
=> 항상 같은 타입끼리만 연산이 가능하다.
=> 그래서 연산 결과는 같은 타입이다.

서로 다른 타입과 연산하려면?
=> 타입을 서로 맞춰줘야 한다.
=> 방법은? 명시적 형변환과 암시적 형변환
*/
