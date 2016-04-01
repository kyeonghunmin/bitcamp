package step26.exam04;

import java.io.Writer;

public class Test2 {

  public static void main(String[] args) throws Exception {
    Box<?> r1 = new Box<String>();
    r1 = new Box<Integer>();
    r1 = new Box<Writer>();
    
    Box<?> r2 = new Box<String>();
    String s = (String)r2.getValue(); // <?>를 사용하면 형변환이 필요하다
   
         
  }
}
