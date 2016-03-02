/* 주제 : 배열에 값을 저장하고 꺼내기 */
package step02;

public class Exam06 {
  public static void main(String[] args) {
    int[] arr = new int[3];

    arr[0] = 10;
    arr[1] = 20;
    arr[2] = 30;
    //arr[3] = 40;  // 컴파일은 되지만, 실행은 불가 // 유효한 인덱스가 아님

    System.out.println(arr[2]);
    //System.out.println(arr[10]);    // 실행할 때(Runtime) 오류(Exception)

    // 배열의 개수를 알아내기
    System.out.println(arr.length);
  }
}


/* 배열 사용
- 배열에서 특정 항목의 변수를 사용하기
- 배열[인덱스] = 값;
  예) int[] a = new int[5];
      a[0] = 10;
      a[1] = 20;
      a[4] = 30;
      a[5] = 40;  // 존재하지 않는 인덱스
- 인덱스는 배열의 항목을 가리키는 번호이다.
  인덱스는 0부터 시작한다.
*/
