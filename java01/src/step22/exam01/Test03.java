// 주제: 디렉토리에 있는 모든 파일(디렉토리 포함) 목록을 알아내기
package step22.exam01;

import java.io.File;
import java.io.IOException;

public class Test03 {
  public static void main(String[] args) throws IOException {
    File f = new File(".");

    // 현재 폴더의 파일과 디렉토리 이름을 모두 출력한다.
    String[] fileNames = f.list();
    for (int i = 0; i < fileNames.length; i++){
      System.out.println(fileNames[i]);
    }

  }

}
