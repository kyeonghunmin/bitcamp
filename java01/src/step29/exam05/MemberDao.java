package step29.exam05;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class MemberDao {
  DataSource dataSource;
  
  public MemberDao() {}
  
  public void setDataSource(DataSource dataSource) {
    this.dataSource = dataSource;
  }

  public List<Member> selectList() throws Exception {
    ArrayList<Member> list = new ArrayList<>();
    Connection con = null;
    Statement stmt = null;
    ResultSet rs = null;
    try {
      con = dataSource.getConnection();
      stmt = con.createStatement();
      rs = stmt.executeQuery("select * from MEMBERS");
      Member member = null;
      
      while (rs.next()) {
        member = new Member();
        member.setNo(rs.getInt("MNO"));
        member.setName(rs.getString("MNAME"));
        member.setEmail(rs.getString("EMAIL"));
        member.setPassword(rs.getString("PWD"));
        member.setTel(rs.getString("TEL"));
        list.add(member);
      }
      return list;
    } finally {
      try {rs.close();} catch (Exception e) {}
      try {stmt.close();} catch (Exception e) {}
      dataSource.returnConnection(con);
    }
  }
  
  public int insert(Member member) throws Exception {
    Connection con = null;
    PreparedStatement stmt = null;
    try {
      con = dataSource.getConnection();
      stmt = con.prepareStatement("insert into MEMBERS(MNAME,EMAIL,PWD,TEL)"
          + " values(?,?,?,?)");
      
      stmt.setString(1,  member.getName());
      stmt.setString(2,  member.getEmail());
      stmt.setString(3,  member.getPassword());
      stmt.setString(4,  member.getTel());
      
      return stmt.executeUpdate();
      
    } finally {
      try {stmt.close();} catch (Exception e) {}
      dataSource.returnConnection(con);
    }
  }
  
  public int update(Member member) throws Exception {
    Connection con = null;
    PreparedStatement stmt = null;
    
    try {
      con = dataSource.getConnection();
      stmt = con.prepareStatement("update MEMBERS set MNAME=?, EMAIL=?, PWD=?, TEL=? where MNO=?");
      
      stmt.setString(1, member.getName());
      stmt.setString(2, member.getEmail());
      stmt.setString(3, member.getPassword());
      stmt.setString(4, member.getTel());
      stmt.setInt(5, member.getNo());
      
      return stmt.executeUpdate();
      
    } finally { // 자원해제는 역순으로 할 것.
      try {stmt.close();} catch (Exception e) {}
      dataSource.returnConnection(con);
    }
  }
  
  public int delete(int no) throws Exception {
    Connection con = null;
    PreparedStatement stmt = null;
    
    try {
      con = dataSource.getConnection();
      stmt = con.prepareStatement("delete from MEMBERS where MNO=?");
      stmt.setInt(1,  no);
      return stmt.executeUpdate();
      // insert된 개수를 리턴한다.
      // 지정된 규칙에 맞지 않으면 insert 오류가 발생한다. (무결성 보장)
      
    } finally { // 자원해제는 역순으로 할 것.
      try {stmt.close();} catch (Exception e) {}
      dataSource.returnConnection(con);
    }
  }
}
