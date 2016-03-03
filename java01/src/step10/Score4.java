/* score3의 접근 레벨을 public으로 공개한다.
*/

package step10;

public class Score4 { // public으로 선언했기 때문에 공개 클래스가 된다.
  private String name;
  private int kor;
  private int eng;
  private int math;
  private int sum;
  private float aver;

  public Score4(String name, int kor, int eng, int math) {
    this.name = name;
    this.setKor(kor);
    this.setEng(eng);
    this.setMath(math);
  }

  private void summary() {
    this.sum = this.kor + this.eng + this.math;
    this.average();
  }

  private void average() {
    this.aver = this.sum / 3f;
  }

  public String getName() {
    return this.name;
  }
  public void setName(String name) {
    this.name = name;
  }

  public int getKor() {
    return this.kor;
  }
  public void setKor(int kor) {
    if (kor >= 0 && kor <= 100) {
      this.kor = kor;
      this.summary();
    }
  }

  public int getEng() {
    return this.eng;
  }
  public void setEng(int eng) {
    if (eng >= 0 && eng <= 100) {
      this.eng= eng;
      this.summary();
    }
  }

  public int getMath() {
    return this.math;
  }
  public void setMath(int math) {
    if (math >= 0 && math <= 100) {
      this.math = math;
      this.summary();
    }
  }

  public int getSummary() {
    return this.sum;
  }

  public float getAverage() {
    return this.aver;
  }

}
