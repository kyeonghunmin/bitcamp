/* 주제 : 블록과 변수 */
package step05;

public class Exam01 {
  public static void main(String[] args) {
    int a = 10;
    {
      //int a = 20; // 오류  // 메서드 블록 안에서 변수를 이중으로 선언할 수 없다.
      a = 20; // 안쪽 블록에서는 바깥쪽 블록의 변수를 사용할 수 있다.
      int b = 30;
    }
    a = 30;
    //b = 40; // 오류 // 블록이 끝나면 그 블록에서 선언한 변수는 삭제된다.
  }
}
