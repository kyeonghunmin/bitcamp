/* 주제 : 다른 패키지의 클래스 사용 및 클래스 접근 레벨
 */
package step10.other;

import step10.Score3;   // Score3의 소속을 컴파일러에게 알린다.
                        // 컴파일 후에 제거되는 명령문이다.

public class Exam05 {
  public static void main(String[] args) {
    // 방법1) 정확하게 패키지 이름을 모두 적음.
    //step10.Score3 s = new step10.Score3("홍길동", 100, 100, 100);

    // 방법2) import를 사용하여 패키지 정보를 미리 알려줌.
    Score3 s = new Score3("홍길동", 100, 100, 100);
    s.setKor(50);

    System.out.printf("%s, %d, %d, %d, %d, %f\n",
      s.getName(), s.getKor(), s.getEng(), s.getMath(),
      s.getSummary(), s.getAverage());

  }
}

/* 다른 패키지 클래스 사용법
1) 클래스 이름 앞에 패키지 이름을 모두 적어라.
2) 패키지 선언 아래에 클래스의 패키지 정보를 등록한다.
   => import step10.Score3;
   => import step10.*;    // <-- 와일드카드 사용 비추천.
                          //     클래스의 소속을 직관적으로 알 수 없기 때문.

컴파일할 때 오류 발생?
- Score3 클래스의 접근 레벨이 default이기 때문이다.
- default는 오직 같은 패키지에 소속된 클래스만이 접근할 수 있다.
- Exam05는 Score3와 다른 패키지에 소속되었기 때문에 Score3에 접근할 수 없다.
- 해결책?
  => Score3 클래스의 접근 레벨을 public 공개하면 된다. (Score4.java 참조)


*/
