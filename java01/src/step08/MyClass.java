/* 스태틱 변수와 인스턴스 변수의 차이
 */
package step08;

public class MyClass {

  // 필드 (field, C++ : member variables)
  static int sValue;  // 클래스 변수 또는 스태틱 변수
  int iValue;         // 인스턴스 변수

  // 메서드 (method, C++ : member function)
  static void setSValue(int a) {    // 클래스 메서드 또는 스태틱 메서드
    sValue = a;
  }

  void setIValue(int a) {   // 인스턴스 메서드
    this.iValue = a;
  }
}
