// 주제 : 인스턴스 출력하기 - ObjectOutputStream 데코레이터 사용

package step22.exam05;

import java.io.File;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.BufferedOutputStream;
import java.io.ObjectOutputStream;

public class Test10 {
  public static void main(String[] args) throws IOException {
    Member2 m1 = new Member2("홍길동", 20, 180, 70);
    Member2 m2 = new Member2("임꺽정", 45, 178, 98);

    FileOutputStream out0 = new FileOutputStream("exam05.Test10.data");
    BufferedOutputStream out1 = new BufferedOutputStream(out0);
    ObjectOutputStream out = new ObjectOutputStream(out1);

    out.writeObject(m1);
    out.writeObject(m2);

    out.close();
    out1.close();
    out0.close();
  }
}

// ObjectOutputStream
// - writeObject(instance) : 인스턴스를 바이트 배열로 변환하여 출력한다. (Serialize, Marshaling)
//   => 클래스 정보
//   => 인스턴스 데이터
//
// ObjectInputStream
// - readObject() : 바이트 배열을 읽어서 인스턴스를 생성한다. (Deserialize, Unmarshaling)


// Java는 기본으로 보안 때문에 Serialize를 막는다
// => 별도의 선언을 해야한다.
// => class Member implements Serializable {}
