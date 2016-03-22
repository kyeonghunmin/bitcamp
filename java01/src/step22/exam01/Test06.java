// 주제 : .txt 확장자를 갖는 파일명만 출력

package step22.exam01;

import java.io.File;
import java.io.IOException;
import java.io.FilenameFilter;

public class Test06 {
  public static void main(String[] args) throws IOException {
    File f = new File(".");

    File[] files = f.listFiles(new FilenameFilter() {
      @Override
      public boolean accept(File dir, String name) {
        File temp = new File(dir, name);
        if (temp.isFile() && name.endsWith(".txt")) {
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
