// 주제 : 원시 타입 값을 읽기 - Java에서 제공하는 데코레이터 사용하기

package step22.exam05;

import java.io.File;
import java.io.IOException;
import java.io.FileInputStream;

public class Test02 {
  public static void main(String[] args) throws IOException {
    FileInputStream in = new FileInputStream("exam04.Test06.data");
    DataInputStream in2 = new DataInputStream(in); // <--- 데코레이터

    short no = in2.readShort();
    int kor = in2.readInt();
    int eng = in2.readInt();
    int math = in2.readInt();

    System.out.println(no);
    System.out.println(kor);
    System.out.println(eng);
    System.out.println(math);

    in2.close();
    in.close();
  }
}
