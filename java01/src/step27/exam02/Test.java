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
