package step22.exam04;

import java.io.IOException;
import java.io.OutputStream;

public class MyDataOutputStream2 {
  static OutputStream out;

  static void writeShort(short value) throws IOException {
    out.write(value >> 8);
    out.write(value);
  }

  static void writeInt(int value) throws IOException {
    out.write(value >> 24);
    out.write(value >> 16);
    out.write(value >> 8);
    out.write(value);
  }
}
