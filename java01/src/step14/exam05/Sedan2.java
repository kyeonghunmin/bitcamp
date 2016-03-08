package step14.exam05;

public class Sedan2 extends Car {
  boolean isAutomatic;
  boolean isSunroof;

  // 수퍼 클래스로부터 상속받은 메서드를 서브 클래스의 역할에 맞게 재정의 한다.
  // => 오버라이딩(overriding)
  // => 수퍼 클래스의 메서드와 똑같은 시그너처를 가져야 한다.
  // => Signature? 메서드이름, 리턴타입, 파라미터선언
  //    (C언어 : function prototype)
  @Override
  public void printInfo() {
    // 재정의하기 전에 메서드를 호출하는 방법 => super 키워드 사용
    super.printInfo();
    System.out.printf("자동기어 : %b\n", isAutomatic);
    System.out.printf("썬루프 : %b\n", isSunroof);
  }
}

/*
@Override
- 컴파일러에게 수퍼 클래스의 메서드를 재정의한는 메서드라는 것을 알리는 명령이다.
  즉, 현재 메서드의 시그너처와 일치하는 수퍼 클래스의 메서드가 있는지 검사한다.
  만약 없다면 오버라이딩이 아니기 때문에 컴파일 오류가 발생한다.
  => 개발자의 오타로인한 버그를 줄일 수 있다.
- 이렇게 컴파일러나 JVM에게 지시나 조언 등을 제공하기 위해 작성하는
  주석을 "애노테이션(Annotation)" 이라고 부른다.
- 형식 : @애노테이션명(속성,속성,속성,...)
*/


// 오버로딩
// - 파라미터가 다르더라도 같은 기능을 하는 메서드에 대해서 같은 이름을
//   부여함으로써 프로그래밍의 일관성을 확보하고자 하는 문법.
//
// 오버라이딩
// - 상속받은 메서드를 서브 클래스의 역할에 맞게끔 재정의하는 문법.
