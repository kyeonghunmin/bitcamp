package step20.exam01;

public class Bucket {
  Object value;
  Bucket next;

  public Bucket() {
  }

  public Bucket(Object value, Bucket next) {
    this.value = value;
    this.next = next;
  }
}
