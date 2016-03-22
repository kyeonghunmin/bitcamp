package practice;

public class LinkedList<T> {
  Bucket<T> start;
  Bucket<T> end;
  int count;

  public LinkedList() {
    start = new Bucket<>();
    end = start;
  }

  public int size() {
    return count;
  }

  public void add(T value) {
    end.value = value;
    end.next = new Bucket<>();
    end = end.next;
    count++;
  }

  public void add(int index, T value) {
    if (index < 0 || index > count) {
      throw new OutOfIndexException("인덱스가 유효하지 않습니다.");
    }

    if (index == 0) {
      Bucket<T> newBucket = new Bucket<>(value, start);
      start = newBucket;
      count++;
      return;
    }

    if (index == count) {
      add(value);
      return;
    }

    Bucket<T> cursor = start;
    for (int i = 0; i < (index - 1); i++) {
      cursor = cursor.next;
    }
    cursor.next = new Bucket<>(value, cursor.next);
    count++;
  }

  public T get(int index) {
    if (index < 0 || index >= count) {
      throw new OutOfIndexException("인덱스가 유효하지 않습니다.");
    }

    Bucket<T> cursor = start;
    for (int i = 0; i < index; i++) {
      cursor = cursor.next;
    }
    return cursor.value;
  }

  public T remove(int index) {
    if (index < 0 || index >= count) {
      throw new OutOfIndexException("인덱스가 유효하지 않습니다.");
    }

    T temp = null;
    count--;

    if (index == 0) {
      temp = start.value;
      start = start.next;
      return temp;
    }

    Bucket<T> cursor = start;
    for (int i = 0; i < (index - 1); i++) {
      cursor = cursor.next;
    }

    temp = cursor.next.value;
    cursor.next = cursor.next.next;
    return temp;
  }

  public T set(int index, T value) {
    if (index < 0 || index >= count) {
      throw new OutOfIndexException("인덱스가 유효하지 않습니다.");
    }

    Bucket<T> cursor = start;
    for (int i = 0; i < index; i++) {
      cursor = cursor.next;
    }

    T temp = cursor.value;
    cursor.value = value;
    return temp;
  }
}
