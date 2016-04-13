// 주제 : Collection API - ArrayList 6 - 익명 중첩 클래스 적용

package step21;

import java.util.Date;
import java.util.ArrayList;
import java.util.Comparator;

public class Exam06 {
  static void printList(ArrayList<String> list) {
    System.out.println("--------------------------------------");
    for (String element : list) {
      System.out.println(element);
    }
  }

  public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<>();
    list.add("111");
    list.add("aaa");
    list.add("444");
    list.add("BBB");
    list.add("222");
    list.add("333");
    list.add("aab");
    list.add("Aac");

    // 정렬 전
    printList(list);

    // 정렬
    // 익명 로컬 중첩 클래스
    // => 정렬을 처리하는 코드가 가까이에 있어 좋다.
    // => 인스턴스를 한개만 만들기 때문에 편리하다.
    list.sort(new Comparator<String>() {
      @Override
      public int compare(String s1, String s2) {
        return s1.toLowerCase().compareTo(s2.toLowerCase());
      }
    });

    // 정렬 후
    printList(list);
  }
}
