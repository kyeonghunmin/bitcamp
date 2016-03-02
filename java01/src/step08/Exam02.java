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

/* 클래스 실행과 메모리 사용
1) [Method Area] Exam02.class를 로딩한다.
2) [Method Area] main() 호출한다.
3) [Stack] main() 메서드가 사용할 로컬 변수를 준비한다.
4) [Method Area] main()의 int a = 20; 명령 실행한다.
   [Stack] a 변수에 20 값을 저장한다.
5) [Method Area] MyClass.class를 로딩한다.
6) [Method Area] MyClass의 스태틱 변수(sValue)를 준비한다.
7) [Method Area] main()의 MyClass.sValue = a; 명령을 실행한다.
   => Stack 메모리에 있는 a의 값을 Method Area에 있는 sValue에 저장한다.
8) [Method Area] main()의 System.out.println(); 명령을 실행한다.
9) [Stack] main() 실행 완료 --> main()이 사용한 모든 로컬 메모리를 제거한다.
10) JVM이 종료한다.
*/
