/* 주제 : 기본 데이터 타입만 사용하여 복잡한 데이터 다루기 */
package step09;

public class Exam01 {
  public static void main(String[] args) {
    String[] names = new String[3];
    int[] kors = new int[3];
    int[] engs = new int[3];
    int[] maths = new int[3];
    int[] sums = new int[3];
    float[] avers = new float[3];

    names[0] = "홍길동";
    kors[0] = 100;
    engs[0] = 90;
    maths[0] = 100;

    names[1] = "임꺽정";
    kors[1] = 90;
    engs[1] = 90;
    maths[1] = 80;

    names[2] = "유관순";
    kors[2] = 100;
    engs[2] = 100;
    maths[2] = 100;

    for (int i = 0; i < names.length; i++) {
      sums[i] = kors[i] + engs[i] + maths[i];
      avers[i] = sums[i] / 3f;
    }

    for (int i = 0; i < names.length; i++) {
      System.out.printf("%s, %d, %d, %d, %d, %f\n",
          names[i], kors[i], engs[i], maths[i], sums[i], avers[i]);
    }
  }
}
