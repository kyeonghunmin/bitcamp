public class Min {
  public static void main(String[] args) {

    Calculator calc1 = new Calculator();

    calc1.plus(2);
    calc1.multiple(3);
    calc1.plus(6);
    calc1.minus(7);
    System.out.println(calc1.result);
  }
}
