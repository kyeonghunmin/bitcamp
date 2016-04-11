// 주제 : 데이터 변경하기 - update문 보내기

package step29.exam05;

public class MemberUpdate {

  public static void main(String[] args) throws Exception {

    
    try {
      Member member = new Member();
      member.setNo(10);
      member.setName("염라대왕");
      member.setEmail("sae@test.com");
      member.setPassword("1111");
      member.setTel("1111-1111");   
      
      MemberDao memberDao = new MemberDao(
          "com.mysql.jdbc.Driver",
          "jdbc:mysql://localhost:3306/java80db",
          "java80",
          "1111"
          );
      int count = memberDao.update(member);
      
      System.out.printf("변경 개수 : %d\n", count);
      
      memberDao.destroy();
      
    } catch (Exception e) {
      System.out.println("변경 실패입니다.");
    }
    
  }
    
}