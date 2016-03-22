// 주제 : 왜 Exception을 상속 받는가?

package step19;

public class Test16 {
  static void m1(int i) throws Exception {
    if (i < 17) {
      throw new Exception("17세 미만입니다.");
    } else if (i > 70) {
      throw new Exception("70세 초과입니다.");
    } else {
      System.out.println("오호라...");
    }
  }

  static void m2(int i) throws ChildException, OldManException {
    if (i < 17) {
      throw new ChildException("17세 미만입니다.");
    } else if (i > 70) {
      throw new OldManException("70세 초과입니다.");
    } else {
      System.out.println("오호라...");
    }
  }

  public static void main(String[] args) {
    try {
      m1(10);
    } catch (Exception e) {
      e.printStackTrace();
    }

    try {
      m2(10);
    } catch (ChildException e) {
      e.printStackTrace();
    } catch (OldManException e) {
      e.printStackTrace();
    }
  }
}
