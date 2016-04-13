// 주제 : HashMap - entry set으로 데이터 꺼내기

package step21;

import java.util.HashMap;
import java.util.Set;

public class Exam15 {
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


      Set entrySet = map.entrySet(); // 리턴 값 : [키-값]의 목록

      Map.Entry<String.Member> entry = null;
      for (Object item : entrySet) {
        // 제네릭을 사용하지 않는다면 다음과 같이 매번 형변환을 해서 
        // 사용해야 한다.
        entry = (Map.Entry<String,Member>) item;
        System.out.printf("%s-%s\n", entry.getKey(), entry.getValue());
      }
    }
  }
