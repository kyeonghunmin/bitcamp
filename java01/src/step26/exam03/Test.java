package step26.exam03;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.Writer;

public class Test {

  public static void main(String[] args) throws Exception {
    // Writer 계열의 클래스만 지정 가능!
    //Box<String> box = new Box<>(); // 컴파일 오류 (Writer의 하위가 아니기 때문)
    //Box<Object> box2 = new Box<>(); // 컴파일 오류
    
    // Writer 계열만 가능
    Box<FileWriter> box3 = new Box<>();
    box3.setValue(new FileWriter(""));
    
    Box<Writer> box4 = new Box<>();
    box4.setValue(new FileWriter(""));
    box4.setValue(new BufferedWriter(null));
         
  }
}
