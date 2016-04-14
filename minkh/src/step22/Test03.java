package step22;

import java.io.File;

public class Test03 {

  public static void main(String[] args) {
    File f = new File(".");

    String[] fileNames = f.list();
    for (int i = 0; i < fileNames.length; i++) {
      System.out.println(fileNames[i]);
    }
    
    System.out.println("====================");
    
    for (String s : fileNames) {
      System.out.println(s);
    }
  }

}
