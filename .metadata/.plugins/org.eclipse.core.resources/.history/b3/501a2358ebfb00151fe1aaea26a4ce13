// 주제 : 질의하기 - SELECT 문 보내기

package step29.exam01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MemberList {

  public static void main(String[] args) throws Exception {
    Connection con = null;
    Statement stmt = null;
    ResultSet rs = null;
    
    try {
      Class.forName("com.mysql.jdbc.Driver");
      con = DriverManager.getConnection(  // Connection 구현체 리턴
          "jdbc:mysql://localhost:3306/java80db", "java80", "1111");
      System.out.println("연결 성공!");
      
      stmt = con.createStatement();
      System.out.println("질의 객체 준비 완료");
      
      rs = stmt.executeQuery("select * from MEMBERS");
      // ResultSet 구현체를 리턴한다. (select의 결과를 리턴하는 것이 아님)
      
      while (rs.next()) {
        System.out.printf("%d, %s, %s, %s\n", 
            rs.getInt("MNO"), 
            rs.getString("MNAME"), 
            rs.getString("EMAIL"),
            rs.getString("PWD"));
      }
      
    } finally { // 자원해제는 역순으로 할 것.
      try {rs.close();} catch (Exception e) {}
      try {stmt.close();} catch (Exception e) {}
      try {con.close();} catch (Exception e) {}
    }
    
  }
    
}