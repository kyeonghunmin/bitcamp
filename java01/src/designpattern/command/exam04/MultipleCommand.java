// 곱셈 기능을 추가하고 싶다?
// => 기존 클래스의 코드를 변경하지 않고,
//    단지 새 클래스를 만드는 것으로 새 기능을 추가할 수 있다.

package designpattern.command.exam04;

public class MultipleCommand implements Command {
  
  public void execute(int a, int b) {
    System.out.printf("%d * %d = %d\n", a, b, (a * b));
  }
}
