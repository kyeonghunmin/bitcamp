/* 주제 : 메서드 오버로딩과 호출 규칙
 */
package step11;

public class Exam03 {
  static int plus(int a, int b) {
    System.out.println("int, int");
    return a + b;
  }

  // 파라미터 개수가 같더라도 타입이 다르면
  // 같은 이름을 갖는 메서드를 추가할 수 있다.
  static float plus(float a, float b) {
    System.out.println("float, float");
    return a + b;

  }

  static float plus(float a, int b) {
    System.out.println("float, int");
    return a + b;
  }

  public static void main(String[] args) {
    System.out.println(plus(10, 20));   // plus(int, int)
    System.out.println(plus(10f, 20f)); // plus(float, float)
    System.out.println(plus(10, 20f));  // plus(float, float)
                                        // 암시적 형변환으로 가능 (int --> float)
    System.out.println(plus(10f, 20));  // plus(float, int)

  }
}


/* 메서드 오버로딩
- 파라미터의 개수가 다르거나, 파라미터의 타입이 다르다면
  같은 이름을 갖는 메서드를 추가로 선언할 수 있다.
- 의미?
  파라미터의 개수나 타입이 다르더라도 같은 기능을 수행하는 메서드에 대해
  같은 이름을 부여함으로써 프로그래밍의 일관성을 확보하는 문법.

같은 이름을 갖는 메서드의 호출 규칙
- 메서드를 호출할 때 넘겨주는 값(argument)으로 호출할 메서드를 결정한다.
1) 파라미터의 타입과 개수가 완전히 일치하는 메서드를 찾는다.
2) 없다면, 암시적 형변환을 해서라도 값을 넘겨줄 수 있는 메서드를 찾는다.
3) 없다면, 컴파일 오류가 발생한다.


// 오버로딩
같은 기능을 수행하는 메서드들을 같은 이름으로 부여하여
   직관적으로 볼 수 있도록 하는 것.











*/
