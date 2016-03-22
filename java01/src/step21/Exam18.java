// 주제 : HashMap - 키 만 꺼내기

package step21;

import java.util.HashMap;
import java.util.Set;

public class Exam18 {
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
      Set<String> keys = map.keySet();

      for (String key : keys) {
        System.out.printf("%s-%s\n", key, map.get(key));
        // get(key) : key에 해당하는 값을 리턴한다.
      }
    }
  }
