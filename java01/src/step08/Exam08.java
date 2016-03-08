/* 주제 : call by value
 */
package step08;

public class Exam08 {
  static void setValue(int a) {
    a = 30;
  }

  public static void main(String[] args) {
    int a = 10;
    setValue(a);    // 같은 클래스에 있기 때문에 클래스명 생략함

    System.out.println(a);
  }
}

/* call by value
- 메서드를 호출할 때 파라미터에 값을 넘긴다.
*/
