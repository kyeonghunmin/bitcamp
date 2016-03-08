/* 주제 : 상속 - Specialization(특화)
*/
package step14.exam02;

public class Test {
  public static void main(String[] args) {
    Sedan c1 = new Sedan();
    Truck c2 = new Truck();
  }
}

/*
Car 클래스를 상속 받아서 조금 더 특별한 종류의 클래스를 만든다.
1) 승용차 클래스 만들기
   Sedan 클래스 정의
     + automatic (자동기어조정장치 여부)
     + sunroof (썬루프)
2) 짐차 클래스 만들기
   Truck 클래스 정의
     + weight (짐 중량)
     + dump (덤프 여부)

# Specialization
- 수퍼 클래스를 상속 받아서 기능을 추가하여 하위 클래스를 만드는 것.
*/
