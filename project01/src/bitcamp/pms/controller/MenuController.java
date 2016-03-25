// ProjectApp과 메뉴 처리기 사이의 호출 규칙
// => ProjectApp은 메뉴를 처리할 때 이 규칙에서 정의한 메서드를 호출한다.

package bitcamp.pms.controller;

import java.util.Map; // Map 인터페이스에는 HashMap, HashTable이 포함되어 있다.

public interface MenuController {
  void init();
  // Map 타입이기 때문에 HashMap, HashTable 다 올 수 있다.
  void service(Map<String,Object> paramMap);
  void destroy();
}
