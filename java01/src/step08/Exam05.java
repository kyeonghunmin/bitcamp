/* 주제 : 클래스 구동원리 - 인스턴스와 클래스 로딩2 */
package step08;

public class Exam05 {
  public static void main(String[] args) {
    MyClass.sValue = 20;
    MyClass obj;
    obj = new MyClass();
    obj.setIValue(MyClass.sValue);
    obj = new MyClass();
    obj.setIValue(MyClass.sValue);
    System.out.println(obj.iValue);
  }
}
