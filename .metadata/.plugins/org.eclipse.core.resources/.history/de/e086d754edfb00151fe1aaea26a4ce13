// 주제 : 데이터 삭제하기 - delete문 보내기

package step29.exam02;

public class MemberDelete {

  public static void main(String[] args) throws Exception {
    try {

      
      MemberDao memberDao = new MemberDao();
      int count = memberDao.delete(2);
      // insert된 개수를 리턴한다.
      // 지정된 규칙에 맞지 않으면 insert 오류가 발생한다. (무결성 보장)
      
      System.out.printf("삭제 개수 : %d\n", count);
      
    } catch (Exception e) {
      System.out.println("삭제 실패입니다.");
    }
    
  }
    
}