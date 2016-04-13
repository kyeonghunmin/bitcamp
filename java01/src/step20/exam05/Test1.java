// 주제 : 패키지 멤버 클래스를 이용한 상수 다루기

package step20.exam05;

public class Test1 {
  public static void main(String[] args) {
    // 상수 사용하기
    int gender = Gender.WOMAN;
    int working = Working.STUDENT;
    int tech = Tech.JAVA;

  }
}
/*
# 문제점
- 간단한 상수를 선언하는 클래스를 여러 개 만들어야 한다.
  => 소스 파일이 여러 개 생성된다.
  => 관리가 번거롭다.
*/