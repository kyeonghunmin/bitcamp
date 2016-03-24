// 주제 : 인스턴스 읽기 - ObjectInputStream 데코레이터 사용

package step22.exam05;

import java.io.File;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.BufferedInputStream;
import java.io.ObjectInputStream;

public class Test11 {
  public static void main(String[] args) throws Exception {
    FileInputStream in0 = new FileInputStream("exam05.Test10.data");
    BufferedInputStream in1 = new BufferedInputStream(in0);
    ObjectInputStream in = new ObjectInputStream(in1);

    Member2 m1 = (Member2)in.readObject();
    m1.calculateBMI();  // transient 필드의 값을 설정한다. BMI 계산 수행
    // bmi 변수는 serialize로 내보내지지 않기 때문에 계산을 따로 해야 한다.
    Member2 m2 = (Member2)in.readObject();
    m2.calculateBMI();


    in.close();
    in1.close();
    in0.close();

    System.out.println(m1);
    System.out.println(m2);
  }
}
