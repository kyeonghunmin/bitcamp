// 주제: 클래스에서 특정 애노테이셔만 추출하기
package step27.exam03;

public class Test2 {

  public static void main(String[] args) {
    Class<?> clazz = Member.class;
    
    //=> 꺼내고 싶은 애노테이션의 타입을 주면,
    // 그 애노테이션의 정보를 리턴한다.
    Component anno = clazz.getAnnotation(Component.class);
    
    //=> 애노테이션에서 속성 값을 꺼낸다.
    System.out.println(anno.value());
    
  }

}



