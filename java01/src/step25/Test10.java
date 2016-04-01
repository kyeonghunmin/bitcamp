// 주제 : Reflection API - 메서드를 호출할 때 여러 개의 값 넘기기

package step25;

import java.lang.reflect.Method;

public class Test10 {
  
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
    Class<?> clazz = Class.forName("step25.Test10$Member");
    
    // 1) 인스턴스 생성
    Object obj = clazz.newInstance();
    
    // 2) setMember() 메서드 찾기
    Method m = clazz.getDeclaredMethod("setMember", String.class, int.class,
                                         float.class, float.class);
    
    // 3) 메서드의 파라미터 알아내기
    Object[] arguments = {"홍길동", 20, 85.5f, 182.4f};
    m.invoke(obj, arguments);
    System.out.println(obj);
    
    m.invoke(obj, "임꺽정", 30, 98.2f, 192f);
    System.out.println(obj);
  }
    
}
