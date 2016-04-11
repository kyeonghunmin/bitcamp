// 클래스 파일로부터 애노테이션 정보를 추출하기

package step27.exam01;

import java.lang.annotation.Annotation;

public class Test {

  public static void main(String[] args) {
    // 1) 클래스 정보를 가져온다.
    Class<?> clazz = Member.class;

    // 2) 클래스 정보에서 애노테이션 정보를 꺼낸다.
    Annotation[] annos = clazz.getAnnotations();
    
    // 3) 애노테이션 이름을 출력한다.
    for (Annotation anno : annos) {
      System.out.println(anno.toString());
    }
  }

}