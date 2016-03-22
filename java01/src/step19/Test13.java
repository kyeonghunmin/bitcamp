// 주제 : throws의 다형성

package step19;

public class Test13 {
  static void m1(int i) throws AgeException {
    throw new AgeException();
  }

  static void m2(int i) throws AgeException {
    throw new ChildException();
  }

  static void m3(int i) throws Throwable {
    throw new ChildException();
  }

  static void m4(int i) throws ChildException, OldManException {
    if (i < 17)
      throw new ChildException();
    else
      throw new OldManException();
  }

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
