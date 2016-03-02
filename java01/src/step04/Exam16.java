/* 주제 : 명시적 형변환과 암시적 형변환3 */
package step04;

public class Exam16 {
  public static void main(String[] args) {
    float a = 5f;
    int b = 2;
    float f = a / b;      // 암시적 형변환
    System.out.println(f);
    System.out.println(b);  // b는 그대로 int형 2인것을 확인할 수 있다.
                            // 즉 형변환을 수행한 문장에서만
                            // 임시 메모리를 만들어 형변환을 하게된다.

  }
}

/* 암시적 형변환
=> a(float) / b(int)  :  연산불가!
=> b의 값을 float으로 바꿔서 나누기 연산을 수행한다.
=> How?
   float 임시 메모리를 만들어 b의 값을 저장하고
   a와 임시 메모리 값을 연산한다.
  1)    a(5) / b(2)
  2)    a(5) /  임시 float 메모리(2f) ===> 2.5

정적 타입 바인딩(static type binding)
=> 한 번 변수의 타입이 결정되면 절대 바뀌지 않는다.
=> int i = 10;
   i = "Hello"; <---- 컴파일 오류!

동적 타입 바인딩(dynamic type binding)
=> 값을 저장할 때 변수의 타입이 결정된다.
=> 다른 타입의 값으로 변경하면 변수의 타입도 변경된다.
=> var i = 10; // Integer
   i = "Hello"; // String으로 변경됨
*/
