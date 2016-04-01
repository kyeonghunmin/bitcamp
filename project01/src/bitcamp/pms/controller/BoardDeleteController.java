package bitcamp.pms.controller;

import java.util.Scanner;

import bitcamp.pms.Dao.BoardDao;
import bitcamp.pms.annotation.Controller;
import bitcamp.pms.annotation.RequestMapping;
import bitcamp.pms.util.CommandUtil;

@Controller
public class BoardDeleteController {
  private BoardDao boardDao;
  
  public void setBoardDao(BoardDao boardDao) {
    this.boardDao = boardDao;
  }

  @RequestMapping("board/delete.do")
  public void delete(Scanner keyScan) {
    
    try {
      
      
      System.out.print("삭제할 게시 번호? ");
      int no = Integer.parseInt(keyScan.nextLine());
  
      if (CommandUtil.confirm(keyScan, "정말 삭제하시겠습니까?")) {
          boardDao.delete(no);
          System.out.println("삭제하였습니다.");
      } else {
        System.out.println("삭제를 취소하였습니다.");
      }
      
      
    } catch (Exception e) {
      System.out.println("데이터 처리에 실패했습니다.");
    }
  }

}
