package step26.exam02;

public class Test {

  public static void main(String[] args) {
    Box<String> box = new Box<>();
    
    box.setValue("문자열");
    //box.setValue(new Date()); // 컴파일 오류
    //box.setValue(10); // 컴파일 오류
    
    String s = box.getValue();
         
  }
}