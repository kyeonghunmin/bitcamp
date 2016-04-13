package step26.exam02;

import java.util.Date;

public class Test2 {

  public static void main(String[] args) {
    // 제네릭이 적용된 클래스를 사용할 때 
    // 타입을 적용하지 않고 날 것 그대로 사용한다면
    // 경고가 뜬다.
    // => "raw type"
    Box box = new Box();
    
    box.setValue("문자열"); // OK

    //=> raw type으로 사용할 경우 직접 형변환을 해야 한다.
    String s = (String)box.getValue();
  }

}







