// 주제 : 파일 정보 다루기

package step22.exam01;

import java.io.File;
import java.io.IOException;

public class Test01 {
  public static void main(String[] args) throws IOException {
    File f = new File("../project01/src/bitcamp/pms/ProjectApp.java"); // . : 현재 경로
    System.out.printf("getName() : %s\n", f.getName());
    System.out.printf("getPath() : %s\n", f.getPath());
    System.out.printf("getAbsolutePath() : %s\n", f.getAbsolutePath());
    System.out.printf("getCanonicalPath() : %s\n", f.getCanonicalPath());
    System.out.printf("getParent() : %s\n", f.getParent());
    System.out.printf("length() : %s\n", f.length());
    System.out.printf("toURI() : %s\n", f.toURI());
    System.out.printf("isFile() : %s\n", f.isFile());
    System.out.printf("isDirectory() : %s\n", f.isDirectory());
    System.out.printf("exists() : %s\n", f.exists());
    System.out.printf("getTotalSpace() : %s\n", f.getTotalSpace());
    System.out.printf("getUsableSpace() : %s\n", f.getUsableSpace());
    System.out.printf("getFreeSpace() : %s\n", f.getFreeSpace());
    long millis = f.lastModified();
    java.sql.Date date = new java.sql.Date(millis);
    System.out.printf("lastModified() : %s\n", date.toString());
  }
}
