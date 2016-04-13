// 주제 : final

package step13;

public class Exam09 {
  public static void main(String[] args) {
    int a;
    final int b;  // 오직 한 번만 할당할 수 있다.

    a = 20;
    b = 20; // 가능.

    a = 30;
    // b = 30; // b = 20; 으로 한 번 할당했기 때문에 재할당이 불가.
  }
}

/*
로컬 변수에 final 붙임
- 한 번만 할당할 수 있다.
*/
                                                                
