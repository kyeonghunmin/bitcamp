// 주제 : 대용량 데이터 쓰기 - 버퍼링 데코레이터 사용 후

package step22.exam05;

import java.io.File;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.BufferedOutputStream;

public class Test07 {
  public static void main(String[] args) throws IOException {
    FileOutputStream out0 = new FileOutputStream("exam05.Test07.data");
    BufferedOutputStream out = new BufferedOutputStream(out0);

    long start = System.currentTimeMillis();

    for (int i = 0; i < 5000000; i++) {   // 500만 바이트 출력
      out.write(0x41);
    }

    long end = System.currentTimeMillis();
    System.out.printf("걸린시간 : %d\n", end - start);

    // out.flush();    // close() 안하고 강제로 버퍼 내용을 출력하게 하는 명령
    out.close();    // 마지막 부터 close 할 것
    out0.close();   // 안하면 JVM이 자동 해제
    // 보통 flush 말고 close를 사용할 것.
  }
}
