// Object와 Generic의 차이

package step18.exam01;

public class Test7 {
  public static void main(String[] args) {
    Bucket p1 = new Bucket();
    Bucket6<String> p2 = new Bucket6<String>();

    p1.value = new String("okok");
    p2.value = new String("okok");

    String s1 = (String)p1.value;
    // Bucket의 value는 Object 타입이기 때문에
    // 원래 타입 변수에 저장하려면
    // 타입 캐스팅을 해야 한다.
    
    String s2 = p2.value;
    // Bucket6는 타입 캐스팅을 안해도 된다.
    // p2 변수를 선언할 때 타입 정보를 넘겼기 때문이다.
  }
}
