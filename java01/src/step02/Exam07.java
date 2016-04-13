/* 주제 : 배열 초기화 */
package step02;

public class Exam07 {
  public static void main(String[] args) {

    int[] a;
    a = new int[3]; // 배열의 별명을 먼저 선언한 후 생성된 배열에 붙일 수 있다.
    a[0] = 1;
    a[1] = 2;
    a[2] = 3;
    System.out.println(a[2]);

    int[] b;
    b = new int[]{10, 20, 30};
    System.out.println(b[2]);

    /*
    // 문법 오류!
    // 이 방식으로 배열을 초기화시킬 때는
    // 배열 변수 선언문과 함께 사용해야 한다.
    int[] c;
    c = {100, 200, 300, 400};
    System.out.println(c[3]);
    */

    int[] c = {100, 200, 300, 400};
    System.out.println(c[3]);

  }
}
/* 배열 사용
- 배열에서 특정 항목의 변수를 사용하기
- 배열[인덱스] = 값;
  예) int[] a = new int[5];
      a[0] = 10;
      a[1] = 20;
      a[4] = 30;
      a[5] = 40; // 존재하지 않는 인덱스
- 인덱스는 배열의 항목을 가리키는 번호이다.
  0부터 시작한다.

 */
