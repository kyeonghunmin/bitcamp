// 주제 : 원시 타입 값을 출력하기

package step22.exam04;

import java.io.File;
import java.io.IOException;
import java.io.FileOutputStream;

public class Test01 {
  public static void main(String[] args) throws IOException {
    FileOutputStream out = new FileOutputStream("exam04.Test01.data");

    short no = 17;
    int kor = 100;
    int eng = 89;
    int math = 75;

    out.write(no >> 8);
    out.write(no);
    out.write(kor >> 24);
    out.write(kor >> 16);
    out.write(kor >> 8);
    out.write(kor);
    out.write(eng >> 24);
    out.write(eng >> 16);
    out.write(eng >> 8);
    out.write(eng);
    out.write(math >> 24);
    out.write(math >> 16);
    out.write(math >> 8);
    out.write(math);

    out.close();
  }
}
