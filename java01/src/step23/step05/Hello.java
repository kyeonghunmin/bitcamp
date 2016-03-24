package step23;

public interface Hello {
  // 호출 규칙을 정의한다.
  String greet(); // public abstract를 붙이지 않아도 public, abstract이다.
                  // => private, protected, (default) 안됨!
                  // => 일반 메서드를 선언할 수 없다. (추상 메서드만 가능)
}
