// 주제 : Collection API - 해시코드와 HashSet
//=> hashCode(), equals() 재정의하기 전

package step21;

import java.util.HashSet;

public class Exam10 {
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
    set.add(m4); // 저장된다.
    set.add(m5); // 저장된다.

    printList(set);
  }

}
/*
# HashSet이 데이터를 저장하는 방법
- 값을 저장하기 전에 기존에 저장된 객체 중에 같은 값을 가진 객체 있는지
  검사한다.
  => 검사 방법?
     1) hashCode()의 값을 비교
     2) 해시값이 같으면 한 번 더 equals()로 값을 비교한다.
     => equals() 마저 같다고 나오면 중복 데이터로 간주하여 저장하지 않는다.
*/