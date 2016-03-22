// 주제 : Collection API - Queue

package step21;

import java.util.concurrent.ConcurrentLinkedQueue;

public class Exam08 {
  static void printList(ConcurrentLinkedQueue<String> list) {
    System.out.println("--------------------------------------");
    String value = null;
    while ((value = list.poll()) != null) {
        System.out.println(value);
    }
  }

  public static void main(String[] args) throws Exception {
    ConcurrentLinkedQueue<String> list = new ConcurrentLinkedQueue<>();
    list.add("111");
    list.add("aaa");
    list.add("444");
    list.add("BBB");
    list.add("222");
    list.add("333");
    list.add("aab");
    list.add("Aac");

    printList(list);
  }
}
