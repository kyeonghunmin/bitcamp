// 주제 : Collection API - ArrayList 3

package step21;

import java.util.Date;
import java.util.ArrayList;
import java.util.Comparator;

public class Exam03 {
  static class MyComparator implements Comparator<String> {
    @Override
    public int compare(String s1, String s2) {
      char[] arr1 = s1.toLowerCase().toCharArray(); // 대소문자 구분 안함
      char[] arr2 = s2.toLowerCase().toCharArray(); // 대소문자 구분 안함
      int count = (arr1.length - arr2.length) < 0 ? arr1.length : arr2.length;

      for (int i = 0; i < count; i++) {
        if (arr1[i] < arr2[i]) {
          return -1;
        } else if (arr1[i] > arr2[i]) {
          return 1;
        }
      }

      if (arr1.length == arr2.length) {
        return 0;
      } else if (arr1.length < arr2.length) {
        return -1;
      } else {
        return 1;
      }
    }
  }

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
    MyComparator comp = new MyComparator();
    list.sort(comp);
    printList(list);

    // 정렬 후
  }
}
