package practice;

public class OutOfIndexException extends RuntimeException {
  public OutOfIndexException() {

  }

  public OutOfIndexException(String message) {
    super(message);
  }
}
