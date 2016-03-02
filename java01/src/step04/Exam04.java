/* 주제 : 조건 연산자 사용 */
package step04;

public class Exam04 {
  public static void main(String[] args) {
    int age = 14;
    int price = (age <= 13) ? 9900 : 13900;
    System.out.println(price);

    System.out.println((age <= 13) ? "아동" : "성인");
  }
}
