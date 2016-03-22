// 주제 : HashMap - 값 만 꺼내기

package step21;

import java.util.HashMap;
import java.util.Collection;

public class Exam17 {
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
      Member m1 = new Member("홍길동", 20);
      Member m2 = new Member("임꺽정", 30);
      Member m3 = new Member("유관순", 16);


      HashMap<String,Member> map = new HashMap<>();
      map.put("aaa", m1);
      map.put("bbb", m2);
      map.put("ccc", m3);

      // 맵에서 값 목록을 꺼낸다.
      Collection<Member> values = map.values();

      for (Member member : values) {
        System.out.printf("%s\n", member);
      }
    }
  }
