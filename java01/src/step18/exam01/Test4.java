package step18.exam01;

public class Test4 {
  public static void main(String[] args) {
    Bucket4 p = new Bucket4();
    p.value = new String("okok");
    p.value = new Integer(20);
    p.value = new Float(3.14f);
    p.value = new java.util.Date();
  }
}

/*
# 요구사항
  - 이번 프로젝트는 Bucket에 Integer 인스턴스만 저장하기로 했다.
  - 물론, 개발자의 실수를 방지하도록 문법적으로 막아야 한다.
  - 해결책?
    => Bucket4를 만들어 Integer를 저장하도록 만든다.
*/
