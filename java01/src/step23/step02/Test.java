// 주제 : 인터페이스 사용전
// => 일본어 인사말을 생성하는 클래스를 추가한다.
//    HelloJp 클래스
// => HelloJp 클래스를 사용하여 일본어 인사말을 출력한다.

package step23.step02;

public class Test {
  public static void main(String[] args) {

    String lang = System.getProperty("lang");

    String message = null;
    if ("en".equals(lang)) {
      HelloEn obj = new HelloEn();
      message = obj.greet();
    } else if ("jp".equals(lang)) {
      HelloJp obj = new HelloJp();
      message = obj.sayHello();
    } else {
      Hello obj = new Hello();
      message = obj.greet();
    }
    System.out.println(message);
  }
}
