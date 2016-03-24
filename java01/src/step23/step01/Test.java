// 주제 : 인터페이스 사용 전
// => 언어 별로 인사말을 생성해주는 클래스를 사용하여,
//    인사말을 출력하는 프로그램을 작성한다.
// => 한국어와 영어로 인사말을 생성하는 클래스를 작성한다.
//    한국어: Hello
//    영어 : HelloEn
package step23;

public class Test {
  public static void main(String[] args) {

    String lang = System.getProperty("lang");

    String message = null;
    if ("en".equals(lang)) {
      HelloEn obj = new HelloEn();
      message = obj.greet();
    } else {
      Hello obj = new Hello();
      message = obj.greet();
    }
    System.out.println(message);
  }
}
