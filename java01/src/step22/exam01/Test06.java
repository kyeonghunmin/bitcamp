// 주제 : .txt 확장자를 갖는 파일명만 출력

package step22.exam01;

import java.io.File;
import java.io.IOException;
import java.io.FilenameFilter;

public class Test06 {
  public static void main(String[] args) throws IOException {
    File f = new File(".");

    // 현재 폴더에서 파일 이름이 .txt로 끝나는 경우를 모두 필터링한다.
    // => FilenameFilter로는 파일과 디렉토리를 구분할 수 없다.
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
