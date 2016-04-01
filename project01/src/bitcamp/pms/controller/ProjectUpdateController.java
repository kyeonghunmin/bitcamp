package bitcamp.pms.controller;

import java.sql.Date;
import java.util.Scanner;

import bitcamp.pms.Dao.ProjectDao;
import bitcamp.pms.annotation.Controller;
import bitcamp.pms.annotation.RequestMapping;
import bitcamp.pms.domain.Project;
import bitcamp.pms.util.CommandUtil;

@Controller
public class ProjectUpdateController {
  private ProjectDao projectDao;

  public void setProjectDao(ProjectDao projectDao) {
    this.projectDao = projectDao;
  }

  @RequestMapping("project/update.do")
  public void update(Scanner keyScan) {
    
    try {
      
      System.out.print("변경할 프로젝트 번호?");
      int no = Integer.parseInt(keyScan.nextLine());
  
      Project oldProject = projectDao.selectOne(no);
      Project project = new Project();
  
      System.out.printf("프로젝트명(%s)? ", oldProject.getTitle());
      project.setTitle(keyScan.nextLine());
      System.out.printf("시작일(%s)? ", oldProject.getStartDate());
      project.setStartDate(Date.valueOf(keyScan.nextLine()));
      System.out.printf("종료일(%s)? ", oldProject.getEndDate());
      project.setEndDate(Date.valueOf(keyScan.nextLine()));
      System.out.printf("설명(%s)? ", oldProject.getDescription());
      project.setDescription(keyScan.nextLine());
  
      if (CommandUtil.confirm(keyScan, "변경하시겠습니까?")) {
        projectDao.update(no, project);
        System.out.println("변경하였습니다.");
      } else {
        System.out.println("변경을 취소하였습니다.");
      }
      
    } catch (Exception e) {
      System.out.println("데이터 처리에 실패했습니다.");
    }
  }

}
