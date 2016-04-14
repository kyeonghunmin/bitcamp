package step22;

import java.io.File;
import java.io.FileFilter;

public class Test05 {

  public static void main(String[] args) {
    File f = new File(".");
    
    File[] files = f.listFiles(new FileFilter() {
      @Override
      public boolean accept(File file) {
        if (file.isFile()) {
          return true;
        } else {
          return false;
        }
      }
    });

    
    for (File file : files) {
      System.out.println(file.getName());
    }
  }

}
