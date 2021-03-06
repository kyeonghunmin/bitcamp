
// 출처: codefights.com
// 한 줄에 버그가 있다. 고쳐라!
/*
A round number is informally considered to be an integer that ends with one or more zeros.
Find the smallest round number that is not less than a given value.
Example
nearestRoundNumber(122) = 130
[input] integer value
[output] integer
*/
package quiz;

public class Test20 {
  static int nearestRoundNumber(int value) {

    while (value % 10 != 0) {     // /  ===>  %
      value++;
    }
    return value;
  }

  public static void main(String[] args) {
    System.out.println(nearestRoundNumber(122));

  }

}
