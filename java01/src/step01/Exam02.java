/* 주제 : 자바 패키지 */
package step01;

public class Exam02 {
  public static void main(String[] args){
    System.out.println("Hello, World!");
  }
}

/* 자바 패키지
  - 소스 코드를 찾기 쉽게 분류하는 문법
  - 문법 :
    package 패키지명1.패키지명2.패키지명3;
  - 가능한 한 소스 파일을 패키지명과 일치하는 디렉토리에 둘 것
    예) package kr.co.bitcamp.java80;
        ==> src/kr/co/bitcamp/java80/Hello.java
  - 컴파일된 클래스 파일은 반드시 패키지 경로와 일치하는 디렉토리에 둘 것
    예) ==> bin/kr/co/bitcamp/java80/Hello.class
*/

/* 컴파일
  > javac -d bin src/step01/Exam02.java
    => 패키지 이름의 디렉토리가 bin 디렉토리에 자동 생성됨
    => bin/step01/Exam02.class
*/

/* 실행
  > java -cp [클래스가 있는 디렉토리] 패키지명1.패키지명2.패키지명3.클래스명
    => -cp의 값은 패키지 디렉토리가 있는 곳을 지정해야 함
       클래스가 있는 곳을 지정해서는 안됨
    => 반드시 클래스 이름에 패키지 이름을 포함해야 함
    => 예) java -cp bin step01.Exam02
*/
