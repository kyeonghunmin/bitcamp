// 주제 : Reflection API - 메서드 호출하기

package step25;

import java.lang.reflect.Method;

public class Test08 {
  
  static class Member {
    public static int count;
    
    String name;
    
    public Member() {
      System.out.println("Member()");
    }

    public String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
    }
    
    public void setName(String firstName, String middleName, String lastName) {
      this.name = firstName + " " + middleName + " " + lastName;
    }

    @Override
    public String toString() {
      return "Member [name=" + name + "]";
    }
  }
  
  public static void main(String[] args) throws Exception {
    Class<?> clazz = Class.forName("step25.Test08$Member");
    
    // 1) 인스턴스 생성
    Object obj = clazz.newInstance();
    
    // 2) setName() 메서드 찾기
    Method m1 = clazz.getDeclaredMethod("setName", String.class);
    
    // 메서드 호출
    // => 문법 : invoke(인스턴스, 값, 값, 값, ...)
    // => 스태틱 메서드인 경우, 인스턴스는 null을 준다.
    // => 인스턴스 메서드인 경우, 반드시 인스턴스 주소를 주어야 한다.
    m1.invoke(obj, "홍길동");
    System.out.println(obj);
    
    
    m1 = clazz.getDeclaredMethod("setName", 
        String.class, String.class, String.class);
    
    m1.invoke(obj, "길동", "오호라", "홍");
    System.out.println(obj);
  }
    
}
