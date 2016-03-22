// 주제 : 바이트 출력하기 2

package step22.exam02;

import java.io.File;
import java.io.IOException;
import java.io.FileOutputStream;

public class Test02 {
  public static void main(String[] args) throws IOException {
    FileOutputStream out = new FileOutputStream("exam02.Test02.data");

    int value = 0x2a3b4c5d;

    out.write(value >> 24);
    out.write(value >> 16);
    out.write(value >> 8);
    out.write(value);

    out.close();
  }
}
