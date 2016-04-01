// 애노테이션 정의
// => value라는 속성을 가지고 있다.

package step27.exam01;

public @interface Component {
  String value(); // <-- 속성을 정의할 때 메서드처럼 정의한다.
}
