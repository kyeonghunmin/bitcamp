// 실행 중에 애노테이션 정보 추출하기

package step27.exam03;

import java.lang.annotation.Annotation;

public class Test {

  public static void main(String[] args) {
    
    Class<?> clazz = Member.class;
    
    Annotation[] annos = clazz.getAnnotations();
    
    for (Annotation anno : annos) {
      System.out.println(anno.toString());
    }
  }

}
/*
# Member 클래스에 첨부된 애노테이션 가져오기 
- 단 해당 애노테이션의 유지 정책이 RUNTIME 이어야 가능하다.
- 리플랙션 API를 사용하여 가져올 수 있다.
*/