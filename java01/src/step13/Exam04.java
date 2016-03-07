/* 주제 : 날짜 데이터를 다루는 클래스 2
*/

package step13;

import java.sql.Date;

public class Exam04 {
  public static void main(String[] args) {
    long currTime = System.currentTimeMillis(); // 1970.01.01 0시0분0초부터 ~
    Date today = new Date(currTime);

    System.out.println(today);  // YYYY-MM-DD

    // java.sql.Date 클래스를 주로 사용하는 경우
    // "yyyy-mm-dd" --> Date 인스턴스
    Date date = Date.valueOf("2016-3-7"); // 문자열을 날짜 인스턴스로 변경한다.
    System.out.println(date);
  }
}

/*
*/
