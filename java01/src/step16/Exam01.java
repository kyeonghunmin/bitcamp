// 주제 : java.lang.Object 클래스

package step16;

public class Exam01 /*extends Object*/{
  public static void main(String[] args) {
    Exam01 p = new Exam01();
    Exam01 p2 = new Exam01();
    
    System.out.println(p.toString());
    System.out.println(Integer.toHexString(p.hashCode()));
    System.out.println(p.getClass());
    System.out.println(p.equals(p2));
  }
}

/*
Object 클래스
 - 자바의 모든 클래스는 Object를 자동으로 상속 받는다.
 - 상속한다고 명시하지 않으면 컴파일러가 자동으로 삽입한다.
 - 자바 클래스가 기본으로 가져야할 필드(변수)와 메서드를 구비하고 있다.
 - 주요 메서드
   1) toString() : 클래스이름@해시값
   2) hashCode() : 인스턴스를 구별하기 위한 4바이트 정수 값 (주소 아님)
   3) equals()   : 인스턴스가 같은 지 비교
   4) getClass() : 인스턴스의 클래스 정보를 담는다.
   5) clone()    : 인스턴스를 복제
   6) finalize() : 가비지 컬렉터가 쓰레기 인스턴스를 해제하기 전에 호출한다.
                   보통 가비지 컬렉터의 실행 시점을 개발자가 임의적으로
                   조정하지 않기 때문에 쓰레기 인스턴스가 언제 수거되는지 모름
                   따라서 finalize()의 호출 시점을 명확히 알 수 없다.
                   메모리가 부족하지 않다면 프로그램이 종료될 때까지
                   가비지 컬렉터가 동작하지 않는다.
                   -> 프로그램이 종료될 때까지 finalize()가 호출되지 않을 수 있다는 것을 의미.
                      finalize()에 의존하는 코드를 작성하지 말 것.
                      (오버라이드 하지 말 것, C++의 소멸자와 다름)
*/
