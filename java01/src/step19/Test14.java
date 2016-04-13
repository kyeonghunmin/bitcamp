// 주제 : catch의 다형성

package step19;

public class Test14 {
  static void m1(int i) throws AgeException {
    throw new AgeException();
  }

  static void m2(int i) throws ChildException {
    throw new ChildException();
  }

  static void m3(int i) throws OldManException {
    throw new OldManException();
  }

  public static void main(String[] args) {
    try {
      m3(10);
    // } catch (OldManException e) {  // 정확하게 클래스 지정
    // } catch (AgeException e) {  // 상위 클래스를 지정할 수 있다.
    // } catch (Exception e) {  // 더 상위 클래스 지정 가능.
    } catch (Throwable e) {  // 더 상위 클래스 지정 가능.
    // } catch (Object e) {       // 오류 (Object는 안됨; Throwable만 가능)
      e.printStackTrace();
    }
  }
}
