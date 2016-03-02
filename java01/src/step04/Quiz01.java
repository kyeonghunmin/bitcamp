/* 문제 :
개인이 좋아하는 영화 장르를 출력하는 프로그램을 작성하라.
=> 장르의 선호 여부를 표현할 때 비트로 표현할 것.
=> 비트 연산자를 이용하여 검사할 것.
=> 장르 :
범죄 드라마 코미디 로맨스 스릴러 가족
판타지 액션 SF 애니메이션 다큐멘터리 공포

=> 테스트 데이터:
홍길동이 좋아하는 장르 - 드라마, 액션, SF, 다큐멘터리
*/

package step04;

public class Quiz01 {
  public static void main(String[] args) {
    int crime = 0x800;
    int drama = 0x400;
    int comedy = 0x200;
    int romance = 0x100;
    int thriller = 0x80;
    int family = 0x40;
    int fantasy = 0x20;
    int action = 0x10;
    int sf = 0x8;
    int animation = 0x4;
    int documentary = 0x2;
    int horror = 0x1;

    int honggildong = 0x41a; // = drama | action | sf | documentary;

    System.out.println("홍길동이 좋아하는 드라마?");

    if((honggildong & crime) == crime)
      System.out.println("범죄");
    if((honggildong & drama) == drama)
      System.out.println("드라마");
    if((honggildong & comedy) == comedy)
      System.out.println("코미디");
    if((honggildong & romance) == romance)
      System.out.println("로맨스");
    if((honggildong & thriller) == thriller)
      System.out.println("스릴러");
    if((honggildong & family) == family)
      System.out.println("가족");
    if((honggildong & fantasy) == fantasy)
      System.out.println("판타지");
    if((honggildong & action) == action)
      System.out.println("액션");
    if((honggildong & sf) == sf)
      System.out.println("SF");
    if((honggildong & animation) == animation)
      System.out.println("애니메이션");
    if((honggildong & documentary) == documentary)
      System.out.println("다큐멘터리");
    if((honggildong & horror) == horror)
      System.out.println("공포");



  }
}
