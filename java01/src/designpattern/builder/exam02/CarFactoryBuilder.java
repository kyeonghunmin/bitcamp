package designpattern.builder.exam02;

import java.util.HashMap;

public class CarFactoryBuilder {
  public CarFactory build(String blueprint) {
    HashMap<String,Car> carMap = new HashMap<>();
    
    // blueprint 형식: "key,model,cc;key,model,cc"
    String[] carinfos = blueprint.split(";");
    for (String carinfo : carinfos) {
      carMap.put(getKey(carinfo), generate(carinfo));
    }
    
    CarFactory factory = new CarFactory();
    factory.setCarMap(carMap);
    return factory;
  }
  
  private String getKey(String carinfo) {
    // carInfo : "key,model,cc"
    return carinfo.split(",")[0];
  }
  
  private Car generate(String carinfo) {
    // carInfo : "key,model,cc"
    String[] values = carinfo.split(",");
    
    Car c = new Car();
    c.model = values[1];
    c.cc = Integer.parseInt(values[2]);
    
    return c;
  }
}

// Factory : 복잡한 단순 객체를 생성해주는 역할
// Builder : 복잡한 복합 객체를 생성해주는 역할