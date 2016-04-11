// 주제 : Statement 사용 시 문제점

package step28;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Test13 {

  public static void main(String[] args) throws Exception {
    Connection con = null;
    Statement stmt = null;
    ResultSet rs = null;
    
    try {
      Class.forName("com.mysql.jdbc.Driver");
      con = DriverManager.getConnection(
          "jdbc:mysql://localhost:3306/java80db", "java80", "1111");  
      stmt = con.createStatement();
      
      String str = "3";
      
      rs = stmt.executeQuery("select * from MEMBERS where MNO=" + str);
      
      while (rs.next()) {
        System.out.printf("%d, %s, %s, %s\n", 
            rs.getInt("MNO"), 
            rs.getString("MNAME"), 
            rs.getString("EMAIL"), 
            rs.getString("PWD"));
      }
      
    } finally {
      try {rs.close();} catch (Exception e) {}
      try {stmt.close();} catch (Exception e) {}
      try {con.close();} catch (Exception e) {}
    }
    
  }
    
}