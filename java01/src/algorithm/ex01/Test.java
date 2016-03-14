package algorithm.ex01;

public class Test {
  public static void main(String[] args) {
    LinkedList list = new LinkedList();
    list.add("홍길동");  // 0
    list.add("임꺽정");  // 1
    list.add("유관순");  // 2
    list.add("안창호");  // 3
    list.add("김원봉");  // 4
    list.add("김구");    // 5

    //list.add(4, "민경훈");
    //list.remove(0);
    list.set(1, "민경훈");

    for (int i = 0; i < list.size(); i++) {
      System.out.println(list.get(i));
    }

  }
}
