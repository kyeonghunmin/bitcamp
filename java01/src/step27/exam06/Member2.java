// 여러 개의 속성 값을 설정하기
package step27.exam06;

//=> 여러 개의 속성 값을 지정할 때는 value라 할 지라도 
//   이름을 생략할 수 없다.
//@Component("오호라", title="title...", no=333) // 컴파일 오류!
@Component(value="오호라", title="title...", no=333)
public class Member2 {

}