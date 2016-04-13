package step26.exam04;

import java.io.Writer;

public class Test2 {

  public static void main(String[] args) throws Exception {
    // Object 레퍼런스가 하위 타입의 객체를 가리키는 것 처럼
    // 제네릭 변수도 다양한 객체를 가리킬 수 없는가?
    
    // => wilecard 타입을 지정하면 된다.
    Box<?> r1 = new Box<String>();
    r1 = new Box<Integer>();
    r1 = new Box<Writer>();
    
    Box<?> r2 = new Box<String>();
    // => wilecard 레퍼런스는 제네릭의 편이성을 활용하지 못하게 한다.
    String s = (String)r2.getValue(); // <?>를 사용하면 형변환이 필요하다
   
         
  }
}
