package bitcamp.pms.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import bitcamp.pms.annotation.Component;
import bitcamp.pms.domain.Board;

@Component
public class BoardDao {
  SqlSessionFactory sqlSessionFactory;
  
  public BoardDao() {}
  
  public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
    this.sqlSessionFactory = sqlSessionFactory;
    
  }
  
  public List<Board> selectList() throws Exception {
    SqlSession sqlSession = sqlSessionFactory.openSession();
    
    try {
      return sqlSession.selectList("BoardDao.selectList");
    } finally {
      sqlSession.close();
    }
  }
  
  public Board selectOne(int no) throws Exception {
    SqlSession sqlSession = sqlSessionFactory.openSession();
    
    try {
      return sqlSession.selectOne("BoardDao.selectOne", no);
    } finally {
      sqlSession.close();
    }
  }
  
  public int insert(Board board) throws Exception {
    SqlSession sqlSession = sqlSessionFactory.openSession(true);
    // true로 설정하면 insert 수행시 바로 commit 된다.
    // true로 설정하지 않으면, 자동 commit이 되지 않기 때문에 
    // Temp 테이블에만 남아있고, 실제 테이블에 적용되지 않는다.
    try {
      return sqlSession.insert("BoardDao.insert", board);
      //                       "namespace.id", member
    } finally {
      sqlSession.close();
    }
  }
  
  public int update(Board board) throws Exception {
    SqlSession sqlSession = sqlSessionFactory.openSession();
    
    try {
      int count =  sqlSession.update("BoardDao.update", board);
      sqlSession.commit();
      return count;
    } finally {
      sqlSession.close();
    }
  }
  
  public int delete(int no) throws Exception {
    SqlSession sqlSession = sqlSessionFactory.openSession();
    try {
      int count = sqlSession.delete("BoardDao.delete", no);
      sqlSession.commit();
      return count;
    } finally {
      sqlSession.close();
    }
  }
}
  
