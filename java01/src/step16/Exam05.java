// 주제 : hashCode() 오버라이딩

package step16;

public class Exam05 {
  int age;
  int weight;

  public Exam05(int age, int weight) {
    this.age = age;
    this.weight = weight;
  }

  @Override
  public String toString() {
    return "오호라.. 하하하";
  }

  @Override
  public boolean equals(Object other) {
    if (other == null || !(other instanceof Exam05))
      return false;

    Exam05 obj = (Exam05)other;

    if (this.age != obj.age)
      return false;

    if (this.weight != obj.weight)
      return false;

    return true;
  }

  @Override
  public int hashCode() {
    StringBuffer buf = new StringBuffer();
    buf.append(Integer.toString(age));
    buf.append(",");
    buf.append(Integer.toString(weight));

    return buf.toString().hashCode();
    // String str = buf.toString();
    // int value = str.hashCode();
    // return value;
  }

  public static void main(String[] args) {
    String s = new String("Hello");
    String s2 = new String("Hello");
    System.out.println(s == s2);
    System.out.println(s.equals(s2));
    System.out.printf("%d --- %d\n", s.hashCode(), s2.hashCode());

    Exam05 p = new Exam05(18, 90);
    Exam05 p2 = new Exam05(18, 90);
    System.out.println(p == p2);
    System.out.println(p.equals(p2));
    System.out.printf("%d --- %d\n", p.hashCode(), p2.hashCode());
  }
}

/*
hashCode() 재정의 하는 이유
 - 같은 값을 갖는 인스턴스에 대해 같은 해시코드를 리턴하게 함으로써
   인스턴스 비교를 더 쉽게 만든다.
*/
