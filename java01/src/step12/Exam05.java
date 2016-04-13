/* 주제 : 인스턴스 변수의 사용
 */
package step12;

public class Exam05 {
  public static void main(String[] args) {
    // instance 변수에 접근하려면 다음과 같이 클래스 이름으로 접근할 수 없다.
    /*
    Car2.model = "티코";
    Car2.maker = "비트자동차";
    Car2.cc = 2000;
    Car2.capacity = 5;
    */

    // instance 변수에 접근하려면
    // 그 클래스의 인스턴스(클래스 설계도에 따라 준비한 메모리)를 생성한다.
    Car2 c1 = new Car2(); // 인스턴스(model, maker, cc, capacity) 한 개 준비
    Car2 c2 = new Car2();
    Car2 c3 = new Car2();

    c1.model = "티코";
    c1.maker = "비트자동차";
    c1.cc = 2000;
    c1.capacity = 5;

    c2.model = "그렌저";
    c2.maker = "비트자동차";
    c2.cc = 3000;
    c2.capacity = 5;

    c3.model = "코란도";
    c3.maker = "비트자동차";
    c3.cc = 3500;
    c3.capacity = 2;
  }
}

/*










*/
