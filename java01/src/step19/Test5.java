// 주제 : Exception 예외 다루기

package step19;

import java.io.File;
import java.io.FileReader;

public class Test5 {
  public static void main(String[] args) {
    File f = new File("test.txt");  // RuntimeException 계열
    FileReader in = new FileReader("test.txt"); // Exception 계열
  }
}


/*
* File의 생성자
- NullPointerException 예외가 발생할 수 있다.
- 그러나 NullPointerException은 RuntimeException의 하위 클래스이기 때문에
  반드시 예외처리 코드를 작성할 필요는 없다.
- 그래서 new File(); 명령에 대해 컴파일 오류가 발생하지 않은 것이다.

* FileReader의 생성자
- FileNotFoundException 예외가 발생할 수 있다.
- FileNotFoundException은 RuntimeException의 하위 클래스가 아니다.
  따라서 반드시 예외 처리 코드를 포함해야 한다.
  만약, 예외 처리를 하고 싶지 않다면 상위 호출자에게 예외 정보를 전달하는
  코드를 작성해야 한다.
*/
