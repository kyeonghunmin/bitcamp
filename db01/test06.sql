주제 : 테이블 변경하기 (작업 후 확인 : desc test01;)

drop table test01;

create table test01(
  tno int,
  name char(5)
);

1. 컬럼 추가하기
alter table test01
  add column tel varchar(20);

  
2. 컬럼 변경하기
alter table test01
  modify column name varchar(50);
  

3. 컬럼 삭제하기
alter table test01
  drop column tel;


4. 컬럼에 옵션 추가하기
=> 컬럼의 전체 설정을 다시 해야 한다.
=> 옵션만 추가 삭제하는 방법은 없다.
alter table test01
  modify column name varchar(50) not null;
  
  
5. 컬럼의 이름 바꾸기
=> modify랑 같다.
=> 단, 컬럼 이름을 바꿀 수 있다. (modify는 컬럼 이름 변경이 불가능하다.)
alter table test01
  change column name title varchar(20);
  





















