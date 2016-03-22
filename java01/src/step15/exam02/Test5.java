// 주제 : 다형적 변수의 형변환2

package step15.exam02;

public class Test5 {
  public static void main(String[] args) {
    Object m1 = new Member();     // ok
    Object m2 = new Student();    // ok

    Member m3 = (Member)m1;       // ok
    Member m4 = (Member)m2;       // ok

    Member m5 = (Student)m1;       // 컴파일 ok, 실행 error
    Member m6 = (Student)m2;       // 컴파일 ok, 실행 ok
  }
}
