// 주제 : 원시 타입 값을 출력하기 - Refactoring(Test01 개선) 4 (인스턴스 멤버 사용)

package step22.exam04;

import java.io.File;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class Test05 {
  public static void main(String[] args) throws IOException {
    // exam04.Test02.data : 출력하는 파일명
    FileOutputStream out = new FileOutputStream("exam04.Test05.data");
    // ByteArrayOutputStream out = new ByteArrayOutputStream();
    // MyDataOutputStream3의 생성자 파라미터가 OutputStream이기 때문에
    // 둘다 사용 가능하다.

    short no = 17;
    int kor = 100;
    int eng = 89;
    int math = 75;

    // out을 넘겨주지 않으면 인스턴스를 생성할 수 없다.
    // => MyDataOutputStream3의 생성자가 반드시 파라미터를 받기 때문임.
    MyDataOutputStream3 helper = new MyDataOutputStream3(out);
    helper.writeShort(no);
    helper.writeInt(kor);
    helper.writeInt(eng);
    helper.writeInt(math);

    out.close();
  }
}
