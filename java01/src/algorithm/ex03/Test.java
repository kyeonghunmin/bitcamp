package algorithm.ex03;

public class Test {
  public static void main(String[] args) {
    Queue queue = new Queue();
    queue.put("홍길동");
    queue.put("임꺽정");
    queue.put("유관순");

    System.out.println(queue.poll());
    System.out.println(queue.poll());
    System.out.println("---------------");

    queue.put("안창호");
    queue.put("김원봉");
    queue.put("김구");

    System.out.println(queue.poll());
    System.out.println(queue.poll());
    System.out.println("---------------");

    System.out.println(queue.poll());
    System.out.println(queue.poll());

    System.out.println("---------------");

    System.out.println(queue.poll());
    System.out.println(queue.poll());
  }
}
