// 주제 : 데이터 삭제하기 - delete문 보내기

package step29.exam04;

public class MemberDelete {

  public static void main(String[] args) throws Exception {
    try {

      
      MemberDao memberDao = new MemberDao(
          "com.mysql.jdbc.Driver",
          "jdbc:mysql://localhost:3306/java80db",
          "java80",
          "1111"
          );
      int count = memberDao.delete(11);
      // insert된 개수를 리턴한다.
      // 지정된 규칙에 맞지 않으면 insert 오류가 발생한다. (무결성 보장)
      
      System.out.printf("삭제 개수 : %d\n", count);
      
      memberDao.destroy();
      
    } catch (Exception e) {
      System.out.println("삭제 실패입니다.");
    }
    
  }
    
}