/* 주제 : 날짜 데이터를 다루는 클래스 3
*/

package step13;

import java.util.Calendar;

public class Exam05 {
  public static void main(String[] args) {
    Calendar cal = Calendar.getInstance();  // <== 싱글톤 설계 패턴.

    // Calendar 옵션 값 알아내기
    System.out.println(Calendar.YEAR);
    System.out.println(Calendar.MONTH);
    System.out.println(Calendar.DATE);
    System.out.println(Calendar.HOUR);
    System.out.println(Calendar.MINUTE);
    System.out.println(Calendar.SECOND);
    System.out.println(Calendar.DAY_OF_WEEK);
    System.out.println(Calendar.DAY_OF_MONTH);  // == Calendar.DATE 와 같다.

    System.out.println(cal.get(1));   // 년도
    System.out.println(cal.get(2) + 1);   // 월 (0부터 시작함)
    System.out.println(cal.get(5));   // 일
    System.out.println(cal.get(10));  // 시
    System.out.println(cal.get(12));  // 분
    System.out.println(cal.get(13));  // 초
    System.out.println(cal.get(7));   // 요일

    // get()의 argument 값을 직접 숫자로 지정하기 보다는
    // 미리 정의된 스태틱 상수 변수를 사용하는 것이
    // 코드를 읽고 쓸 때 편하다.
    int option = Calendar.YEAR;
    System.out.println(cal.get(option));   // 년도
    System.out.println(cal.get(Calendar.MONTH) + 1);   // 월 (0부터 시작함)
    System.out.println(cal.get(Calendar.DATE));   // 일
    System.out.println(cal.get(Calendar.HOUR));  // 시
    System.out.println(cal.get(Calendar.MINUTE));  // 분
    System.out.println(cal.get(Calendar.SECOND));  // 초
    System.out.println(cal.get(Calendar.DAY_OF_WEEK));   // 요일

  }
}
/*
*/
