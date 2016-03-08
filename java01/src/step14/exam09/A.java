package step14.exam09;

public class A {
  String v1 = "홍길동";
  int v2 = 10;
  boolean v3;

  // A 클래스에는 기본 생성자가 없다.
  public A(String name) {
    // super();
    System.out.println("A(String)의 생성자 ----------------");
    v1 = name;
  }
}
