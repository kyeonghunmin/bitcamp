package step22;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;

public class Test06 {

  public static void main(String[] args) throws IOException {
    File f = new File(".");
    
    File[] files = f.listFiles(new FilenameFilter() {
      @Override
      public boolean accept(File dir, String name) {
        File temp = new File(dir, name);
        if (temp.isFile() && name.endsWith(".ject")) {
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
