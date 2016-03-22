// 주제 : 원시 타입 값을 출력하기 - Refactoring(Test01 개선) (메서드로 분리)

package step22.exam04;

import java.io.File;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class Test02 {
  // 메서드 2개 추가한다.
  static void writeShort(OutputStream out, short value) throws IOException {
    out.write(value >> 8);
    out.write(value);
  }

  static void writeInt(OutputStream out, int value) throws IOException {
    out.write(value >> 24);
    out.write(value >> 16);
    out.write(value >> 8);
    out.write(value);
  }

  public static void main(String[] args) throws IOException {
    // exam04.Test02.data : 출력하는 파일명
    FileOutputStream out = new FileOutputStream("exam04.Test02.data");

    short no = 17;
    int kor = 100;
    int eng = 89;
    int math = 75;

    writeShort(out, no);
    writeInt(out, kor);
    writeInt(out, eng);
    writeInt(out, math);

    out.close();
  }
}
