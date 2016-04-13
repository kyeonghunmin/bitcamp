// 주제 : Collection API - ArrayList 5 - 로컬 중첩 클래스 적용

package step21;

import java.util.Date;
import java.util.ArrayList;
import java.util.Comparator;

public class Exam05 {
  static void printList(ArrayList<String> list) {
    System.out.println("--------------------------------------");
    for (String element : list) {
      System.out.println(element);
    }
  }

  public static void main(String[] args) {
    // main() 메서드에서만 사용할 클래스라면, 로컬 중첩 클래스로 만들어라
    class MyComparator implements Comparator<String> {
      @Override
      public int compare(String s1, String s2) {
        return s1.toLowerCase().compareTo(s2.toLowerCase());
        // s1이 크면 1, s1이 작으면 -1, 같으면 0을 리턴한다.
      }
    }

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
    // 문제점1)
    // 이 코드를 유지보수 하는 후임자는 도대체 MyComparator가 어떤 일을 하는
    // 클래스인지 궁금하다.
    // 그래서 이 후임자는 위로 스크롤하여 클래스를 코드를 확인할 것이다.
    // 확인한 다음에 다시 이 위치로 내려와서 이 코드의 의미를 이해하려고
    // 노력할 것이다.
    // 그나마 이 예제는 스크롤을 살짝만 해도 MyComparator 클래스의 코드를
    // 확인할 수 있어서 다행이다.
    // 만약 메서드의 코드가 길어서 여러 페이지를 스크롤해야만 찾을 수 있다면,
    // 아~~~~~ 얼마나 피곤할 것인가?
    // 좋은 해결책?
    // => 가능한 그와 관련된 코드는 근처에 있는 것이 코드를 이해하는데
    // 도움이 된다.
    // => 가능한 관련된 코드는 가까이에 두어라!

    // 문제점2)
    // MyComparator 객체를 오직 한 개만 만든다.
    //
    // 위의 두 개의 문제를 한꺼번에 해결하는 방법? 익명 중첩 클래스!

    // 정렬 후
    printList(list);
  }
}
