// 제네릭 적용 - 값의 범위를 한정하기

package step26.exam03;

import java.io.Writer;

public class Box<T extends Writer> {
  private T value;

  public T getValue() {
    return value;
  }

  public void setValue(T value) {
    this.value = value;
  }
  
}
