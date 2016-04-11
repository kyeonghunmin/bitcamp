// 주제 : 예외 처리와 연결 해제 3 - try(자원){} 문법 사용하여 자동으로 자원해제 하기

package step28;

import java.sql.Connection;
import java.sql.DriverManager;

import com.mysql.jdbc.Driver;

public class Test04 {

  public static void main(String[] args) throws Exception {
    DriverManager.registerDriver(new Driver());
    
    try(Connection con = DriverManager.getConnection(
        "jdbc:mysql://localhost:3306/java80db", "java80", "1111")) {
      // () 안에 선언한 모든 자원은 try 블록을 벗어나기 전에 자동해제 된다.
      // 이때, java.lang.AutoCloseable 객체만 자동해제 된다.
      // 그 외에는 finally로 해제해야 한다.
      
      System.out.println("연결 성공!");
      
      System.out.printf("5 / 0 = %d\n", 5 / 0);
      
      System.out.println("맑은 날씨입니다.");
      
    }
    
  }

}