// 주제 : 대용량 데이터 쓰기 - 버퍼링 데코레이터 사용 전

package step22.exam05;

import java.io.File;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.BufferedInputStream;

public class Test06 {
  public static void main(String[] args) throws IOException {
    FileOutputStream out = new FileOutputStream("exam05.Test06.data");
    long start = System.currentTimeMillis();

    for (int i = 0; i < 5000000; i++) {   // 500만 바이트 출력
      out.write(0x41);    //
    }

    long end = System.currentTimeMillis();
    System.out.printf("걸린시간 : %d\n", end - start);

    out.close();
  }
}
