/* 주제 : 조건문 if ~ else 중첩2 */
package step05;

public class Exam05 {
  public static void main(String[] args) {
    int age = 72;
    if (age <= 13)
      System.out.println("아동");
    else if (age <= 18)
      System.out.println("청소년");
    else if (age <= 50)
      System.out.println("장년");
    else if (age <= 60)
      System.out.println("중년");
    else
      System.out.println("노인");

    // 실무버전 => 블록으로 감싼다.
    if (age <= 13) {
      System.out.println("아동");
    } else if (age <= 18) {
      System.out.println("청소년");
    } else if (age <= 50) {
      System.out.println("장년");
    } else if (age <= 60) {
      System.out.println("중년");
    } else {
      System.out.println("노인");
    }
  }
}
