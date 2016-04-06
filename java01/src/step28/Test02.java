// 주제 : 예외 처리와 연결 해제 1 - 연결 해제를 자동으로 하기 전

package step28;

import java.sql.Connection;
import java.sql.DriverManager;

import com.mysql.jdbc.Driver;

public class Test02 {

  public static void main(String[] args) throws Exception {
    DriverManager.registerDriver(new Driver());

    Connection con = DriverManager.getConnection(
        "jdbc:mysql://localhost:3306/java80db?user=java80&password=1111");
    
    System.out.println("연결 성공!");
    
    System.out.printf("5 / 0 = %d\n", 5 / 0);
    // 0으로 나눌시 예외 발생으로 인해 곧바로 상위 호출자(JVM)에게 보고한다.
    // => 커넥션 객체를 해제하지 못하는 문제가 발생하게 된다.
    
    System.out.println("맑은 날씨입니다.");
        
    con.close();
  }

}
