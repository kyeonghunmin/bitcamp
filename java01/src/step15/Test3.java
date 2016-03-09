package step15;

public class Test3 {
  public static void main(String[] args) {
    DeveloperCalculator c = new DeveloperCalculator();
    c.init(10);
    c.plus(5);
    c.multiple(3);

    c.printResult();
    c.printResult(2);
    c.printResult(8);
    c.printResult(16);
    c.printResult(10);
  }
}
