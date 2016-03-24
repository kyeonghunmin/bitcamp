// 주제 : 인스턴스 읽기

package step22.exam05;

import java.io.File;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.BufferedInputStream;
import java.io.DataInputStream;

public class Test09 {
  public static void main(String[] args) throws IOException {
    FileInputStream in0 = new FileInputStream("exam05.Test08.data");
    BufferedInputStream in1 = new BufferedInputStream(in0);
    DataInputStream in = new DataInputStream(in1);

    Member m1 = new Member();
    m1.name = in.readUTF();
    m1.age = in.readInt();
    m1.height = in.readInt();
    m1.weight = in.readInt();

    Member m2 = new Member();
    m2.name = in.readUTF();
    m2.age = in.readInt();
    m2.height = in.readInt();
    m2.weight = in.readInt();

    in.close();
    in1.close();
    in0.close();

    System.out.println(m1);
    System.out.println(m2);
  }
}
