/* 주제 : 문자 값 표현 */
package step01;

public class Exam13 {
  public static void main(String[] args) {
    System.out.println((char)0x0041);
    System.out.println((char)0x0042);
    System.out.println((char)0x0061);
    System.out.println((char)0x0062);
    System.out.println((char)0xAC00);
    System.out.println((char)0xAC01);

    // 자바에서 제공하는 특수한 연산자 ''
    // => '' 안에 있는 문자에 대해 유니코드 값을 리턴한다.
    System.out.println('A');
    System.out.println('a');
    System.out.println('가');

    int a = 'A';    // '' 연산자는 A 문자에 대한 유니코드 값을 리턴한다.
    int b = 'a';    // '' 연산자는 a 문자에 대한 유니코드 값을 리턴한다.
    int c = '가';   // '' 연산자는 가 문자에 대한 유니코드 값을 리턴한다.

    System.out.println(Integer.toHexString(a)); // 41
    System.out.println(Integer.toHexString(b)); // 61
    System.out.println(Integer.toHexString(c)); // ac00

    // 특수 명령 \u
    System.out.println('\uac00');
    System.out.println('\uac01');
  }
}


/* 자바의 문자
- 자바는 유니코드 명세에 따라 문자를 2바이트 메모리에 저장한다.
A => 0x0041 => 0000 0000 0100 0001
B => 0x0042 => 0000 0000 0100 0010
a => 0x0061
b => 0x0062
가 => 0xAC00
각 => 0xAC01

1) ASCII(7bit)
ABCabc각가간똘똠똥 ==> 41 42 43 61 62 63 ---- ---- ----

2) ISO-8859-1(8bit)
- ASCII + 유럽문자

3) EUC-KR(16bit)
- 2350자 한글 정의
ABCabc각가간똘똠똥 ==> 41 42 43 61 62 63 b0a1 b0a2 b0a3 b6ca ---- b6cb

4) 조합형(16bit)
- 초성(5비트), 중성(5비트), 종성(5비트)로 정의
- 첫 비트는 한글이라는 의미로 1로 설정
- 1[초성5비트][중성5비트][종성5비트] = 16비트
- 국제 표준 아니다.

5) MS949(16bit)
- 윈도우95부터 추가된 문자집합
- EUC-KR + 추가한글 = 11172자
- 국제 표준 아니다.
ABCabc각가간똘똠똥 ==> 41 42 43 61 62 63 b0a1 b0a2 b0a3 b6ca 8c63 b6cb

6) Unicode(16bit)
- 영어, 한글 모두 2바이트로 정의함.
- 한글은 새로운 코드 값으로 정의함 => EUC-KR과 호환이 안됨. => 새로 작성해야 함.
ABCabc각가간똘똠똥 ==> 0041 0042 0043 0061 0062 0063
                       AC01 AC02 AC04 ...
- 참고
  유니코드의 버전이 2바이트에서 4바이트로 옮겨가고 있다.

7) UTF-8(1 ~ 4바이트)
- 유니코드 문자를 재정의 함.
- 1바이트로 표현 가능한 것은 그대로 1바이트로 표현하고,
- 2바이트 문자는 2 ~ 4바이트로 변환하여 표현한다.
ABCabc각가간똘똠똥 ==> 41 42 43 61 62 63 EABO80 EAB081 EAB084 ...
- 이점: 영어의 경우 ISO-8859-1과 완벽하게 호환된다.
        => 영어 문서는 UTF-8로 바꿔도 기존의 문서와 같다.
        => ISO-8859-1로 저장된 문서를 UTF-8로 바꿀 필요가 없다.
-       10만자 이상되는 중국 한자를 모두 표현할 수 있다.
- 단점: 한글의 경우 3바이트로 저장되기 때문에 용량이 50% 증가하는 문제가 있다.

* \ u를 이용한 문자 표현
- 문법: '\ u유니코드'
  예) '\uac00', '\u0041'
*/
