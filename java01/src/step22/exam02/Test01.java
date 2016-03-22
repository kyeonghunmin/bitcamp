// 주제 : 바이트 출력하기

package step22.exam02;

import java.io.File;
import java.io.IOException;
import java.io.FileOutputStream;

public class Test01 {
  public static void main(String[] args) throws IOException {
    FileOutputStream out = new FileOutputStream("exam02.Test01.data");

    int value = 0x2a3b4c5d;  // 708529245 (10진수)

    out.write(value);
    // 비록 파라미터 타입이 int라 하더라도 맨 끝 1바이트만 출력한다.

    // 주의! OS 자원을 사용하는 경우, 사용 후 반드시 해제해야 한다.
    out.close();
  }
}

// 자바 입출력
// - data streaming 개념을 지원한다.
//   즉, 대상이 누구냐에 상관없이 단순히 데이터 입출력 흐름으로 보는 것이다.
// - 특징
//   1) 입력과 출력 역할을 분리하였다.
//   2) 바이트 스트림과 문자 스트림으로 구분하였다.
//   3) 데이터를 목적지에 직접 읽고 쓰는 클래스와 중간에서 데이터를 처리하는
//      클래스로 구분하였다.
// - 주요 클래스
//   1) InputStream/OutputStream : 바이트 스트림을 다루는 추상 클래스이다.
//                                 (상속 해주는 용도이다.)
//
//     - Data Sink Stream class : 직접 읽고 쓰기를 한다.
//       -> FileInputStream/FileOutputStream : I/O 대상이 파일이다.
//       -> ByteArrayInputStream/ByteArrayOutputStream : I/O 대상이 바이트 배열이다.
//       -> PipedInputStream/PipedOutputStream : I/O 대상이 프로세스이다.
//
//     - Date Processing Stream class : 중간에서 데이터를 가공한다.
//       -> BufferedInputStream/BufferedOutputStream : 버퍼를 이용한 입출력 속도를 개선한다.
//       -> DataInputStream/DataOutputStream : 원시타입 등의 데이터를 입출력하기 쉽다.
//       -> ObjectInputStream/ObjectOutputStream : 인스턴스를 입출력한다.
//       PrintStream : 바이트 및 문자 출력 가능하다.
//
//   2) Reader/Writer : 문자 스트림을 다루는 추상 클래스이다.
//                      (상속 해주는 용도이다.)
//
//     - Data Sink Stream class : 직접 읽고 쓰기를 한다.
//       -> FileReader/FileWriter : I/O 대상이 파일이다.
//       -> CharArrayReader/CharArrayWriter : I/O 대상이 char 배열이다.
//       -> StringReader/StringWriter : I/O 대상이 문자열이다.
//       -> PipedReader/PipedWriter : I/O 대상이 프로세스이다.
//
//     - Date Processing Stream class : 중간에서 데이터를 가공한다.
//       -> BufferedReader/BufferedWriter : 버퍼를 이용한 입출력 속도를 개선한다.
//       -> PrintWriter : 바이트 및 문자 출력 가능하다.
