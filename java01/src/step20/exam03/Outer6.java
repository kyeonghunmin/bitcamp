// 주제 : anonymous inner class 선언 2

package step20.exam03;

public class Outer6 {
  int no;

  // 익명 중첩 클래스에 메서드 추가하기
  Object obj1 = new Object() {
    public void test() {
      System.out.println("어떻게 호출하지?");
    }

    @Override
    public String toString() {
      return "오호라";
    }


  };

  void m() {
    System.out.println(obj1);
    // obj1.test(); // 컴파일 오류!
    // 컴파일러는 레퍼런스 변수의 타입을 조사하여
    // 메서드를 호출할 수 있는 지 검사한다.
    // 실제 레퍼런스가 어떤 인스턴스를 가리키는 지는 고려하지 않는다.

    // 직접 코드로 호출할 수는 없지만, 특수 도구를 사용하면 가능하다!
    try {
      Class classInfo = obj1.getClass();
      java.lang.reflect.Method methodInfo = classInfo.getMethod("test");
      methodInfo.invoke(obj1); // <-- 이렇게 호출하지.
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
