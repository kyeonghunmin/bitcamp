// 주제 : 원시 타입 값을 읽기 - 데코레이터 사용 전 (1.6~2초)

package step22.exam05;

import java.io.File;
import java.io.IOException;
import java.io.FileInputStream;

public class Test03 {
  public static void main(String[] args) throws IOException {
    FileInputStream in = new FileInputStream("test.pdf");
    long start = System.currentTimeMillis();

    int b = 0;
    int count = 0;
    while ((b = in.read()) != -1) {
      if ((count % 100000) == 0) {
        System.out.print(".");
      }
      count++;
    }
    System.out.println();

    long end = System.currentTimeMillis();
    System.out.printf("걸린시간 : %d\n", end - start);

    in.close();
  }
}
