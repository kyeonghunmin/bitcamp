// 주제 : HelloJp처럼 이미 다른 클래스를 상속 받는 경우 해결책
// => 기존의 상속 받는 클래스 대신 AbstractHello를 상속받게 한다.
//    그리고 기존에 상속 받았던 기능은 다른 방식으로 처리한다.
// => HelloJp 클래스 개편!

// 문제점
// => 그나마 HelloJp처럼 클래스의 크기가 작을 때는 소스 코드 개편이 가능하지만
//    실무에서는 간단하지가 않다.
//    기존의 클래스를 상속 받은 후 많은 코드가 추가된 경우에는
//    HelloJp처럼 기존 상속을 포기할 수 없다.

package step23.step04;

public class Test {
  public static void main(String[] args) {

    String lang = System.getProperty("lang");

    String message = null;
    AbstractHello obj = null; // 레퍼런스 변수를 이용하여
                              // 인사를 리턴할 객체의 타입을 한정시킨다.
    if ("en".equals(lang)) {
      obj = new HelloEn();  // abstract의 서브 클래스이기 때문에 컴파일 가능
    } else if ("jp".equals(lang)) {
      obj = new HelloJp(); // AbstractHello의 서브 클래스가 아니면 컴파일 오류
      // AbstractHello의 규칙을 따르지 않는 클래스를 사용하려 한다면
      // 컴파일 오류가 발생한다.
      // => 이런 방식(수퍼 클래스를 통한)으로 호출 규칙을 제어할 수 있다.
      // * HelloJp()는 AbstractHello를 상속받지 않았기 때문에 컴파일 오류 발생
    } else {
      obj = new Hello();  // abstract의 서브 클래스이기 때문에 컴파일 가능
    }

    message = obj.greet();  // 어떤 객체인지 모르겠지만
                            // 그 객체는 AbstractHello의 서브 클래스이기 때문에
                            // 반드시 greet()라는 메서드가 있을 것이다.
                            // => 상속을 이용한 호출 규칙을 제한하는 문법.
    System.out.println(message);
  }
}
