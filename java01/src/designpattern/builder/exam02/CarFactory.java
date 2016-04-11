// 역할 : Car 객체를 생성해주는 역할을 수행한다.

package designpattern.builder.exam02;

import java.util.HashMap;

public class CarFactory {
  HashMap<String,Car> carMap = new HashMap<>();
  
  public void setCarMap(HashMap<String, Car> carMap) {
    this.carMap = carMap;
  }

  public Car createCar(String name) {
    return carMap.get(name);
  }
}
