/* 문제: 
=> 향후 기능이 계속 추가될 수 있다.
=> 가능한 기존 소스 코드를 손대지 않았으면 한다.
=> 상속?
   계속 기능이 추가될 때 마다 서브 클래스를 만든다면,
   너무 많은 서브 클래스가 생성되는 문제가 발생한다.
=> 해결책?
   각 메서드를 작은 클래스로 정의한다.
   메서드가 하는 일이 한 명령을 실행하는 일을 한다.
   따라서 명령 단위로 클래스를 만드는 방식이다.
=> 단점
   클래스가 여러 개 생성된다.
   유지보수 측면에서는 오히 크게 문제가 없다.
=> 
   "커맨드(command) 패턴"
 */

// 커맨드 패턴 : 각 메서드를 작은 클래스로 정의한다.
//               각각의 메서드를 클래스화 시킨다.

package designpattern.command.exam04;

import java.util.HashMap;

public class Test {
  static HashMap<String,Command> commandMap = new HashMap<>();
  
  static {
    commandMap.put("+", new PlusCommand());
    commandMap.put("-", new MinusCommand());
    commandMap.put("*", new MultipleCommand());
  }
  
  public static void main(String[] args) {
    if (args.length < 3) {
      System.out.println("사용법 : java -cp bin ...Test 10 + 20");
      return;
    }
    
    Command command = commandMap.get(args[1]);
    if (command == null) {
      System.out.println("지원하지 않는 연산자입니다.");
      return;
    }
    
    command.execute(Integer.parseInt(args[0]), Integer.parseInt(args[2]));

  }

}
