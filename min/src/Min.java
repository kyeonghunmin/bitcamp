public class Min {
  static int digitSum(int n) {
    int result = 0;

    while ((n != 0) {
      result += (n % 10);
      n /= 10;
    }

    return result;
  }
  public static void main(String[] args) {

    System.out.println(digitSum(323));

  }
}
