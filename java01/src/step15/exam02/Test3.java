// 주제 : 다형적 변수의 형변환

package step15.exam02;

public class Test3 {
  public static void main(String[] args) {
    Member s1 = new Member();
    s1.id = "hong";
    s1.password = "1111";

    // s1은 member 인스턴스를 가리킨다.
    // => 그런데 다음과 같이 student라고 속이고 형변환하면
    //    컴파일러는 속지만 실행할 때 오류가 발생한다.
    ((Student)s1).isWorking = true;
    // 문법은 성립하기 때문에 컴파일은 통과되지만,
    // 실행할 경우 s1에는 isWorking이 없기 때문에 실행 오류가 발생한다.
  }
}
