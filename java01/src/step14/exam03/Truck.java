// Generalization의 예 :
// => Sedan과 Truck의 공통점을 찾아서 일반적인 기능을 갖는 수퍼 클래스를 정의한다.
// => Car를 상속하는 코드를 추가한다.
package step14.exam03;

public class Truck extends Car {
  // Car 클래스로 밑에 4개 변수를 옮김.
  // String model;     // 모델명
  // String maker;     // 제조사명
  // int cc;           // cc
  // int maxSize;      // 최대 수용인원
  float weight;
  boolean isDump;
}
