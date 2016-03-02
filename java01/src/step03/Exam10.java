/* 주제 : String 주요 도구 사용법4 */
package step03;

public class Exam10 {
  public static void main(String[] args) {
    String s1 = "ABCDEFGHIJKKMKOP";
    char c = s1.charAt(6);    // s1에서 6번째의 값을 c에 저장한다.
    System.out.println(c);

    int i = s1.indexOf('K');  // 첫 번째로 만난 문자의 인덱스를 리턴한다.
    System.out.println(i);

    i = s1.lastIndexOf('K');  // 뒤에서 부터 찾는다. 처음 만난 문자의 인덱스.
    System.out.println(i);

    i = s1.indexOf("HIJ");    // 앞쪽에서 부터 찾는다.
    System.out.println(i);

    i = s1.lastIndexOf("HIJ");// 뒤쪽에서 부터 찾는다.
    System.out.println(i);

    String str = s1.substring(6); // 6번부터 끝까지 문자열 추출
    System.out.println(str);

    str = s1.substring(6, 10);    // 6 <= index < 10
    System.out.println(str);
  }
}
