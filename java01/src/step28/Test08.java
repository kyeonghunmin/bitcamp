// 주제 : 질의 객체(SQL문을 서버에 보낼 객체)를 준비하기

package step28;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Test08 {

  public static void main(String[] args) throws Exception {
    Connection con = null;
    Statement stmt = null;
    
    try {
      Class.forName("com.mysql.jdbc.Driver");
      con = DriverManager.getConnection(
          "jdbc:mysql://localhost:3306/java80db", "java80", "1111");
      System.out.println("연결 성공!");
      
      stmt = con.createStatement();
      System.out.println("질의 객체 준비 완료");
      
    } finally {
      // 자원을 해제할 때는 역순으로 해제해야 한다.
      try {stmt.close();} catch (Exception e) {}
      try {con.close();} catch (Exception e) {}
    }
    
  }
    
}