// 주제 : anonymous inner class 선언 2

package step20.exam03;

public class Outer6 {
  int no;

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
    //obj1.test();  // 오류
    // 컴파일러는 레퍼런스 변수의 타입을 조사하여
    // 메서드를 호출할 수 있는 지 검사한다.

  }
}
