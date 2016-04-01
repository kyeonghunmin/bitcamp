package bitcamp.pms.controller;

import java.util.List;

import bitcamp.pms.Dao.ProjectDao;
import bitcamp.pms.annotation.Controller;
import bitcamp.pms.annotation.RequestMapping;
import bitcamp.pms.domain.Project;

@Controller
public class ProjectListController { 
  private ProjectDao projectDao;

  public void setProjectDao(ProjectDao projectDao) {
    this.projectDao = projectDao;
  }

  @RequestMapping("project/list.do")
  public void list() {
    
    try {
      List<Project> projects = projectDao.selectList();
      
      for (int i = 0; i < projects.size(); i++) {
        System.out.printf("%d, %s\n", i, projects.get(i).toString());
      }
    } catch (Exception e) {
      throw new RuntimeException("프로젝트 데이터 로딩 실패", e);
    }
  }

}
