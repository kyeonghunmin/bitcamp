// 주제 : 중첩 클래스(Mested Class or Inner Class) 도입 후

package step20.exam02;

public class Test {
  public static void main(String[] args) {
    LinkedList list = new LinkedList();
    list.add("홍길동");
    list.add("임꺽정");
    list.add("유관순");

    for (int i = 0; i < list.size(); i++) {
      System.out.println(list.get(i));
    }

  }
}
/*
# 중첩 클래스?
- 특정 클래스 안에서만 사용되는 클래스라면,
  굳이 패키지 멤버 클래스로 만들지 말고 그 클래스 내부에 선언하라.
- 패키지 멤버 클래스(일반 클래스)는 다른 클래스가 사용할 수 있도록
  노출한 클래스이다.
- 다른 클래스가 사용할 일이 없는데도 불구하고 패키지 멤버로 선언하면,
  정말 그 이름의 패키지 멤버 클래스를 만들고 싶을 때 못 만들게 된다.
- 소스코드 관리 차원에서도 특정 클래스 안에서만 사용된다면,
  그 클래스 안에 선언하는 것이 유지보수에 더 낫다.
- 종류
1) top level inner Class
  => static member 클래스
2) member inner Class
  => instance member 클래스
3) local inner Class
  => 메서드 안에 선언된 클래스
4) anonymous inner Class
  => 이름이 없는 클래스.
  => 클래스 선언과 인스턴스 생성 문법이 결합되어 있다.
*/