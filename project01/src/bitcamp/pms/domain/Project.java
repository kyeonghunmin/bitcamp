package bitcamp.pms.domain;

import java.sql.Date;

public class Project {
  private String title;
  private Date startDate;
  private Date endDate;
  private String description;
  private int state;

  public Project() {}

  public Project(String title, Date startDate, Date endDate) {
    this.title = title;
    this.startDate = startDate;
    this.endDate = endDate;
  }

  @Override
  public String toString() {
    return this.title + ", " + this.startDate + ", " +
           this.endDate + ", " + this.state;
  }

  public void setTitle(String title) {
    this.title = title;
  }
  public String getTitle() {
    return title;
  }

  public void setStartDate(Date startDate) {
    this.startDate = startDate;
  }
  public Date getStartDate() {
    return startDate;
  }

  public void setEndDate(Date endDate) {
    this.endDate = endDate;
  }
  public Date getEndDate() {
    return endDate;
  }

  public void setDescription(String description) {
    this.description = description;
  }
  public String getDescription() {
    return description;
  }

  public void setState(int state) {
    this.state = state;
  }
  public int getState() {
    return state;
  }
}
