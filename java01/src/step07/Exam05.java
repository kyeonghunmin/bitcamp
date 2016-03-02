/* 주제 : 메서드의 인스턴스 주소를 쉽게 전달하기 */
package step07;

public class Exam05 {
  public static void main(String[] args) {
    // 문제 : 2 * 3 + 6 - 7 = ?
    // 문제 : 3 - 7 * 2 + 27 = ?

    Calculator4 calc1 = new Calculator4();
    Calculator4 calc2 = new Calculator4();

    // 인스턴스의 주소를 파라미터가 아닌 메서드 이름 앞에 기술한다.
    // => 그 메서드가 어떤 인스턴스에 대해 작업을 수행하는 지
    //    직관적으로 알 수 있다.
    calc1.plus(2);
    calc2.plus(3);

    calc1.multiple(3);
    calc2.minus(7);

    calc1.plus(6);
    calc2.multiple(2);

    calc1.minus(7);
    calc2.plus(27);

    System.out.println(calc1.result);
    System.out.println(calc2.result);
  }
}
