package step15;

public class Test2 {
  public static void main(String[] args) {
    CalculatorPlus c = new CalculatorPlus();
    c.init(10);
    c.plus(5);
    c.minus(3);
    c.multiple(2);
    c.divide(3);
    c.remainder(3);
    c.printResult();
  }
}
