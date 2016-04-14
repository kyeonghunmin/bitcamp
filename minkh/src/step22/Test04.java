package step22;

import java.io.File;

public class Test04 {

  public static void main(String[] args) {
    File f = new File(".");
    
    File[] files = f.listFiles();
    for (File file : files) {
      if (file.isFile()) {
        System.out.println(file.getName());
      }
    }

  }

}
