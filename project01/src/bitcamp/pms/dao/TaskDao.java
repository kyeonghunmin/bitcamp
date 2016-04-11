package bitcamp.pms.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import bitcamp.pms.annotation.Component;
import bitcamp.pms.domain.Task;

@Component
public class TaskDao {  
SqlSessionFactory sqlSessionFactory;
  
  public TaskDao() {}
  
  public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
    this.sqlSessionFactory = sqlSessionFactory;
    
  }

  public List<Task> selectList() throws Exception {
    SqlSession sqlSession = sqlSessionFactory.openSession();
    
    try {
      return sqlSession.selectList("TaskDao.selectList");
    } finally {
      sqlSession.close();
    }
  }
  
  public Task selectOne(int no) throws Exception {
    SqlSession sqlSession = sqlSessionFactory.openSession();
    
    try {
      return sqlSession.selectOne("TaskDao.selectOne", no);
    } finally {
      sqlSession.close();
    }
  }
  
  public int insert(Task task) throws Exception {
    SqlSession sqlSession = sqlSessionFactory.openSession(true);
    // true로 설정하면 insert 수행시 바로 commit 된다.
    // true로 설정하지 않으면, 자동 commit이 되지 않기 때문에 
    // Temp 테이블에만 남아있고, 실제 테이블에 적용되지 않는다.
    try {
      return sqlSession.insert("TaskDao.insert", task);
      //                       "namespace.id", task
    } finally {
      sqlSession.close();
    }
  }
  
  public int update(Task task) throws Exception {
    SqlSession sqlSession = sqlSessionFactory.openSession();
    
    try {
      int count =  sqlSession.update("TaskDao.update", task);
      sqlSession.commit();
      return count;
    } finally {
      sqlSession.close();
    }
  }
  
  public int delete(int no) throws Exception {
    SqlSession sqlSession = sqlSessionFactory.openSession();
    try {
      int count = sqlSession.delete("TaskDao.delete", no);
      sqlSession.commit();
      return count;
    } finally {
      sqlSession.close();
    }
  }
}
