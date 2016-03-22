// 주제 : Collection API - 해시코드와 HashSet

package step21;

import java.util.HashSet;

public class Exam11 {
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

  static void printList(HashSet<Member> list) {
    System.out.println("--------------------------------------");
    for (Object value : list.toArray()) {
      System.out.println(value);
    }
  }


    public static void main(String[] args) throws Exception {
      Member m1 = new Member("홍길동", 20);
      Member m2 = new Member("임꺽정", 30);
      Member m3 = new Member("유관순", 16);
      Member m4 = new Member("홍길동", 20);
      Member m5 = new Member("임꺽정", 30);

      System.out.printf("m1 = %d\n", m1.hashCode());
      System.out.printf("m2 = %d\n", m2.hashCode());
      System.out.printf("m3 = %d\n", m3.hashCode());
      System.out.printf("m4 = %d\n", m4.hashCode());
      System.out.printf("m5 = %d\n", m5.hashCode());
      System.out.printf("-------------------------");

      HashSet<Member> set = new HashSet<>();
      set.add(m1);
      set.add(m2);
      set.add(m3);
      set.add(m4);
      set.add(m5);

      printList(set);
    }

  }
