package step15;

public class Test {
  public static void main(String[] args) {
    Calculator c = new Calculator();
    c.init(10);
    c.plus(5);
    c.minus(3);
    c.printResult();
  }
}
