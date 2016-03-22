// 주제 : Collection API - List vs Set

package step21;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.AbstractCollection;

public class Exam09 {
  static void printList(AbstractCollection<String> list) {
    System.out.println("--------------------------------------");
    for (Object value : list.toArray()) {
      System.out.println(value);
    }
  }



  public static void main(String[] args) throws Exception {
    ArrayList<String> list = new ArrayList<>();
    list.add("홍길동");
    list.add("임꺽정");
    list.add("유관순");
    list.add("홍길동");
    list.add("임꺽정");

    HashSet<String> set = new HashSet<>();
    set.add("홍길동");
    set.add("임꺽정");
    set.add("유관순");
    set.add("홍길동");
    set.add("임꺽정");

    printList(list);
    printList(set);
  }
}
