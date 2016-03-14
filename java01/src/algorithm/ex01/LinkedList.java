package algorithm.ex01;

public class LinkedList {
  Bucket start;
  Bucket end;
  int count = 0;

  public LinkedList() {
    start = new Bucket();
    end = start;
  }

  public void add(Object value) {
    end.value = value;
    Bucket temp = new Bucket();
    end.next = temp;
    end = temp;
    count++;
  }

  public Object get(int index) {
    if (index < 0 || index >= count) {
      return null;
    }

    Bucket cursor = start;

    for (int i = 1; i <= index; i++) {
      if (cursor.next == null) {
        return null;
      }
      cursor = cursor.next;
    }
    return cursor.value;
  }

  public int size() {
    return count;
  }

  public void add(int index, Object value) {
    if (index < 0 || index > count) {
      return;
    }

    Bucket newBucket = new Bucket(value, null);

    if (index == 0){
      newBucket.next = start;
      start = newBucket;
      count++;
      return;
    }

    if (index == count) {
      add(value);
      return;
    }

    Bucket cursor = start;
    for (int i = 1; i < index; i++) {
      cursor = cursor.next;
    }
    cursor.next = newBucket;
    newBucket.value = value;
    newBucket.next = cursor.next;
    count++;
  }

  public Object remove(int index) {
    Bucket cursor = start;
    if (index < 0 || index >= size()) {
      return null;
    }

    if (index == 0) {
      start = cursor.next;
    }

    for (int i = 1; i < index; i++) {
      cursor = cursor.next;
    }
    count--;
    return cursor.next = cursor.next.next;
  }

  public Object set(int index, Object value) {
    Bucket cursor = start;

    if (index < 0 || index >= size()) {
      return null;
    }

    for (int i = 1; i < index; i++) {
      cursor = cursor.next;
    }

    Object ob = cursor.next;
    cursor.next.value = value;
    return ob;

  }
}
