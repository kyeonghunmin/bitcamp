/* 인스턴스 주소를 쉽게 받는 메서드 - 인스턴스 메서드
 */
 package step07;

public class Calculator4 {

  int result;   // 인스턴스 변수

  // 인스턴스 메서드를 실행할 때 넘어오는 인스턴스 주소는
  // 메서드의 감춰진 변수인 this에 자동 보관된다.
  // => 따라서 이 메서드를 호출할 때는 반드시 인스턴스 주소를 줘야 한다.
  // => 그래서 "인스턴스 메서드" 라고 부른다.
  void plus(/*Calculator4 this,*/ int a) {    // this 가 숨겨져 있다.
    this.result += a;
  }
  void minus(int a) {
    this.result -= a;
  }
  void multiple(Calculator4 this, int a) {
    this.result *= a;
  }
  void divide(Calculator4 this, int a) {
    this.result /= a;
  }
}
