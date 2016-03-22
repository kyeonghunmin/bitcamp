package step22.exam04;

import java.io.IOException;
import java.io.OutputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;

public class MyDataOutputStream4 extends FileOutputStream {
  public MyDataOutputStream4(String name) throws FileNotFoundException {
    super(name);
  }

  public void writeShort(short value) throws IOException {
    this.write(value >> 8);
    this.write(value);
  }

  public void writeInt(int value) throws IOException {
    this.write(value >> 24);
    this.write(value >> 16);
    this.write(value >> 8);
    this.write(value);
  }
}
