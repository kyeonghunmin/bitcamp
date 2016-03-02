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

public class Quiz01up1 {
  public static void main(String[] args) {

    int[] GENRE_MASK = {0x800, 0x400, 0x200, 0x100,
                        0x80,  0x40,  0x20,  0x10,
                        0x8,   0x4,   0x2,   0x1};


    int honggildong = 0x41a; // = drama | action | sf | documentary;

    System.out.println("홍길동이 좋아하는 드라마?");

    if((honggildong & GENRE_MASK[0]) == GENRE_MASK[0])
      System.out.println("범죄");
    if((honggildong & GENRE_MASK[1]) == GENRE_MASK[1])
      System.out.println("드라마");
    if((honggildong & GENRE_MASK[2]) == GENRE_MASK[2])
      System.out.println("코미디");
    if((honggildong & GENRE_MASK[3]) == GENRE_MASK[3])
      System.out.println("로맨스");
    if((honggildong & GENRE_MASK[4]) == GENRE_MASK[4])
      System.out.println("스릴러");
    if((honggildong & GENRE_MASK[5]) == GENRE_MASK[5])
      System.out.println("가족");
    if((honggildong & GENRE_MASK[6]) == GENRE_MASK[6])
      System.out.println("판타지");
    if((honggildong & GENRE_MASK[7]) == GENRE_MASK[7])
      System.out.println("액션");
    if((honggildong & GENRE_MASK[8]) == GENRE_MASK[8])
      System.out.println("SF");
    if((honggildong & GENRE_MASK[9]) == GENRE_MASK[9])
      System.out.println("애니메이션");
    if((honggildong & GENRE_MASK[10]) == GENRE_MASK[10])
      System.out.println("다큐멘터리");
    if((honggildong & GENRE_MASK[11]) == GENRE_MASK[11])
      System.out.println("공포");



  }
}
