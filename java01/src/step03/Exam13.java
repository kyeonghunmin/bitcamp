/* 주제 : String 주요 도구 사용법7 */
package step03;

public class Exam13 {
  public static void main(String[] args) {

    // 문자열로 primitive 값을 만들기
    String s1 = "1250";
    String s2 = "3.14";
    String s3 = "true";

    int i = Integer.parseInt(s1);   // String --> int
    float f = Float.parseFloat(s2);   // String --> float
    boolean b = Boolean.parseBoolean(s3);   // String --> boolean

    System.out.printf("%d, %f, %b\n", i, f, b);
  }
}
