// 주제 : SQL 맵퍼인 mybatis 적용하기 - MemberDao에 적용하기 - insert

package step30.exam03;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MemberAdd {

  public static void main(String[] args) throws Exception {
    InputStream inputStream = Resources.getResourceAsStream(
                                  "step30/exam03/mybatis-config.xml");
    
    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

    // MemberDao에 SqlSessionFactory를 주입한다.
    MemberDao memberDao = new MemberDao();
    memberDao.setSqlSessionFactory(sqlSessionFactory);
    
    Member member = new Member();
    member.setName("세종대왕");
    member.setEmail("sae@test.com");
    member.setPassword("1111");
    member.setTel("1111-1111");
    
    memberDao.insert(member);
    System.out.println("입력 성공");
  }

}