package step18.exam01;

public class Test5 {
  public static void main(String[] args) {
    Bucket5 p = new Bucket5();
    p.value = new String("okok");
    p.value = new Integer(20);
    p.value = new Float(3.14f);
    p.value = new java.util.Date();
  }
}

/*
# 요구사항
  - 이번 프로젝트는 Bucket에 Float 인스턴스만 저장하기로 했다.
  - 물론, 개발자의 실수를 방지하도록 문법적으로 막아야 한다.
  - 해결책?
    => Bucket5를 만들어 Float을 저장하도록 만든다.
    => 만약 나중에 내가 임의적으로 만든 클래스의 인스턴스를 저장하려 한다면,
       또 새로운 버킷을 생성해야 하는가?

- 대안책
  => 한 개의 클래스로 다양한 타입의 대응할 수 있는 문법이 필요.
  => "Generic"을 사용.

- 설명
  => 소프트웨어의 규모는 점점 커지고 있다.
  => 대단위의 사람들이 함께 같은 소스를 편집하는 경우가 많다.
  => 문법을 제대로 사용하는지 감시하기가 점점 더 힘들어 진다.
  => 가능한 개발자의 실수를 최대한 막을 수 있는 문법이 필요하다.
*/
