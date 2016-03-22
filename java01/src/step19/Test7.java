// 주제 : Exception 예외 다루기3 - throws

package step19;

import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;

public class Test7 {
  public static void main(String[] args) throws FileNotFoundException {
    File f = new File("test.txt");

    FileReader in = new FileReader("test.txt");
    System.out.println("해당 파일을 찾았습니다.");
  }
}

/*
* throws 명령
 - 상위 호출자에게 오류 상황을 알리는 문법.
 - 만약 상위 호출자가 JVM이라면 즉시 실행을 멈춘다.
 - 주의!
   => 사용을 자제하라.
   => 왜냐하면 상위 호출자가 JVM일 경우, 즉시 실행을 멈추기 때문이다.
   => 즉 예외 처리를 하지 않은 결과가 발생한다.
      => 예외 처리 문법이 왜 필요한가?
         예외가 발생했을 때 시스템이 멈추지 않고 적절한 조치를 취한 후
         계속 실행하기 위함
         => 따라서 예외 상황을 상위 호출자에게 넘기는 경우,
            JVM에게 전달되지 않도록 더욱 주의하라!
*/
