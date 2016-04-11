// 역할 : Car 객체를 생성해주는 역할을 수행한다.

package designpattern.factorymethod.exam02;

public class CarFactory {
  
  public Car createCar(String name) {
    Car c = new Car();
    
    switch (name) {
      case "tico":
        c.model = "티코";
        c.cc = 800;
        return c;
      case "sonata":
        c.model = "소나타";
        c.cc = 1997;
        return c;
      default:
        return null;
    }
    
  }
}
