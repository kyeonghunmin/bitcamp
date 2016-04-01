// 기존 클래스에 기능을 추가하기

package designpattern.command.exam03;

public class Test {

  public static void main(String[] args) {
    Calculator2 c = new Calculator2();
    // 수퍼 클래스의 기능 사용
    c.plus(10, 20);
    c.minus(10, 20);
    
    // 하위 클래스에서 추가한 기능 사용
    c.multiple(10, 20);
  }

}
