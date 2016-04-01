package step26.exam04;

import java.io.FileWriter;
import java.io.Writer;

public class Test {

  public static void main(String[] args) throws Exception {
    // 상위 타입의 레퍼런스는 하위 타입을 가리킬 수 있다.
    Object r1 = new FileWriter("");
    Writer r2 = new FileWriter("");
    FileWriter r3 = new FileWriter("");
    
    
    
    Box<String> b1 = new Box<String>();
    
    //Box<Object> b2 = new Box<String>(); // 오류
    // Box<Object>와 Box<String>은 동등한 위치의 타입이지
    // 상위,하위 개념이 아니다.
    
    //Box<FileWriter> b3 = new Box<Writer>();
    
  }
}
