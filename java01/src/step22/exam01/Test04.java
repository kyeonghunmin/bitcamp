// 주제 : 디렉토리에 있는 파일 목록 (디렉토리 제외)

package step22.exam01;

import java.io.File;
import java.io.IOException;

public class Test04 {
  public static void main(String[] args) throws IOException {
    File f = new File(".");
    File[] fileList = f.listFiles();
    for (File file : fileList) {
      if (file.isFile()) {
        System.out.println(file.getName());
      }
    }
  }
}
