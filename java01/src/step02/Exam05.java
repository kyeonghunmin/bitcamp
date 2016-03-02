/* 주제 : 배열의 선언 */
package step02;

public class Exam05 {
  public static void main(String[] args) {
    int kor, eng, math;

    // 배열 선언
    int[] scores = new int[3];            // 4byte * 3
    char[] chars = new char[10];          // 2byte * 10
    boolean[] tf = new boolean[5];        // -byte * 5 (1byte * 5)
    float[] avers = new float[10];        // 4byte * 10
    double[] money = new double[100];     // 8byte * 100
    byte[] bytes = new byte[1024];        // 1byte * 1024
    short[] s = new short[30];            // 2byte * 30
    long[] ll = new long[345];            // 8byte * 345
  }
}


/* 배열(array)
- 같은 종류의 메모리를 여러 개 준비하는 명령어
- 연속해서 메모리를 준비한다.
- 문법
  데이터타입[] 배열의별명 = new 데이터타입[개수];
  예) int[] a = new int[20];
  예) int a[] = new int[20]; <-- C 언어 방식의 문법으로 추천하지 않는다.
- 배열은 new 명령으로 생성해야 한다.
*/
