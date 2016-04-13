// 주제 : final 상수 활용

package step12;

public class Exam12 {
  public static void main(String[] args) {
    // Car9.model = "sonata";  // 컴파일 오류 (상수 값은 한 번 결정되면 바꿀 수 없음)
  }
}
/*
# 클래스 변수 앞에 final을 붙이는 경우
- 주로 조회용 값을 저장하고 싶을 때.
- 클래스가 로딩될 때 딱 한번만 만들기 위해
  static 과 함께 사용한다.
*/