package algorithm.ex04;

public class Test {
  public static void main(String[] args) {
    //LinkedList list = new LinkedList(); // 예전 방식
    LinkedList<String> list = new LinkedList<String>();

    list.add("홍길동"); // index = 0
    list.add("임꺽정"); // index = 1
    list.add("유관순"); // index = 2
    list.add("안창호"); // index = 3
    list.add("김원봉"); // index = 4
    list.add("김구"); // index = 5
    //list.add(new Integer(20)); // is Error?

    for (int i = 0; i < list.size(); i++) {
      System.out.println(list.get(i));
    }
  }
}
