package step12;

public class Car {  // class는 여러 데이터를 묶어 하나의 데이터처럼 사용한다.
  // 자동차 마다 개별 정보를 저장할 변수
  static String model;
  static String maker;
  static int cc;
  static int capacity;
  // static, instance 결정은 해당 변수들을 클래스 로딩시에 한 번만 사용할 지,
  // 데이터를 여러 번 사용할 지 생각할 것.
  // 이 경우는 각각의 자동차의 정보를 필요로 하기 때문에 instance로 만든다.
  // (static이면 딱 하나의 자동차 정보만 저장할 수 있게 된다.)
}
