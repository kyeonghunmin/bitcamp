package step23;

import java.util.ArrayList;
import java.util.Calendar;

public class HelloJp extends ArrayList<String> {
  public HelloJp() {
    this.add("こんにちは");
    this.add("こんばんは");
  }
  public String sayHello() {
    Calendar cal = Calendar.getInstance(); // Canlendar 인스턴스를 가져온다.
    // cal : 현재 날짜와 시간 정보를 담을 변수
    int hour = cal.get(Calendar.HOUR);  // 시간 정보를 리턴하여 hour에 담는다.

    if (hour < 18) {
      return this.get(0);  // ArrayList에서 0번째를 리턴
    } else {
      return this.get(1);
    }
  }
}
