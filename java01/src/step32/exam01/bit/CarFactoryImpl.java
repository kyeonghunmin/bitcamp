package step32.exam01.bit;

import step32.exam01.Car;
import step32.exam01.CarFactory;

public class CarFactoryImpl extends CarFactory {
  public Car newCar(String name) {
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
