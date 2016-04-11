// 주제 : Builder 패턴 적용 전

package designpattern.builder.exam01;

import java.util.HashMap;

public class Test01 {

  public static void main(String[] args) {
    HashMap<String,Car> carMap = new HashMap<>();
    
    Car c = new Car();
    c.model = "티코";
    c.cc = 800;
    carMap.put("tico", c);
    
    c = new Car();
    c.model = "소나타";
    c.cc = 800;
    carMap.put("sonata", c);
   
    CarFactory factory = new CarFactory();
    factory.setCarMap(carMap);
    
    Car c1 = factory.createCar("tico");
    System.out.println(c1);
 
    Car c2 = factory.createCar("sonata");
    System.out.println(c2);
  }

}