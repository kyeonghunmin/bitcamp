package bitcamp.pms.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import bitcamp.pms.annotation.Component;
import bitcamp.pms.domain.Project;

@Component
public class ProjectDao {
  SqlSessionFactory sqlSessionFactory;
  
  public ProjectDao() {}
  
  public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
    this.sqlSessionFactory = sqlSessionFactory;
    
  }

  public List<Project> selectList() throws Exception {
    SqlSession sqlSession = sqlSessionFactory.openSession();
    
    try {
      return sqlSession.selectList("ProjectDao.selectList");
    } finally {
      sqlSession.close();
    }
  }
  
  public Project selectOne(int no) throws Exception {
    SqlSession sqlSession = sqlSessionFactory.openSession();
    
    try {
      return sqlSession.selectOne("ProjectDao.selectOne", no);
    } finally {
      sqlSession.close();
    }
  }
  
  public int insert(Project project) throws Exception {
    SqlSession sqlSession = sqlSessionFactory.openSession(true);
    // true로 설정하면 insert 수행시 바로 commit 된다.
    // true로 설정하지 않으면, 자동 commit이 되지 않기 때문에 
    // Temp 테이블에만 남아있고, 실제 테이블에 적용되지 않는다.
    try {
      return sqlSession.insert("ProjectDao.insert", project);
      //                       "namespace.id", project
    } finally {
      sqlSession.close();
    }
  }
  
  public int update(Project project) throws Exception {
    SqlSession sqlSession = sqlSessionFactory.openSession();
    
    try {
      int count =  sqlSession.update("ProjectDao.update", project);
      sqlSession.commit();
      return count;
    } finally {
      sqlSession.close();
    }
  }
  
  public int delete(int no) throws Exception {
    SqlSession sqlSession = sqlSessionFactory.openSession();
    try {
      int count = sqlSession.delete("ProjectDao.delete", no);
      sqlSession.commit();
      return count;
    } finally {
      sqlSession.close();
    }
  }
}
