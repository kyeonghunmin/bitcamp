// final의 활용 3

package step12;

public final class Car10 {

  // 파라미터 앞에 final을 붙인다.
  public static int plus(final int a, final int b) {
    // 만약 파라미터로 받은 값을 실수로 변경하려 한다면
    // 컴파일 오류가 발생할 것이다.
    // => 파라미터 값을 일반 로컬 변수로 착각하지 않도록 하기 위함.
    return a + b;
    
    // 위에서 파라미터 변수의 값을 모두 활용하였다고,
    // 다음과 같이 메모리 아끼려고 일반 로컬 변수처럼 사용한다면,
    // 위험하다.
    // a = 30;
  }

}
