/* 주제 : 또다른 인스턴스 초기화 문법 - 인스턴스 초기화 블록
 */
package step09;

public class Exam05 {
  static class  Score {
    String name;
    int kor;
    int eng;
    int math;
    int sum;
    float aver;

    { // 인스턴스 초기화 블록
      System.out.println("인스턴스 초기화 블록1");
    }

    Score(String name, int kor, int eng, int math) {
      System.out.println("생성자 호출");
      this.name = name;
      // this.name : Heap에 있는 인스턴스 변수
      // name : 파라미터 값
      this.kor = kor;
      this.eng = eng;
      this.math = math;
    }

    { // 인스턴스 초기화 블록
      System.out.println("인스턴스 초기화 블록2"); // 위치는 상관 없다.
    }

  }

  public static void main(String[] args) {
    new Score("홍길동", 100, 100, 100);

    // 익명 클래스 만들기
    Object anonymousObj = new Object() {
      public String toString() {
        return "익명 객체";
      }
      {
        System.out.println("익명 객체 초기화");
      }
    };
    System.out.println(anonymousObj);

  }
}


/* 인스턴스 초기화 블록
- 생성자처럼 인스턴스가 생성될 때 마다 실행되는 블록
  => 인스턴스 초기화 블록이 모두 실행된 후 생성자가 실행된다.
- 생성자가 있는데 왜 이 문법이 필요한가?
  => 생성자가 없는 클래스에 대해 초기화 작업을 추가하고 싶을 때 사용한다.
- 생성자가 없는 클래스?
  => 익명 중첩 클래스









*/
