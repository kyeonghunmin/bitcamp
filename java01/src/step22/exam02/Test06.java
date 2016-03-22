// 주제 : 바이트 읽기 2

package step22.exam02;

import java.io.File;
import java.io.IOException;
import java.io.FileInputStream;

public class Test06 {
  public static void main(String[] args) throws IOException {
    FileInputStream in = new FileInputStream("exam02.Test05.data");

    int b;
    while ((b = in.read()) != -1) {
      System.out.println(Integer.toHexString(b));
    }

    in.close(); // OS 자원 사용 후 해제
  }
}
