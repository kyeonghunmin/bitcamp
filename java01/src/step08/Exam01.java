/* 주제 : 클래스 구동원리 - 클래스 로딩과 메서드 실행 */
package step08;

public class Exam01 {
  public static void main(String[] args) {
    System.out.println("Hello!");
  }
}


/* 클래스 로딩
1) 검증
- 로딩할 클래스의 바이트코드 유효 여부를 검사한다.
2) 준비
- 클래스에 스태틱 변수가 있으면 그 변수에 대해 메모리를 준비한다.
3) 실행
- main() 메서드를 실행한다.
*/

/* JVM의 메모리 관리
- OS로부터 분양받은 메모리를 크게 4개의 영역으로 나눠 관리한다.
1) Method Area
- 클래스가 로딩되는 영역이다.
2) Heap
- 인스턴스가 생성되는 영역이다.
3) Stack
- 메서드를 호출할 때마다 그 메서드에 선언된 로컬 변수를 준비하는 영역이다.
4) Constant pool
- 상수 값을 저장하는 영역이다. 클래스 또는 인터페이스당 존재
*/
