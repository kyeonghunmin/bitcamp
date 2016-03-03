/* score 클래스에 setter를 추가함
*/

package step10;

class  Score2 {
  private String name;
  private int kor;
  private int eng;
  private int math;
  private int sum;
  private float aver;

  Score2(String name, int kor, int eng, int math) {
    this.name = name;
    //this.kor = kor;
    //this.eng = eng;
    //this.math = math;
    //this.summary();   // 매번 setter가 실행될 때마다 summary()가 실행되기
                        // 때문에 이 부분에 넣지 않아도 된다.

    this.setKor(kor);   // 생성자 부분에서도 setter를 사용하여 유효 여부 검사
    this.setEng(eng);
    this.setMath(math);
  }

  void summary() {
    this.sum = this.kor + this.eng + this.math;
    this.average();
  }

  void average() {
    this.aver = this.sum / 3f;
  }


  // 셋터 연산자 추가 (값을 저장할 때 사용하는 연산자)
  String getName() {
    return this.name;
  }
  void setName(String name) {
    this.name = name;
  }

  int getKor() {
    return this.kor;
  }
  void setKor(int kor) {
    if (kor >= 0 && kor <= 100) {
      this.kor = kor;
      this.summary(); // 값 변경이 되면 summary를 다시 계산
    }
  }

  int getEng() {
    return this.eng;
  }
  void setEng(int eng) {
    if (eng >= 0 && eng <= 100) {
      this.eng= eng;
      this.summary(); // 값 변경이 되면 summary를 다시 계산
    }
  }

  int getMath() {
    return this.math;
  }
  void setMath(int math) {
    if (math >= 0 && math <= 100) {
      this.math = math;
      this.summary(); // 값 변경이 되면 summary를 다시 계산
    }
  }

  int getSummary() {
    return this.sum;
  }

  float getAverage() {
    return this.aver;
  }

}
