/* 주제 : 생성자 오버로딩
 */
package step11;

public class Exam01 {
  public static void main(String[] args) {
    Score s = new Score("홍길동", 100, 100, 100);
    System.out.printf("%s, %d, %d, %d, %d, %f\n",
      s.getName(), s.getKor(), s.getEng(), s.getMath(),
      s.getSummary(), s.getAverage());

    Score s2 = new Score();
    s2.setName("임꺽정");
    s2.setKor(100);
    s2.setEng(80);
    s2.setMath(90);
    System.out.printf("%s, %d, %d, %d, %d, %f\n",
      s2.getName(), s2.getKor(), s2.getEng(), s2.getMath(),
      s2.getSummary(), s2.getAverage());
  }
}


/* 오버로딩?
- 비록 파라미터가 다르더라도 같은 기능을 수행하는 메서드에 대해
  같은 이름을 부여함으로써 프로그래밍의 일관성을 확보하는 문법.

같은 이름을 갖는 메서드 또는 생성자가 있을 때 호출 규칙
- 파라미터의 종류와 개수를 보고 호출할 메서드 또는 생성자를 결정한다.
*/
