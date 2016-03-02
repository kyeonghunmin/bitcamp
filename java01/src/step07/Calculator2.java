/* 중간 계산 결과를 저장할 공용 변수를 추가한다.
 */
 package step07;

public class Calculator2 {
  // 클래스 공용 변수 => "클래스 변수" 또는 "스태틱 변수" 라고 부른다.
  // => 이 클래스의 모든 메서드가 사용하는 변수이다.
  // => 굳이 초기화시키지 않아도 기본으로 0으로 초기화된다.
  // => 클래스의 메서드가 공유하는 값을 저장할 때 사용한다.

  static int result;    // 따로 초기화를 하지 않아도, 기본으로 0으로 초기화된다.

  static void plus(int a) {
    result += a;
  }
  static void minus(int a) {
    result -= a;
  }
  static void multiple(int a) {
    result *= a;
  }
  static void divide(int a) {
    result /= a;
  }
}
