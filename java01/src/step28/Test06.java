// 주제 : 다양한 예외 확인

package step28;

import java.sql.Connection;
import java.sql.DriverManager;

import com.mysql.jdbc.Driver;

public class Test06 {

  public static void main(String[] args) throws Exception {
    DriverManager.registerDriver(new Driver());
    
    try(Connection con = DriverManager.getConnection(
        "jdbc:mysql://localhost:3306/java80db", "java80", "1111")) {

      
      System.out.println("연결 성공!");
      
    }
    
  }

}

/*
* 오타 등의 이유로 JDBC URL 형식이 잘못되었을 때
=> No suitable driver found for jdbc;mysql://localhost:3306/java80db



*/