/*
책 데이터를 다룰 사용자 정의 데이터 타입을 선언하라.
책번호, ISBN, 제목, 저자들, 출판사, 총페이지수, 가격, 소개
*/

package step12;

public class Book {
  static int count;

  private int no;
  private String isbn;
  private String title;
  private String[] authors;
  private String make;
  private int page;
  private int price;
  private String memo;

  {
    no = ++Book.count;
  }

  public Book() {}

  public Book(String isbn, String title, String[] authors, String make, int page, int price) {
    this.isbn = isbn;
    this.title = title;
    this.authors = authors;
    this.make = make;
    this.page = page;
    this.price = price;
  }

  public int getNo() {
    return no;
  }
  public void setNo(int no) {
    this.no = no;
  }

  public String getIsbn() {
    return isbn;
  }
  public void setIsbn(String isbn) {
    this.isbn = isbn;
  }

  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }

  public String[] getAuthors() {
    return authors;
  }
  public void setAuthors(String[] authors) {
    this.authors = authors;
  }

  public String getMake() {
    return make;
  }
  public void setMake(String make) {
    this.make = make;
  }

  public int getPage() {
    return page;
  }
  public void setPage(int page) {
    this.page = page;
  }

  public int getPrice() {
    return price;
  }
  public void setPrice(int price) {
    this.price = price;
  }
}
