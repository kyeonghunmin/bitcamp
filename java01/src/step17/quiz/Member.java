package step17.quiz;

import java.util.Scanner;

public class Member {
  Scanner keyScan = new Scanner(System.in);

  private String name;
  private String email;
  private String password;
  private String phone;

  void setName() {
    System.out.print("이름? ");
    this.name = keyScan.nextLine();
  }
  String getName() {
    return name;
  }

  void setEmail() {
    System.out.print("이메일? ");
    this.email = keyScan.nextLine();
  }
  String getEmail() {
    return email;
  }

  void setPassword() {
    System.out.print("암호? ");
    this.password = keyScan.nextLine();
  }
  String getPassword() {
    return password;
  }

  void setPhone() {
    System.out.print("전화번호? ");
    this.phone = keyScan.nextLine();
  }
  String getPhone() {
    return phone;
  }
}
