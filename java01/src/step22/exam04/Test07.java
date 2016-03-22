// 주제 : 원시 타입 값을 출력하기 - Refactoring(Test01 개선) 6 (Decorator 패턴)

package step22.exam04;

import java.io.File;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class Test07 {
  public static void main(String[] args) throws IOException {
    // 실제 작업을 수행할 객체를 준비한다.
    FileOutputStream out = new FileOutputStream("exam04.Test07.data");

    // 작업할 객체의 보조 기능을 장착한다.
    // => 보조 기능을 가진 객체 : 데코레이터
    // => 보조 기능은 필요할 때 언제나 붙일 수 있다.
    //    필요 없으면 떼면 된다.
    OutputStreamDecorator1 d1 = new OutputStreamDecorator1(out);
    OutputStreamDecorator2 d2 = new OutputStreamDecorator2(d1);

    short no = 17;
    int kor = 100;
    int eng = 89;
    int math = 75;

    d1.writeShort(no);
    d2.writeInt(kor);
    d2.writeInt(eng);
    d2.writeInt(math);

    out.close();
  }
}
