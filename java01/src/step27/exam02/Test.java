// 애노테이션의 유지 정책 확인하기

package step27.exam02;

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
# 유지 정책 확인하기
- @Component 의 유지 정책이 SOURCE로 변경되었기 때문에
  .class 파일에 애노테이션 정보가 포함되지 않을 것이다.
- bin 폴더에 가서 Member.class 파일을 확인해보라!
*/