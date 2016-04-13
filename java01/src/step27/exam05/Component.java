// 기본 값을 지정할 수 있다.
// => 기본 값이 지정된 경우 속성 값을 설정하지 않으면
//    기본 값이 사용된다.

package step27.exam05;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Component {
  String value() default "haha";
}
