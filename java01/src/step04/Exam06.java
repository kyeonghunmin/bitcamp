/* 주제 : 비트 연산자 응용 */
package step04;

public class Exam06 {
  public static void main(String[] args) {
    // 비트 연산자 사용 전
    // 1) 낱개 변수 사용
    boolean c = true;
    boolean cpp = false;
    boolean python = true;
    boolean php = false;
    boolean javascript = false;
    boolean java = true;
    boolean cs = false;
    boolean go = false;
    boolean scala = false;

    // 값 조사
    if (java == true)
      System.out.println("자바사용가능");


    // 2) 배열 사용
    boolean[] languages = {true, false, true, false,
                           false, true, false, false, false};

    // 값 조사
    if (languages[5] == true)
      System.out.println("자바사용가능");


    // 비트 연산자 사용 후
    int mylanguage = 0b1_0100_1000;

    // 각 언어의 값이 무엇인지 알아낼 때 사용할 마스크 선언
    int C_LANG = 0b1_0000_0000;     // 8번 비트의 값만 추출하는 마스크로 사용
    int CPP_LANG = 0b0_1000_0000;   // 7번 비트의 값만 추출하는 마스크로 사용
    int PY_LANG = 0b0_0100_0000;    // 6번 비트의 값만 추출하는 마스크로 사용
    int J_LANG = 0b0_0000_1000;     // 3번 비트의 값만 추출하는 마스크로 사용

    // 비교를 수행한다. => 비교할 값에 마스크를 씌운다.
    // 그래서 통과된 값이 마스크 값과 일치하는지 검사한다.
    if((mylanguage & J_LANG) == J_LANG)
      System.out.println("자바사용가능");
    if((mylanguage & C_LANG) == C_LANG)
      System.out.println("C사용가능");
    if((mylanguage & CPP_LANG) == CPP_LANG)
      System.out.println("CPP사용가능");
  }
}
