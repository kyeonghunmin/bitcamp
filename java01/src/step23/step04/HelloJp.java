package step23.step04;

import java.util.ArrayList;
import java.util.Calendar;

public class HelloJp extends AbstractHello {
  ArrayList<String> list = new ArrayList<>();

  public HelloJp() {
    list.add("こんにちは");
    list.add("こんばんは");
  }

  @Override
  public String greet() {
    return sayHello();
  }
  // 기존에 이미 사용한 경우를 대비해서 제거하지 않은 경우
  public String sayHello() {
    Calendar cal = Calendar.getInstance(); // Canlendar 인스턴스를 가져온다.
    // cal : 현재 날짜와 시간 정보를 담을 변수
    int hour = cal.get(Calendar.HOUR);  // 시간 정보를 리턴하여 hour에 담는다.

    if (hour < 18) {
      return list.get(0);  // ArrayList에서 0번째를 리턴
    } else {
      return list.get(1);
    }
  }
}
