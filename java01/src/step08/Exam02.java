/* 주제 : 클래스 구동원리 - 클래스 로딩과 메서드 실행2 */
package step08;

public class Exam02 {
  public static void main(String[] args) {
    int a = 20;
    MyClass.sValue = a;
    System.out.println(MyClass.sValue);
  }
}

/* 로컬 변수
- 메서드 안에 선언된 변수.
- 스택 메모리 영역에 준비된다.
- 파라미터도 로컬 변수이다.
*/
