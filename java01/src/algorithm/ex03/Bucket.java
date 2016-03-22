package algorithm.ex03;

public class Bucket {
  Object value;
  Bucket prev;

  public Bucket() {
  }

  public Bucket(Object value, Bucket prev) {
    this.value = value;
    this.prev = prev;
  }
}
