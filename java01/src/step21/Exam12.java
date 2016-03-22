// 주제 : Collection API - HashMap

package step21;

import java.util.HashMap;

public class Exam12 {
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
      String k1 = new String("aaa");
      String k2 = new String("bbb");
      String k3 = new String("ccc");
      String k4 = new String("ddd");
      String k5 = new String("eee");

      Member m1 = new Member("홍길동", 20);
      Member m2 = new Member("임꺽정", 30);
      Member m3 = new Member("유관순", 16);


      HashMap<String,Member> map = new HashMap<>();
      map.put(k1, m1);
      map.put(k2, m2);
      map.put(k3, m3);
      map.put(k4, m1); // key가 다르면 같은 인스턴스를 중복 저장할 수 있다.
      map.put(k5, m2);

      String kk1 = new String("aaa");
      String kk2 = new String("bbb");
      String kk3 = new String("ccc");
      String kk4 = new String("ddd");
      String kk5 = new String("eee");

      System.out.println(map.get(kk1)); // 다른 인스턴스의 key로도 내용만 같으면 가능하다.
      System.out.println(map.get(kk2));
      System.out.println(map.get(kk3));
      System.out.println(map.get(kk4));
      System.out.println(map.get(kk5));

    }

  }
