// 주제 : 데이터 삭제하기 - delete문 보내기

package step29.exam01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class MemberDelete {

  public static void main(String[] args) throws Exception {
    Connection con = null;
    Statement stmt = null;
    
    try {
      Class.forName("com.mysql.jdbc.Driver");
      con = DriverManager.getConnection(
          "jdbc:mysql://localhost:3306/java80db", "java80", "1111");
      
      stmt = con.createStatement();
      
      int count = stmt.executeUpdate("delete from MEMBERS where mno in (6, 7)");
      // insert된 개수를 리턴한다.
      // 지정된 규칙에 맞지 않으면 insert 오류가 발생한다. (무결성 보장)
      
      System.out.printf("삭제 개수 : %d\n", count);
      
    } finally { // 자원해제는 역순으로 할 것.
      try {stmt.close();} catch (Exception e) {}
      try {con.close();} catch (Exception e) {}
    }
    
  }
    
}