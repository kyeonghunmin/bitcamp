/* 주제 : final 2
*/

package step13;

public class Exam10 {
  static final int a;

  public static void main(String[] args) {
    a = 10; // static 변수는 클래스 로딩시 0으로 초기화되기 때문에 재할당 안됨.
  }
}

/* 스태틱 변수에 final 붙임
- 클래스가 로딩되면 스태틱 메모리가 준비된다.
- 그리고 자동으로 0으로 초기화된다.
- a는 이미 0으로 한 번 값이 할당되었기 때문에 main()에서 오류가 발생한다.
*/
