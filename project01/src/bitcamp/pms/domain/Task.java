package bitcamp.pms.domain;

public class Task {
  private String title;
  private String description;
  private int memberNo;
  private int projectNo;
  private int state;

  public Task() {}

  public Task(String title, String description) {
    this.title = title;
    this.description = description;
  }

  @Override
  public String toString() {
    return this.title + ", " + this.description;
  }

  public void setTitle(String title) {
    this.title = title;
  }
  public String getTitle() {
    return title;
  }

  public void setDescription(String description) {
    this.description = description;
  }
  public String getDescription() {
    return description;
  }
}
