/*
회원 데이터를 다룰 사용자 정의 데이터 타입 선언하라.
회원번호, 이름, 아이디, 암호, 전화, 이메일
*/

package step12;

public class Member {
  static int count;

  private int no;
  private String name;
  private String id;
  private String password;
  private String phone;
  private String email;

  {
    this.no = ++Member.count;
  }

  public Member() {}

  public Member(String name, String id, String password, String phone, String email) {
    this.name = name;
    this.id = id;
    this.password = password;
    this.phone = phone;
    this.email = email;
  }

  public int getNo() {
    return no;
  }
  public void setNo(int no) {
    this.no = no;
  }

  String getName() {
    return name;
  }
  void setName(String name) {
    this.name = name;
  }

  String getId() {
    return id;
  }
  void setId(String id) {
    this.id = id;
  }

  String getPassword() {
    return password;
  }
  void setPassword(String password) {
    this.password = password;
  }

  String getPhone() {
    return phone;
  }
  void setPhone(String phone) {
    this.phone = phone;
  }

  String getEmail() {
    return email;
  }
  void setEmail(String email) {
    this.email = email;
  }



}
