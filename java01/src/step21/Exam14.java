// 주제 : Collection API - HashMap 2 - 사용자 정의 클래스를 key로 사용하기
//                                   - MyKey의 hashCode()와 equals() 재정의

package step21;

import java.util.HashMap;

public class Exam14 {
  // HashMap에서 key로 사용할 클래스
  static class MyKey {
    String value;

    public MyKey(String value) {
      this.value = value;
    }

    @Override
    public int hashCode() {
      return value.hashCode();
    }

    @Override
    public boolean equals(Object other) {
      if (other == null || other.getClass() != other.getClass()) {
        return false;
      }
      MyKey k = (MyKey) other;
      if (!this.value.equals(k.value)) {
        return false;
      }
      return true;
    }
  }

  static class Member {   // Object를 자동으로 상속 받는다.
    String name;
    int age;

    public Member(String name, int age) {
      this.name = name;
      this.age = age;
    }

    @Override
    public String toString() {
      return name + ", " + age;
    }

    @Override
    public int hashCode() {
      return this.toString().hashCode();
      // 이미 Override한 toString을 이용하여 문자열로 만들어
      // 그 해시 값을 리턴한다.
    }

    @Override
    public boolean equals(Object other) {
      if (other == null || other.getClass() != this.getClass()) { // getClass : 클래스 정보를 리턴하는 메서드
        return false;
      }
      Member m = (Member)other;

      if (!this.name.equals(m.name)) {
        return false;
      }

      if (this.age != m.age) {
        return false;
      }
      return true;
    }
  }

    public static void main(String[] args) throws Exception {
      MyKey k1 = new MyKey("aaa");
      MyKey k2 = new MyKey("bbb");
      MyKey k3 = new MyKey("ccc");
      MyKey k4 = new MyKey("ddd");
      MyKey k5 = new MyKey("eee");

      Member m1 = new Member("홍길동", 20);
      Member m2 = new Member("임꺽정", 30);
      Member m3 = new Member("유관순", 16);


      HashMap<MyKey,Member> map = new HashMap<>();
      map.put(k1, m1);
      map.put(k2, m2);
      map.put(k3, m3);
      map.put(k4, m1); // key가 다르면 같은 인스턴스를 중복 저장할 수 있다.
      map.put(k5, m2);

      MyKey kk1 = new MyKey("aaa");
      MyKey kk2 = new MyKey("bbb");
      MyKey kk3 = new MyKey("ccc");
      MyKey kk4 = new MyKey("ddd");
      MyKey kk5 = new MyKey("eee");

      System.out.println(map.get(kk1));
      System.out.println(map.get(kk2));
      System.out.println(map.get(kk3));
      System.out.println(map.get(kk4));
      System.out.println(map.get(kk5));

    }

  }
