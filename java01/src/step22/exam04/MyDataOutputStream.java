package step22.exam04;

import java.io.IOException;
import java.io.OutputStream;

public class MyDataOutputStream {
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
}
