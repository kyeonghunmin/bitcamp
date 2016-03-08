/* 주제 : call by reference
 */
package step08;

public class Exam09 {
  static void setValue(int[] arr) {
    arr[0] = 100;
    arr[1] = 200;
    arr[2] = 300;
  }

  public static void main(String[] args) {
    int[] arr = new int[3];
    setValue(arr);

    System.out.println(arr[0]);
    System.out.println(arr[1]);
    System.out.println(arr[2]);
  }
}

/* call by reference
- 메서드를 호출할 때 파라미터에 인스턴스 주소를 넘긴다.
*/
