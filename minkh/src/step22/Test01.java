package step22;

import java.io.FileOutputStream;

public class Test01 {

  public static void main(String[] args) throws Exception {
    FileOutputStream out = new FileOutputStream("exam02.Test01.data");
    
    int value = 0x2a3b4c5d;
    
    out.write(value);
    
    out.close();
  }

}
