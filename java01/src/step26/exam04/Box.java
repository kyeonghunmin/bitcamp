// 제네릭 적용

package step26.exam04;

public class Box<T> {
  private T value;

  public T getValue() {
    return value;
  }

  public void setValue(T value) {
    this.value = value;
  }
  
}
