package step14.exam06;

public class A {
  String v1 = "홍길동";  // 변수 선언 + 초기화 문장
  int v2 = 10;           // 변수 선언 + 초기화 문장
  boolean v3;            // 변수 선언

  {                      // 인스턴스 블록
    System.out.println("A의 인스턴스 블록----------");
    v1 = "임꺽정";
    v3 = true;
  }

  public A() {           // 생성자
    // 수퍼 클래스의 어떤 생성자를 실행할 지 지정하지 않으면,
    // 다음과 같이 수퍼 클래스의 기본 생성자를 호출하는 코드가
    // 자동으로 삽입된다.
    // super();
    System.out.println("A의 생성자 ----------------");
    v1 = "유관순";
    v2 = 20;
  }
}
