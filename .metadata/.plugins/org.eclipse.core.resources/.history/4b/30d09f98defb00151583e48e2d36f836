// 주제 : DBMS에 연결하기

package step28;

import java.sql.Connection;
import java.sql.DriverManager;

import com.mysql.jdbc.Driver;

public class Test01 {

  public static void main(String[] args) throws Exception {
    // 1) java.sql.Driver 구현체를 JDBC 드라이버 관리자에 등록한다.
    DriverManager.registerDriver(new Driver());
    
    // 2) JDBC 드라이버 관리자에게 java.sql.Connection 구현체를 달라고 요청한다.
    // => JDBC 드라이버 관리자 --> com.mysql.jdbc.Driver 객체에게 요구한다.
    // => com.mysql.jdbc.Driver --> JDBC 드라이버 관리자에게 Connection 구현체를 리턴한다.
    // => 즉 com.mysql.jdbc.ConnectionImpl 객체를 리턴한다.
    // => JDBC 드라이버 관리자는 com.mysql.jdbc.Driver가 리턴한 값을 그대로 리턴한다.
    // => 우리는 java.sql.Connection 인터페이스의 레퍼런스로 해당 객체를 받는다.
    Connection con = DriverManager.getConnection(
        "jdbc:mysql://localhost:3306/java80db?user=java80&password=1111");
    
    System.out.println("연결 성공!");
    
    // 3) 커넥션 객체를 사용한 후에는 명시적으로 닫아야 한다.
    // => 안 닫는다면?
    //    일정 시간동안 DBMS 서버 메모리에 연결 정보가 남아있게 된다.
    // => 연결 정보가 남아있다면? 
    //    DBMS는 최대 연결 수를 관리한다.
    //    연결 수가 최대 값을 초과하면 더이상 연결을 허락하지 않는다.
    //    그래서 항상 커넥션을 다 사용한 후에는 즉시 끊는 것이 중요하다.
    // => 물론 안 끊는다면?
    //    서버에 설정된 시간(timeout)이 지나면 강제로 연결을 끊는다.
    con.close();
  }

}
