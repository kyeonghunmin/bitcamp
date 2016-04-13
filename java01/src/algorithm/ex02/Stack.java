package algorithm.ex02;

public class Stack {
  Bucket top;
  int count;

  public Stack() {
  }

  public void push(Object value) {
    Bucket newTop = new Bucket(value, top);
    top = newTop;
    count++;
  }

  public Object pop() {
    if(count == 0) {
      return null;
    }
    Bucket oldTop = top;
    top = top.next;
    count--;
    return oldTop.value;
  }

  public int size() {
    return count;
  }
}
