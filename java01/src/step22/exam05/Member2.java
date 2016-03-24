// Member2를 직렬화(Serialize) 할 수 있도록 지정한다.

package step22.exam05;

import java.io.Serializable;

public class Member2 implements Serializable {  // Serialize를 가능하게 해준다.
                                        // 인스턴스 정보를 내보낼 수 있게 된다.
  String name;
  int age;
  int height;
  int weight;
  transient float bmi;
  // transient
  // => 사전적 의미 : 일시적인, 순간적인
  // => 인스턴스 변수 중에서 일시적인 데이터를 저장하는 용도나
  //    다른 인스턴스 변수의 값을 사용하여 계산한 결과를 저장하는 용도인 경우
  //    출력 대상에서 제외하는 것이 정확도 측면에서 좋다.
  //    즉, 읽어 들이는 쪽에서 계산을 다시 수행하도록 한다.
  //    그래서 중간에 데이터가 조작되는 것을 막을 수 있다.
  // => Serialize 대상에서 제외할 변수에 대해 이 옵션을 붙인다.

  public Member2() {
  }

  public Member2(String name, int age, int height, int weight) { // 생성자
    this.name = name;
    this.age = age;
    this.height = height;
    this.weight = weight;
    calculateBMI();   // 생성자가 호출되면 calculateBMI를 자동으로 호출한다.
  }

  @Override
  public String toString() {
    return name + ", " + age + ", " + height + ", " + weight + ", " + bmi;
  }

  public void calculateBMI() {
    float h = height / 100f;
    bmi = weight / (h * h);
  }
}
