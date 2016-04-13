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
/*
# 애노테이션이란?
- 클래스 파일에 첨부하는 주석이다.
- 컴파일러나 JVM이 참고할 때 사용한다.

# 애노테이션 유지 정책(RetentionPolicy)
1) SOURCE
  => 소스 파일에서만 유지된다.
  => 컴파일할 때 제거된다.
  => 즉 .class 파일에 존재하지 않는다.
2) CLASS (기본 설정)
  => 컴파일 한 후에 .class 파일에 포함된다.
  => JVM이 클래스를 로딩할 때 애노테이션 정보를 로딩하지 않는다.
3) RUNTIME
  => 컴파일 한 후에 .class 파일에 포함된다.
  => JVM이 클래스를 로딩할 때 애노테이션 정보도 함께 로딩한다.
  => 실행 중에 정보를 추출할 수 있다.
*/