package step23.step05;

import java.util.ArrayList;
import java.util.Calendar;

public class HelloJp extends ArrayList<String> implements Hello {
  public HelloJp() {
    this.add("こんにちは");
    this.add("こんばんは");
  }

  @Override
  public String greet() {
    return this.sayHello(); // 기존 메서드를 손대지 않는다.
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
