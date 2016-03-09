package step17.quiz;

public class Test {
  public static void main(String[] args) {
    Member[] m = new Member[5];
    Yesno y = new Yesno();

    for (int i = 0; i < 5; i++) {
      m[i] = new Member();
      m[i].setName();
      m[i].setEmail();
      m[i].setPassword();
      m[i].setPhone();

      do {
        y.setYn();
      } while (y.ynEquals());

      if (y.yesEquals()) {
        System.out.println("저장했습니다.");
      }
      else if (y.noEquals()) {
        System.out.println("저장을 취소했습니다.");
        i--;
      }
    }

    System.out.println("지금까지 입력한 회원정보는 다음과 같습니다.");
    System.out.println("-------------------------------------------");
    for (int i = 0; i < 5; i++) {
      System.out.printf("%s, %s, %s, %s\n", m[i].getName(), m[i].getEmail(),
                                            m[i].getPassword(), m[i].getPhone());
    }
  }
}
