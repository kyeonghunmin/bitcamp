/* 주제 : 반복문 do ~ while */
package step05;

public class Exam11 {
  public static void main(String[] args) {
    int count = 10;
    do {
      System.out.println(count++);
    } while (count < 10);     // 참이면 다시 do 블록을 반복 실행한다.


    // do ~ while
    // => 조건이 참이든 거짓이든 최소한 한 번은 실행한다.
  }
}
