/* 주제 : 랩퍼(wrapper) 클래스와 원시 타입 간 오토박싱(auto-boxing)
*/

package step13;

public class Exam02 {
  public static void main(String[] args) {
    // auto-boxing => 내부에서 랩퍼 클래스의 인스턴스를 생성한다.
    Integer i = 10;  // new Integer(10); 와 같다.

    // auto-unboxing => 랩퍼 클래스의 인스턴스 값을 원시 타입 값으로 자동 리턴한다.
    Integer i2 = new Integer(100);
    int v1 = i2;  // 내부적으로 i2.intValue(); 로 동작한다.

  }
}

/*
*/
