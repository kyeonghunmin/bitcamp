/* 주제 : 명시적 형변환과 암시적 형변환2 */
package step04;

public class Exam15 {
  public static void main(String[] args) {
    int a = 5;
    int b = 2;
    float f = (float)a / (float)b;    // 명시적 형변환 수행
    System.out.println(f);  // 2.5
  }
}

// char는 2바이트 유니코드값이기 때문에 정수로 분류

/* 명시적 형변환
=> (원하는타입) 변수
=> 주의!
   작은 크기의 값을 큰 메모리 타입으로 바꾸는 것은 괜찮은데,
   큰 크기의 값을 작은 메모리의 타입으로 바꾸려 한다면 값이 짤릴 것이다.

형변환 가능 타입
=> 정수 --> 실수
=> 실수 --> 정수
=> 논리값 -X-> 정수,실수 (허용안됨)
=> 정수, 실수 -X-> 논리값 (허용안됨)
=> primitive type -X-> 물건(object) (허용안됨) => 단, 특별한 메서드를 사용하면 가능
=> 물건(object) -X-> primitive (허용안됨) => 단, 특별한 메서드를 사용하면 가능
*/
