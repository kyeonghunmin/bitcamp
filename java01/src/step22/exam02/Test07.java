// 주제 : 바이트 읽기 3

package step22.exam02;

import java.io.File;
import java.io.IOException;
import java.io.FileInputStream;

public class Test07 {
  public static void main(String[] args) throws IOException {
    FileInputStream in = new FileInputStream("exam02.Test05.data");

    byte[] buf = new byte[100]; // 바이트 배열 준비
    int len = in.read(buf); // 읽은 데이터를 buf에 넣는다. ()리턴값 : 읽은 개수)

    for (int i = 0; i < len; i++) { // 읽은 개수만큼 반복
      System.out.println(Integer.toHexString(buf[i]));  // buf[i]의 값을 16진수로 출력
      // ffffffea 출력되는 이유
      // Integer.toHexString()을 할때 byte가 int로 바뀐다.
      // 이때, ea는 11101010이기 때문에 정수 입장에서는 음수로 간주한다.
      // 결국 앞을 모두 1로 표시하여 음수를 유지하기 때문이다.
    }


    in.close(); // OS 자원 사용 후 해제
  }
}
