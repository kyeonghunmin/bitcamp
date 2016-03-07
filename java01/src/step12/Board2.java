package step12;

public class Board2 {
  public static void main(String[] args) {
    Member m = new Member("민경훈", "alsrudgns", "rudgns", "010-8654", "alsrudgns@naver.com");

    System.out.printf("%d, %s, %s, %s, %s, %s\n",
            m.getNo(), m.getName(), m.getId(), m.getPassword(), m.getPhone(), m.getEmail());

    Board b = new Board("sfsd", "sdfsd", "sfkwejfkwe");

    System.out.printf("%d, %s, %s, %s, %s, %s\n",
            b.getNo(), b.getTitle(), b.getText(), b.getName(), b.getClick(), b.getDate());
  }
}
