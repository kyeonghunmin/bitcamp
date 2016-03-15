package algorithm.ex02;

public class Stack {
  Bucket top;
  Bucket bottom;
  int count;

  public Stack() {
    top = new Bucket();
    bottom = top;
  }

  public void push(Object value) {
    Bucket temp = new Bucket(value, top);
    top = temp;
    count++;
  }

  public Object pop() {
    if (count == 0) {
      return null;
    }
    Bucket cursor = top;
    top = top.next;
    count--;
    return cursor.value;
  }

  public int size() {
    return count;
  }
}
