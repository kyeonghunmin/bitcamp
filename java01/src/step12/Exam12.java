// 주제 : final 상수 활용

package step12;

public class Exam12 {
  public static void main(String[] args) {
    Car9.model = "sonata";  // 컴파일 오류 (상수 값은 한 번 결정되면 바꿀 수 없음)
  }
}
