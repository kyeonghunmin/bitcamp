package algorithm.ex02;

public class Test {
  public static void main(String[] args) {
    Stack stack = new Stack();
    stack.push("홍길동");  // 0
    stack.push("임꺽정");  // 1
    stack.push("유관순");  // 2
    stack.push("안창호");  // 3
    stack.push("김원봉");  // 4
    stack.push("김구");    // 5


    for (int i = 0; i < stack.size(); i++) {
      System.out.println(stack.pop());
    }

  }
}
