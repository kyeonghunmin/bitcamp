/* 게시물 데이터를 다룰 사용자 정의 데이터 타입을 선언하라.
게시물 번호, 제목, 내용, 작성자, 조회수, 작성일(long)
*/

package step12;

public class Board {
  static int count;

  private int no;
  private String title;
  private String text;
  private String name;
  private int click;
  private long date;

  {
    no = ++Board.count;
  }

  public Board() {}

  public Board(String title, String text, String name) {
    this.title = title;
    this.text = text;
    this.name = name;
    this.date = System.currentTimeMillis();
    // 1970년 1월 1일 0시 0분 0초부터 지금까지 흐른 시간을 밀리초로 환산하여 리턴한다.
  }

  public int getNo() {
    return this.no;
  }
  public void setNo(int no) {
    this.no = no;
  }

  public String getTitle() {
    return this.title;
  }
  public void setTitle(String title) {
    this.title = title;
  }

  public String getText() {
    return this.text;
  }
  public void setText(String text) {
    this.text = text;
  }

  public String getName() {
    return this.name;
  }
  public void setName(String name) {
    this.name = name;
  }

  public int getClick() {
    return this.click;
  }
  public void setClick(int click) {
    this.click = click;
  }

  public long getDate() {
    return this.date;
  }
  public void setDate(long date) {
    this.date = date;
  }



}
