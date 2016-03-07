/* 주제 : 변수와 메서드 정리 - 인스턴스 변수의 this 생략, static 변수의 클래스명 생략
 */
package step12;

public class Exam10 {
  public static void main(String[] args) {

    Car7 c1 = new Car7("티코", "비트자동차", 2000, 5);
    Car7 c2 = new Car7("그렌저", "비트자동차", 3000, 5);
    Car7 c3 = new Car7();

    c3.setModel("코란도");
    c3.setMaker("비트자동차");
    c3.setCc(3500);
    c3.setCapacity(-30);  // 컴파일, 실행은 되지만 값이 입력되지는 않는다.

    System.out.printf("%d, %s, %s, %d, %d\n",
        c1.getNo(), c1.getModel(), c1.getMaker(), c1.getCc(), c1.getCapacity());

    System.out.printf("%d, %s, %s, %d, %d\n",
        c2.getNo(), c2.getModel(), c2.getMaker(), c2.getCc(), c2.getCapacity());

    System.out.printf("%d, %s, %s, %d, %d\n",
        c3.getNo(), c3.getModel(), c3.getMaker(), c3.getCc(), c3.getCapacity());
  }
}

/*










*/
