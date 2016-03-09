// 주제 : equals() 오버라이딩

package step16;

public class Exam03 {
  int age;
  int weight;

  public Exam03(int age, int weight) {
    this.age = age;
    this.weight = weight;
  }

  @Override
  public String toString() {
    return "오호라.. 하하하";
  }

  public static void main(String[] args) {
    String s = new String("Hello");
    String s2 = new String("Hello");
    System.out.println(s == s2);
    System.out.println(s.equals(s2));   // true

    Exam03 p = new Exam03(18, 90);
    Exam03 p2 = new Exam03(18, 90);
    System.out.println(p == p2);
    System.out.println(p.equals(p2));
  }
}

/*
String.equals()
- 원래 Object로부터 상속받은 equals()는 인스턴스가 같은 지를 비교한다.
- 그런데 String 클래스에서 이 메서드를 재정의하였다.
  인스턴스가 같은지 비교하는 대신 인스턴스의 내용이 같은지 비교한다.

Exam03.equals()
- Object 로부터 상속받은 메서드이기 때문에 인스턴스가 같은 지를 비교한다.
- String 클래스처럼 내용이 같은지 비교하려면,
  => 오버라이딩 해야한다. (Exam04 참고)
*/
