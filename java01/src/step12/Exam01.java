/* 주제 : 스태틱 변수(클래스 변수)와 스태틱 블록
- 클래스 변수 : 클래스 이름으로 찾을 수 있기 때문에 "클래스 변수"라고도 부른다.
 */
package step12;

public class Exam01 {

  static int staticValue;
  int instanceValue;

  public void instanceMethod() {
    System.out.println(instanceValue);
  }

  // 인스턴스 변수는 사용되기 전에 생성자를 통해 초기화시킬 수 있다.
  public Exam01() {
    instanceValue = 100;
  }

  // 스태틱 변수를 사용하기 전에 적절한 값으로 초기화시키는 방법
  // => 스태틱 블록
  static {
    staticValue = 500;
  }

  public static void main(String[] args) {
    System.out.println(Exam01.staticValue);

    Exam01 p = new Exam01();
    p.instanceMethod();

  }
}

/* 스태틱 블록 실행 순서
1) 클래스 로딩
2) 스태틱 변수 준비
3) 스태틱 변수의 초기화 문장 실행
4) 스태틱 블록 실행












*/
