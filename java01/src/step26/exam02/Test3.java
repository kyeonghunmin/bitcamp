package step26.exam02;

import java.util.Date;

public class Test3 {

  public static void main(String[] args) {
    // 다양한 타입으로 사용하기 
    Box<String> box1 = new Box<>();
    Box<Integer> box2 = new Box<>();
    Box<Date> box3 = new Box<>();
    Box<Object> box4 = new Box<>();
    
    box1.setValue("문자열");
    box2.setValue(20);
    box3.setValue(new Date());
    
    // 지정된 타입 외의 값을 저장하면 컴파일 오류가 발생한다.
    //box1.setValue(20); // 컴파일 오류!
    //box2.setValue("20"); // 컴파일 오류!
    //box3.setValue(true); // 컴파일 오류!
    
    //=> 항상 다형적 변수의 활용법에 따라 하위 객체를 저장할 수 있다.
    box4.setValue("문자열");// OK
    box4.setValue(20); // OK --> auto-boxing
    box4.setValue(new Date()); // OK
    box4.setValue(true); // OK --> auto-boxing
    
  }

}







