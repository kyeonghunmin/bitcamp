/* 주제 : 반복문 for(:) */
package step05;

public class Exam14 {
  public static void main(String[] args) {
    int[] scores = {100, 60, 70, 0};

    // 배열을 좀 더 쉽게 다루기 위해 등장한 for 문법
    // for (배열항목을 저장할 변수 : 배열 or Collection 물건) {...}
    int index = 0;
    for (int values : scores) {
      scores[3] += values;
      if (++index == 3)
        break;
    }
    System.out.println(scores[3]);
    // 배열 개수만큼 자동으로 반복한다.
    // 배열 전체를 다룰 때는 편리하다.
    // 배열의 일부를 다룰 때는 번거롭다.
    // 왜? 중간에 멈추기 위한 코드를 작성해야 한다.
  }
}
