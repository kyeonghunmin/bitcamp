// 주제 : throws의 다형성

package step19;

public class Test13 {
  static void m1(int i) throws AgeException {
    throw new AgeException();
  }

  // throws 절에 상위 클래스를 지정할 수 있다.
  static void m2(int i) throws AgeException {
    throw new ChildException();
  }

  static void m3(int i) throws Throwable {
    throw new ChildException();
  }

  // 메서드에서 여러 개의 예외를 던질 때,
  // throws 절에 나열하라!
  static void m4(int i) throws ChildException, OldManException {
    if (i < 17)
      throw new ChildException();
    else
      throw new OldManException();
  }

  // 메서드에서 여러 개의 예외를 던질 때,
  // throws 절에 여러 예외의 상위 클래스를 명시할 수 있다.
  static void m5(int i) throws AgeException {
    if (i < 17)
      throw new ChildException();
    else
      throw new OldManException();
  }

  public static void main(String[] args) {
    try {
      m1(50);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
