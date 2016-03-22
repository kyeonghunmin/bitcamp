// 주제 : anonymous inner class 선언 3

package step20.exam03;

public class Outer7 {
  int no;

  void m() {
    // anonymous inner class - local
    Object obj1 = new Object() {
      @Override
      public String toString() {
        return "오호라";
      }
    };
    System.out.println(obj1);
  }
}
