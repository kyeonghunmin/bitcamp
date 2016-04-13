// 주제 : 인터페이스 사용전
// => 일본어 인사말을 생성하는 클래스를 추가한다.
//    HelloJp 클래스
// => HelloJp 클래스를 사용하여 일본어 인사말을 출력한다.

// # 문제점
// => 규칙이 없기 때문에 클래스를 만드는 사람마다,
//   제각각으로 메서드를 만들 것이다.
// => 그러면 그 클래스를 사용하는 개발자는 항상 클래스의 메서드 형식을
//    살펴서 호출해야 한다. --> 너무 번거롭다.
// => 해결책?
//    --> 호출 규칙을 정의하라!
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
      // <--- 규칙이 없으니 메서드를 마음대로 만든다.
      // 문제는 메서드 이름이 다르니 이 메서드를 호출하는 개발자가 번거롭다.
    } else {
      Hello obj = new Hello();
      message = obj.greet();
    }
    System.out.println(message);
  }
}
