// 주제 : 바이트 출력하기 4

package step22.exam02;

import java.io.File;
import java.io.IOException;
import java.io.FileOutputStream;

public class Test04 {
  public static void main(String[] args) throws IOException {
    FileOutputStream out = new FileOutputStream("exam02.Test04.data");

    byte[] bytes = {0x2a, 0x3b, 0x4c, 0x5d, 0x6f, 0x7a};

    out.write(bytes, 2, 3);
    // 배열의 index 2부터 3개를 의미한다.

    out.close();
  }
}
