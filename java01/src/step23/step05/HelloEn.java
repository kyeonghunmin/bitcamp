package step23.step05;

// HelloEn 클래스는 Hello 규칙을 따른다.
// => Hello 규칙에 선언된 메서드를 만들 것이라는 의미.
public class HelloEn implements Hello {
  @Override
  public String greet() {
    return "Hello";
  }
}
