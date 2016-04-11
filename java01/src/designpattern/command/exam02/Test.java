// 기존 클래스에 기능을 추가하기

package designpattern.command.exam02;

public class Test {

  public static void main(String[] args) {
    Calculator c = new Calculator();
    c.plus(10, 20);
    c.minus(10, 20);
    // 추가한 기능 사용
    c.multiple(10, 20);
  }

}