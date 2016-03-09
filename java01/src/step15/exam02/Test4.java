// 주제 : 다형적 변수에서 메서드 호출

package step15.exam02;

public class Test4 {
  public static void main(String[] args) {
    Member s1 = new Student();
    s1.id = "hong";
    s1.password = "1111";

    // 하위 클래스의 인스턴스를 가리키는 레퍼런스를 가지고 메서드를 호출한다면,
    // => 하위 클래스가 해당 메서드를 오버라이딩 했는가?
    //    yes : 그 오버라이딩 메서드를 호출한다.
    //    no  : 레퍼런스 클래스의 메서드를 호출한다.
    s1.printInfo();   // 실제 인스턴스 클래스의 메서드(Student.printInfo())
  }
}
