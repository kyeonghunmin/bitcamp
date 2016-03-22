// 주제 : 바이트 값을 메모리(바이트 배열)로 출력하기

package step22.exam03;

import java.io.File;
import java.io.IOException;
import java.io.ByteArrayOutputStream;

public class Test01 {
  public static void main(String[] args) throws IOException {
    ByteArrayOutputStream out = new ByteArrayOutputStream();

    int value = 0x2a3b4c5d;  // 708529245 (10진수)

    // ByteArrayOutputStream이 관리하는 내부 바이트 배열에 출력한다.
    // => 메모리에 데이터를 저장할때도 파일로 출력하는 것처럼
    //    프로그래밍을 짤 수 있다.
    // => 데이터를 저장하는 대상이 파일이든, 메모리이든
    //    일관된 방식(read/write)으로 프로그래밍을 할 수 있다.
    // => 이것이 스트림 프로그래밍이다.
    out.write(value >> 24);
    out.write(value >> 16);
    out.write(value >> 8);
    out.write(value);

    out.close();

    // out에 담겨있는 데이터를 바이트 배열로 가져온다.
    byte[] bytes = out.toByteArray();
    for (byte b : bytes) {
      System.out.println(Integer.toHexString(b));
    }

  }
}
