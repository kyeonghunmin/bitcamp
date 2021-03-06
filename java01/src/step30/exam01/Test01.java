// 주제 : SQL 맵퍼인 mybatis 적용하기

package step30.exam01;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class Test01 {

  public static void main(String[] args) throws Exception {
    // 1) mybatis 설계도(설정파일)를 읽을 때 사용할 InputStream을 준비한다.
    // InputStream inputStream = new FileInputStream(절대경로 또는 상대경로);
    // 예) 
    // InputStream inputStream = new FileInputStream("./bin/step30/exam01/mybatis-config.xml");
    
    // mybatis에서 제공하는 Resources라는 클래스를 사용하면,
    // classpath 디렉토리에 있는 파일을 절대경로나 상대경로보다 
    // 더 편리하게 파일을 찾을 수 있다.
    // => 패키지 이름만 경로로 지정하면 된다.
    InputStream inputStream = Resources.getResourceAsStream(
                                  "step30/exam01/mybatis-config.xml");
    
    // 3) mybatis 설계도를 이용하여 SqlSessionFactory를 준비한다.
    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

    // 4) SQL Mapper 파일에서 SQL문을 찾아 실행시켜주는 객체를 얻는다.
    SqlSession sqlSession = sqlSessionFactory.openSession();
    
    // 5) SQL Mapper 파일에 있는 SQL문을 실행한다.
    // => SQL Mapper 파일의 namespace값과 SQL문의 id값을 결합하여
    //    실행시킬 SQL을 지정하라.
    List<Member> list = sqlSession.selectList("MemberDao.selectList");
    
    for (Member m : list) {
      System.out.printf("%d,%s,%s,%s,%s\n", 
          m.getNo(), m.getName(), m.getEmail(), m.getPassword(), m.getTel());
    }
    
    // 6) 사용을 완료했으면 SqlSession을 닫는다.
    sqlSession.close();
  }

}

/*
# mybatis 사용 절차
1) 라이브러리 다운로드 및 classpath에 적용
  => mvnrepository.com에서 mybatis 검색한다.
  => build.gradle 파일의 의존 라이브러리 블록에 mybatis 정보를 등록한다.
  => "gradle eclipse" 명령을 실행하여 이클립스 설정 파일을 개정한다.
  
2) mybatis 설정 파일을 준비한다.
  => mybatis.org 사이트에서 설정 파일 설명 페이지로 간다.
  => 설정 파일 예제 코드를 복사한다. (Getting Started 에서 <?xml version ~ 부분)
     (Building SqlSessionFactory from XML)
  => 패키지에 mybatis 설정 파일(mybatis-config.xml)을 생성하고 
     복사한 내용을 붙여 넣는다.
  => DBMS 정보를 현재 환경에 맞게끔 변경한다.
  
3) SQL 맵퍼 파일을 준비한다.
  => mybatis.org 사이트의 SQL 맵퍼 파일 설명 페이지로 간다.
  => SQL 맵퍼의 예제 코드를 복사한다. (Exploring Mapped SQL Statements)
  => 패키지에 SQL 맵퍼 파일(MemberMapper.xml)을 생성하고 복사한 내용을 붙인다.
  => 회원 목록을 질의하는 SQL문을 작성한다.
  
4) SQL문을 실행할 mybatis 객체를 준비한다.
  => mybatis.org 사이트의 getting started 페이지로 간다.
  => SqlSessionFactory 객체를 준비시키는 자바 코드를 복사한다.
  => 이 클래스의 main()에 붙여 넣는다.
  => mybatis 설정 파일의 경로 정보를 변경한다.
  
5) SqlSessionFactory로부터 SqlSession 객체를 얻어라.
  => SqlSession 객체는 SQL Mapper 파일에 있는 SQL문을 찾아서 실행한다.
  
6) SqlSession을 사용하여 DB에 질의를 수행한다.
*/
