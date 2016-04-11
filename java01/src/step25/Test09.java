// 주제 : Reflection API - 메서드의 파라미터 정보 알아내기

package step25;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class Test09 {
  
  static class Member {   
    String name;
    int age;
    float weight;
    float height;
    
    public void setMember(String name, int age, float weight, float height) {
      this.name = name;
      this.age = age;
      this.weight = weight;
      this.height = height;
    }

    @Override
    public String toString() {
      return "Member [name=" + name + ", age=" + age + ", weight=" + weight + 
             ", height=" + height + "]";
    }
    
  }
  
  public static void main(String[] args) throws Exception {
    Class<?> clazz = Class.forName("step25.Test09$Member");
    
    // 1) 인스턴스 생성
    Object obj = clazz.newInstance();
    
    // 2) setMember() 메서드 찾기
    Method m = clazz.getDeclaredMethod("setMember", String.class, int.class,
                                         float.class, float.class);
    
    // 3) 메서드의 파라미터 알아내기
    Parameter[] params = m.getParameters();
    for (Parameter param : params) {
      System.out.printf("%s:%s\n", param.getName(), param.getType().getName());
    }
  }
    
}