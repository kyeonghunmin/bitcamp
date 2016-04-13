// 주제 : Exception의 이해

package step19;

public class Test12 {
  static void m1(int i) throws Exception {
    m2(i);
  }

  static void m2(int i) throws Exception {
    // m3()에서 발생한 예외를 처리하고 싶지 않다면
    // 메서드 선언부에 명시하라.
    // 그러면 예외가 발생할 때 호출자에게 자동으로 전달 할 것이다.
    m3(i);
  }

  static void m3(int i) throws Exception {
    // Exception을 던질 때는 반드시 메서드 선언부에 명시해야 한다.
    throw new Exception("예외");
  }

  public static void main(String[] args) {
    try {
      m1(50);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
/*
# Exception의 의미
1) 예외가 발생할 수 있는 메서드에 대해서는
  명확하게 메서드 선언부에 명시함으로써
  개발자가 주의깊게 사용하도록 유도한다.
2) 최종적으로 호출된 메서드에서 예외가 발생할 경우,
   중간에 위치한 메서드들이 그 예외를 처리해야 하기 때문에
   코딩이 불편하다.
3) 그러나, 예외 처리를 강제함으로써 실행 안정성을 어느 정도
  확보할 수 있다.
  "계륵과 같은 존재!" 
*/