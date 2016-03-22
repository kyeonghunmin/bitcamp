// 주제 :

package step22.exam01;

import java.io.File;
import java.io.IOException;
import java.io.FileFilter;

public class Test05 {
  public static void main(String[] args) throws IOException {
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
