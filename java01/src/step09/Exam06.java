/* 주제 : 인스턴스 초기화 문장
생성자와 인스턴스 초기화 블록을 사용하지 않고 인스턴스 변수를 초기화하는 방법
 */
package step09;

public class Exam06 {
  static class  Score {
    String name = "오호라";  // 인스턴스 변수 선언 + 초기화 문장
    int kor = 50;
    int eng = 50;
    int math = 50;
    int sum = 0;
    float aver = 50f;

    { // 인스턴스 초기화 블록
      name = "우헤헤";
    }

    Score() { // 생성자
      sum = 150;
    }

  }

  public static void main(String[] args) {
    Score obj = new Score();  // 생성자 호출
    System.out.printf("%s, %d, %d, %d, %d, %f\n", obj.name, obj.kor, obj.eng,
                                                  obj.math, obj.sum, obj.aver);

  }
}


/* 인스턴스 생성 후 초기화 작업 순서
0) 인스턴스 변수를 모두 0으로 초기화
   => byte, short, int long = 0
   => float, double = 0.0
   => char = \u0000
   => boolean = false
   => 메서드에 선언된 로컬 변수는 자동 초기화되지 않는다.
      따라서 개발자가 사용하기 전에 초기화시켜야 한다.
1) 인스턴스 초기화 문장 실행
2) 인스턴스 초기화 블록 실행
3) 생성자 실행









*/
