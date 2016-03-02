/* 주제 : 클래스 구동원리 - 인스턴스와 클래스 로딩 */
package step08;

public class Exam04 {
  public static void main(String[] args) {
    int a = 20;
    MyClass obj;
    obj = new MyClass();
    obj.setIValue(a);
    System.out.println(obj.iValue);
  }
}
