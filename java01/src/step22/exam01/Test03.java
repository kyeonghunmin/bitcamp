// 주제 : 디렉토리에 있는 모든 파일 및 디렉토리 목록을 알아내기

package step22.exam01;

import java.io.File;
import java.io.IOException;

public class Test03 {
  public static void main(String[] args) throws IOException {
    File f = new File(".");
    File[] fileList = f.listFiles();
    for (int i = 0; i < fileList.length; i++) {
      File file = fileList[i];
      System.out.println(file.getName());
    }
  }
}
