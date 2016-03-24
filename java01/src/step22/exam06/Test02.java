// 주제 : 문자 읽기

package step22.exam06;

import java.io.IOException;
import java.io.FileReader;
import java.io.FileInputStream;

public class Test02 {
  public static void main(String[] args) throws IOException {
    FileReader in = new FileReader("exam06.Test01.data");

    int c;

    while ((c = in.read()) != -1) {     // UTF-8을 UTF-16로 변환
      System.out.println(Integer.toHexString(c));
    }
    in.close();
    // FileReader는 데이터가 UTF-8(OS 기본 문자 집합) 이라고 간주하고
    // 해당 바이트들을 읽어서 2byte UTF-16으로 변환하여 리턴한다.
    // => binary 데이터를 FileReader를 사용해서 읽으면 안된다. (text만 가능)

    System.out.println("----------------");

    FileInputStream in2 = new FileInputStream("exam06.Test01.data");

    while ((c = in2.read()) != -1) {    // byte를 읽어 byte를 리턴
      System.out.println(Integer.toHexString(c));
    }
    in2.close();
  }
}
