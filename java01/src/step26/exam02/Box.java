// 제네릭 적용

package step26.exam02;

public class Box<T> {
  private T value;

  public T getValue() {
    return value;
  }

  public void setValue(T value) {
    this.value = value;
  }
  
}
