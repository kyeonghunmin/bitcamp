// 주제 : 상속 - Generalization (일반화)

package step14.exam03;

public class Test {
  public static void main(String[] args) {
    Sedan c1 = new Sedan();
    Truck c2 = new Truck();
  }
}

/*
Generalization 절차
1) 클래스들의 공통 기능을 뽑아서 수퍼 클래스를 정의한다.
   => Car 클래스 정의
2) 기존 클래스를 Car 클래스의 하위 클래스로 만든다.
   => 기존 클래스에 상속 문법 추가
   => Sedan extends Car
   => Truck extends Car
*/
