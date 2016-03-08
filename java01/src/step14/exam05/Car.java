package step14.exam05;

public abstract class Car {
  String model;
  String maker;
  int cc;
  int capacity;

  public void printInfo() {
    System.out.printf("모델 : %s\n", model);
    System.out.printf("제조사 : %s\n", maker);
    System.out.printf("cc : %s\n", cc);
    System.out.printf("최대수용인원 : %s\n", capacity);
  }
}
