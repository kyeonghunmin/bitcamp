/* 주제 : 클래스 구동원리 - 인스턴스와 클래스 로딩2
- 클래스는 두 번 로딩되지 않는다.
*/
package step08;

public class Exam05 {
  public static void main(String[] args) {
    MyClass.sValue = 20;
    MyClass obj;
    obj = new MyClass();    // 인스턴스 변수인 iValue가 Heap에 준비된다.
    obj.setIValue(MyClass.sValue);
    obj = new MyClass();    // 또 다른 iValue를 Heap에 준비한다.
    obj.setIValue(MyClass.sValue);
    System.out.println(obj.iValue);
  }
}
