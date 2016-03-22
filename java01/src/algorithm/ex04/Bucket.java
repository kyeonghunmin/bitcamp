package algorithm.ex04;

public class Bucket<T> {
  T value;
  Bucket<T> next;

  public Bucket() {
  }

  public Bucket(T value, Bucket<T> next) {
    this.value = value;
    this.next = next;
  }
}
