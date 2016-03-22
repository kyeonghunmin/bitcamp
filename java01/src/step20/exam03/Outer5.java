// 주제 : anonymous inner class 선언

package step20.exam03;

public class Outer5 {
  int no;

  // anonymous inner class - member
  Object obj1 = new Object() {};    // Object의 하위 클래스
  
  void m() {
    System.out.println(obj1);
  }
}
