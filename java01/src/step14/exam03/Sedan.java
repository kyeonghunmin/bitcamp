// Generalization의 예 :
// => Sedan과 truck의 공통점을 식별하여 상위 클래스를 정의한다.
// => Car를 상속하는 코드를 추가한다.
package step14.exam03;

public class Sedan extends Car {
  // Car 클래스로 밑에 4개 변수를 옮김.
  // String title;         // 모델명
  // String company;       // 제조사명
  // int cc;               // cc
  // int maxcount;         // 최대 수용인원
  boolean isAutomatic;
  boolean isSunroof;
}
