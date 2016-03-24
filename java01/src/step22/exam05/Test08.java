// 주제 : 인스턴스 출력하기

package step22.exam05;

import java.io.File;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.BufferedOutputStream;
import java.io.DataOutputStream;

public class Test08 {
  public static void main(String[] args) throws IOException {
    Member m1 = new Member("홍길동", 20, 180, 70);
    Member m2 = new Member("임꺽정", 45, 178, 98);

    FileOutputStream out0 = new FileOutputStream("exam05.Test08.data");
    BufferedOutputStream out1 = new BufferedOutputStream(out0);
    DataOutputStream out = new DataOutputStream(out1);

    out.writeUTF(m1.name);
    out.writeInt(m1.age);
    out.writeInt(m1.height);
    out.writeInt(m1.weight);

    out.writeUTF(m2.name);
    out.writeInt(m2.age);
    out.writeInt(m2.height);
    out.writeInt(m2.weight);

    out.close();
    out1.close();
    out0.close();
  }
}
