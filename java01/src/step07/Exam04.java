/* 주제 : 각 클래스마다 값을 개별적으로 관리하기 */
package step07;

public class Exam04 {
  public static void main(String[] args) {
    // 문제 : 2 * 3 + 6 - 7 = ?
    // 문제 : 3 - 7 * 2 + 27 = ?
    //        연산자 우선순위를 무시하고 순서대로 계산할 것

    // 인스턴스 변수를 준비하기
    // new 클래스이름(); ---> 해당 클래스의 인스턴스 변수를 조사하여
    //                        그 메모리를 준비한다.
    //                        그리고 그 메모리의 시작 주소를 리턴한다.
    //                        그 메모리를 "인스턴스" 라고 부른다.
    // => 인스턴스 주소를 저장할 변수 선언
    // => 클래스이름 변수명;
    //    이 변수는 인스턴스의 주소를 저장하기 때문에 레퍼런스 변수라 부른다.
    //    일반적으로 변수를 뺀 "레퍼런스" 라고 부른다.

    // 1) 레퍼런스 변수 준비
    Calculator3 calc1;    // stack에 생성된다.
    Calculator3 calc2;

    // 2) 인스턴스 변수를 담은 인스턴스(object)을 준비
    calc1 = new Calculator3();    // heap에 생성된다.
    calc2 = new Calculator3();

    Calculator3.plus(calc1, 2);   // calc1에 담긴 주소와 2라는 값을 넘긴다.
    Calculator3.plus(calc2, 3);

    Calculator3.multiple(calc1, 3);
    Calculator3.minus(calc2, 7);

    Calculator3.plus(calc1, 6);
    Calculator3.multiple(calc2, 2);

    Calculator3.minus(calc1, 7);
    Calculator3.plus(calc2, 27);

    System.out.println(calc1.result);
    System.out.println(calc2.result);
  }
}

/*
인스턴스 : 설계도에 따라 준비한 메모리
=> new Calculator3(); 명령을 통해 준비된 메모리를 인스턴스라고 부른다.
=> 이때, Calculator3 클래스로 가서 인스턴스 변수를 찾아 그에 맞게 메모리를 준비.
=> 주의! 클래스 전체가 메모리에 복제되는 것이 아니다.
   예) 인스턴스안에는 메서드가 존재하지 않는다.
*/
