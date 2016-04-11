// 주제 : SQL 맵퍼인 mybatis 적용하기 - MemberDao에 적용하기

package step30.exam02;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MemberList {

  public static void main(String[] args) throws Exception {
    InputStream inputStream = Resources.getResourceAsStream(
                                  "step30/exam02/mybatis-config.xml");
    
    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

    // MemberDao에 SqlSessionFactory를 주입한다.
    MemberDao memberDao = new MemberDao();
    memberDao.setSqlSessionFactory(sqlSessionFactory);
    
    SqlSession sqlSession = sqlSessionFactory.openSession();

    List<Member> list = sqlSession.selectList("MemberDao.selectList");
    
    for (Member m : list) {
      System.out.printf("%d,%s,%s,%s,%s\n", 
          m.getNo(), m.getName(), m.getEmail(), m.getPassword(), m.getTel());
    }

    sqlSession.close();
  }

}