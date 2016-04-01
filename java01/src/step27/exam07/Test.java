package step27.exam07;

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
