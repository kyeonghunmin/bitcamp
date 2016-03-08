package step14.exam08;

public class B extends A {
  float v4 = 3.14f;
  char v5;


  public B() {
    super();
    System.out.println("B의 생성자 ----------------");
    v1 = "김원봉";
    v3 = false;
    v5 = '가';
    // super(); // 오류  // super();는 무조건 첫번째 문장에 위치해야 한다.
  }
}
