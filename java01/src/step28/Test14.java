// 주제 : Statement 사용 시 문제점 해결 - PreparedStatement 사용

package step28;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Test14 {

  public static void main(String[] args) throws Exception {
    Connection con = null;
    PreparedStatement stmt = null;
    ResultSet rs = null;
    
    try {
      Class.forName("com.mysql.jdbc.Driver");
      con = DriverManager.getConnection(
          "jdbc:mysql://localhost:3306/java80db", "java80", "1111");
      
      String str = "4";
      
      stmt = con.prepareStatement("select * from MEMBERS where MNO=?");
      
      stmt.setString(1, str);
      
      rs = stmt.executeQuery();
      
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

//preparedstatement : 값을 분리했기 때문에 임의의 sql 코드를 삽입할 수 없다 -> 보안에 좋다.
//2011년도 행안부 자바 시큐어 코딩 가이드에 따르면 질의를 던질 때 in parameter 방식으로 해야한다고 나와있다.




