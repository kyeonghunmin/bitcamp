/* 주제 : 문자열 배열 */
package step02;

public class Exam11 {
  public static void main(String[] args) {
    String[] names = new String[3];
    names[0] = "홍길동";
    names[1] = "임꺽정";
    names[2] = "유관순";

    String[] names2;
    names2 = new String[] {"홍길동", "임꺽정", "유관순"};

    String[] names3 = {"홍길동", "임꺽정", "유관순"};

    System.out.printf("%s, %s, %s\n", names[0], names2[1], names3[2]);
  }
}
