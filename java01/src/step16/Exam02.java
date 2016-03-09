// 주제 : toString() 오버라이딩

package step16;

public class Exam02 {
  @Override
  public String toString() {
    return "오호라.. 하하하";
  }

  public static void main(String[] args) {
    Exam02 p = new Exam02();
    Exam02 p2 = new Exam02();

    System.out.println(p.toString());
    System.out.println(Integer.toHexString(p.hashCode()));
    System.out.println(p.getClass());
    System.out.println(p.equals(p2));
  }
}
