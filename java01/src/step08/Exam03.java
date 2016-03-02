/* 주제 : 클래스 구동원리 - 클래스 메서드 사용과 클래스 로딩 */
package step08;

public class Exam03 {
  public static void main(String[] args) {
    int a = 20;
    MyClass.setSValue(a);
    System.out.println(MyClass.sValue);
  }
}

/* 클래스를 로딩하는 경우
*/
