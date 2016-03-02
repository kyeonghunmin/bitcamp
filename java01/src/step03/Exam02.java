/* 주제 : 리터럴 String과 new String의 비교 */
package step03;

public class Exam02 {
  public static void main(String[] args) {
    String s1 = "Hello";
    String s2 = "Hello";

    String s3 = new String("Hello");
    String s4 = new String("Hello");

    if (s1 == s2) {
      System.out.println("s1 == s2");
    }

    if (s3 == s4) {
      System.out.println("S3 == s4");
    }
  }
}

/*
"Hello" (s1) ==> Constant Pool 방에 생성된다.
"Hello" (s2) ==> Constant Pool 방에 s1의 Hello가 있기 때문에
                 s2는 새로 생성되지 않고 s1을 가리키게 된다.
// 하나의 Hello를 s1, s2가 같이 가리키게 된다. 즉, Hello는 총 1개이다.

new String("Hello") (s3) ==> Heap 방에 생성된다.
new String("Hello") (s4) ==> Heap 방에 생성할 때는 같은 Hello(s3)가 있더라도
                             새로 생성하게 된다.

===> 즉, s1과 s2는 같고, s3과 s4는 다르다.
*/


/*
문자열 리터럴을 이용하여 String 물건 만들기
=> 상수풀(constant pool) 메모리 방에 생성된다.
=> 상수풀 메모리 방은 데이터 중복을 허용하지 않는다.
=> 메모리를 절약할 수 있다.

new 명령을 사용하여 String 물건 만들기
=> 힙(heap) 메모리 방에 생성된다.
=> 데이터 중복에 상관없이 무조건 생성한다.

리터럴로 만들든 new로 만들든 모두 String 물건이다.
=> String 물건에 대해 모든 기능을 동일하게 이용할 수 있다.
*/
