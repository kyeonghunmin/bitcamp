package step10;

class  Score {    // 패키지 직속 클래스는 static을 붙이지 않는다.
  // name은 직접 접근해도 실행에 문제가 없지만,
  // 일관성있는 접근 레벨 제어를 위해 다른 변수와 접근 레벨을 맞춘다.
  // => name을 private으로 만들면 name또한 getter를 만들어야 한다.
  private String name;
  // 점수를 저장할 변수의 접근 레벨을 조정한다.
  // => 외부 접근에 대해 격리 레벨을 높힌다.
  private int kor;  // 클래스 내부에서만 접근 가능
  private int eng;
  private int math;
  private int sum;
  private float aver;

  Score(String name, int kor, int eng, int math) {
    this.name = name;
    this.kor = kor;
    this.eng = eng;
    this.math = math;
  }

  void summary() {
    this.sum = this.kor + this.eng + this.math;
  }

  void average() {
    this.aver = this.sum / 3f;
  }

  // 겟터 연산자(메서드) --> 값을 꺼내주는 연산자
  String getName() {
    return this.name;
  }
  
  int getKor() {
    return this.kor;
  }

  int getEng() {
    return this.eng;
  }

  int getMath() {
    return this.math;
  }

  int getSummary() {
    return this.sum;
  }

  float getAverage() {
    return this.aver;
  }

}
