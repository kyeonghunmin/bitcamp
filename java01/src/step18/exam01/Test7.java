// Object와 Generic의 차이

package step18.exam01;

public class Test7 {
  public static void main(String[] args) {
    Bucket p1 = new Bucket();
    Bucket6<String> p2 = new Bucket6<String>();

    p1.value = new String("okok");
    p2.value = new String("okok");

    String s1 = (String)p1.value;
    String s2 = p2.value;
  }
}
