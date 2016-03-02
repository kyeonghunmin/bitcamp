/* 주제 : 반복문 for */
package step05;

public class Exam12 {
  public static void main(String[] args) {


    for (/*1*/int i = 0; /*2*/i < 3; /*4*/i++) {
      /*3*/System.out.println(i);
    }
    System.out.println("-----------------");
    // for 실행 순서
    // 1 --> 2 --> 3 --> 4 --> 2 (반복)


    // 1) 초기화문장 생략
    int i = 0;    // for 문 안에 선언된 변수는 for 문이 끝나면 삭제된다.
    for (; i < 3; i++) {
      System.out.println(i);
    }
    System.out.println("-----------------");

    // 2) 증가/감소문 생략
    i = 0;
    for (; i < 3;) {
      System.out.println(i++);
    }
    System.out.println("-----------------");

    // 3) 조건문 생략
    i = 0;
    for (;;) {    // <--- while 문을 사용할 것.
      System.out.println(i++);
      if (i >= 3)
        break;
    }
    System.out.println("-----------------");
  }
}
