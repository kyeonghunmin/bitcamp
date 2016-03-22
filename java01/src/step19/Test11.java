// 주제 : RuntimeException의 이해 2 - 활용법

package step19;

public class Test11 {
  static void m1(int i) {
    if (i < 17) {
      throw new RuntimeException("17세 미만");
      // return; // throw 문장은 return 없이 바로 리턴한다.
    }
    m2(i);
  }

  static void m2(int i) {
    if (i > 70) {
      throw new RuntimeException("70세 초과");
    }
    m3(i);
  }

  static void m3(int i) {
    throw new RuntimeException("예외");
  }

  public static void main(String[] args) {
    try {
      m1(50);
    } catch (RuntimeException e) {
      e.printStackTrace();
    }
  }
}
