// 주제 : 다형적 변수의 제약

package step15.exam02;

public class Test {
  public static void main(String[] args) {
    // 만약 하위 레퍼런스로 상위 클래스의 인스턴스를 가리킬 수 있다면?
    Student s1 = new Member();    // 컴파일 오류
    s1.id = "hong";
    s1.password = "1111";
    s1.isWorking = true;    // 오류, Member 인스턴스에는 isWorking 변수가 없다.
    // 문제점 분석
    // => s1 변수는 Student 변수이기 때문에
    //    문법적으로 Student의 인스턴스 변수에 접근할 수 있어야 한다.
    //    만약, s1.isWorking = true; 문법을 허용한다면
    //          컴파일할 때는 오류가 발생하지 않겠지만,
    //          실행할 때 반드시 오류가 발생할 것이다.
    //    왜?   s1이 가리키는 인스턴스는 실제 Member의 인스턴스이고
    //          Member 인스턴스에는 isWorking 변수가 없기 때문이다.
    // 결론
    // 하위 클래스의 레퍼런스는 상위 클래스의 인스턴스를 가리키지 못하도록
    // 문법적으로 막아두었다. (Student s1 = new Member();는 컴파일 오류)
  }
}
