/* 주제 : 변수와 메서드 정리 - 생성자 오버로딩
 */
package step12;

public class Exam07 {
  public static void main(String[] args) {

    Car4 c1 = new Car4("티코", "비트자동차", 2000, 5);
    Car4 c2 = new Car4("그렌저", "비트자동차", 3000, 5);
    Car4 c3 = new Car4();

    c3.model = "코란도";
    c3.maker = "비트자동차";
    c3.cc = 3500;
    c3.capacity = 2;
  }
}

/*










*/
