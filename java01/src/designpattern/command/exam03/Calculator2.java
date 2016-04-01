package designpattern.command.exam03;

// 2) 상속을 통해 기능을 추가한다.
public class Calculator2 extends Calculator {
  
  public void multiple(int a, int b) {
    System.out.printf("%d * %d = %d\n", a, b, (a * b));
  }
  
  
}
