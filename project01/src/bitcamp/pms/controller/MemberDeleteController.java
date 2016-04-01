package bitcamp.pms.controller;

import java.util.Scanner;

import bitcamp.pms.Dao.MemberDao;
import bitcamp.pms.annotation.Controller;
import bitcamp.pms.annotation.RequestMapping;
import bitcamp.pms.util.CommandUtil;

@Controller
public class MemberDeleteController {
  private MemberDao memberDao;

  
  public void setMemberDao(MemberDao memberDao) {
    this.memberDao = memberDao;
  }

  @RequestMapping("member/delete.do")
  public void delete(Scanner keyScan) {
    
    try {
      
      
      System.out.print("삭제할 회원 번호는? ");
      int no = Integer.parseInt(keyScan.nextLine());
  
      if (CommandUtil.confirm(keyScan, "정말 삭제하시겠습니까?")) {
          memberDao.delete(no);
          System.out.println("삭제하였습니다.");
      } else {
        System.out.println("삭제를 취소하였습니다.");
      }
      
      
      
    } catch (Exception e) {
      System.out.println("데이터 처리에 실패했습니다.");
    }
  }

}
