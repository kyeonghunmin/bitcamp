package step22.exam04;

import java.io.IOException;
import java.io.OutputStream;

public class MyDataOutputStream3 {
  OutputStream out;

  // 생성자의 존재 이유?
  // => 객체를 사용하는데 필요한 최소한의 준비를 시키는 메서드
  // 이 클래스는 out이 반드시 필요하다.
  // 때문에, 생성자에서 out 파라미터가 있어야만 객체가 만들어지도록 했다.
  public MyDataOutputStream3(OutputStream out) {
    this.out = out;
  }

  // 생성자에서 OutputStream 타입으로 받았기 때문에
  // 그 하위 클래스들은 모두 write()를 사용할 수 있다.
  public void writeShort(short value) throws IOException {
    out.write(value >> 8);
    out.write(value);
  }

  public void writeInt(int value) throws IOException {
    out.write(value >> 24);
    out.write(value >> 16);
    out.write(value >> 8);
    out.write(value);
  }
}
