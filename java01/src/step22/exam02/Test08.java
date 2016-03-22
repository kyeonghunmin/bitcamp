// 주제 : 바이트 읽기 4

package step22.exam02;

import java.io.File;
import java.io.IOException;
import java.io.FileInputStream;

public class Test08 {
  public static void main(String[] args) throws IOException {
    FileInputStream in = new FileInputStream("exam02.Test05.data");

    byte[] buf = new byte[100];

    // 읽어들인 값을 배열의 특정 index부터 채우는 경우
    int len = in.read(buf, 10, 3); // index 10부터 최대 3개를 읽어서 채운다.
    len = in.read(buf, 10 + len, 5); // 읽은 개수만큼 index를 이동시킨 위치부터 채운다.

    for (int i = 0; i < 20; i++) {
      System.out.println(Integer.toHexString(buf[i]));
    }



    in.close(); // OS 자원 사용 후 해제
  }
}
