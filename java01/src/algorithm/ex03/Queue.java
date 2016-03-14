package algorithm.ex03;

public class Queue {
  Bucket front;
  Bucket rear;
  int count;

  public Queue() {
    front = new Bucket();
    rear = front;
  }

  public int size() {
    return count;
  }

  public void put(Object value) {
    rear.value = value;
    Bucket emptyBucket = new Bucket();
    rear.next = emptyBucket;
    rear = emptyBucket;
    count++;
  }

  public Object poll() {
    if (count == 0) {
      return null;
    }

    Object cursor = front.value;
    front = front.next;
    count--;
    return cursor;
  }
}
