// 주제 : 메모리(바이트 배열)에 있는 바이트 값을 스트림 API를 사용하여 읽기

package step22.exam03;

import java.io.File;
import java.io.IOException;
import java.io.ByteArrayInputStream;

public class Test02 {
  public static void main(String[] args) throws IOException {
    byte[] bytes = {20, 19, 18, 17, 16, 15, 14, 13, 12, 11,
                    10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

    ByteArrayInputStream in = new ByteArrayInputStream(bytes);

    for (int i = 0; i < 10; i++) {
      System.out.println(in.read());  // 기본 10진수로 출력된다.
    }

    in.close();
  }
}
