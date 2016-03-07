/* 주제 : 변수와 메서드 정리 - 캡슐화 적용
 */
package step12;

public class Exam08 {
  public static void main(String[] args) {

    Car5 c1 = new Car5("티코", "비트자동차", 2000, 5);
    Car5 c2 = new Car5("그렌저", "비트자동차", 3000, 5);
    Car5 c3 = new Car5();

    c3.setModel("코란도");
    c3.setMaker("비트자동차");
    c3.setCc(3500);
    c3.setCapacity(-30);  // 컴파일, 실행은 되지만 값이 입력되지는 않는다.

    System.out.printf("%s, %s, %d, %d\n",
        c3.getModel(), c3.getMaker(), c3.getCc(), c3.getCapacity());
  }
}

/*










*/
