/* 주제 : DBMS 함수
*/

drop table test01;
create table test01(
  tno int primary key,
  email varchar(20) unique not null,
  fst_nm varchar(20),
  lst_nm varchar(20),
  age int,
  cre_dt date
);


1. 날짜 및 시간 함수
=> now() : 날짜 및 시간

insert into test01 values(1,'aa@test.com','aa','ok',18,now());
insert into test01 values(2,'bb@test.com','bb','ok',19,curdate());
insert into test01 values(3,'cc@test.com','cc','ok',20,'2016-2-1');
insert into test01 values(4,'dd@test.com','dd','ok',21,'2016-3-15');
insert into test01 values(5,'ee@test.com','ee','ok',22,'2016-3-29');
insert into test01 values(6,'ff@test.com','ff','ok',23,'2016-4-2');
insert into test01 values(7,'gg@test.com','gg','ok',24,'2016-4-16');
insert into test01 values(8,'hh@test.com','hh','ok',25,'2016-4-27');
insert into test01 values(9,'ii@test.com','ii','ok',26,'2016-5-3');
insert into test01 values(10,'jj@test.com','jj','ok',27,'2016-5-17');
insert into test01 values(11,'kk@test.com',null,'ok',27,'2016-5-17');
insert into test01 values(12,'ll@test.com','ll',null,27,'2016-5-17');
insert into test01 values(13,'mm@test.com','mm','ok',null,'2016-5-17');
insert into test01 values(14,'ma@test.com','ma','ok',null,'2016-6-17');
insert into test01 values(15,'mb@test.com','mb','ok',null,'2016-7-17');
insert into test01 values(16,'mc@test.com','mc','ok',null,'2016-8-17');
insert into test01 values(17,'mabc@test.com','mabc','ok',null,'2016-9-17');
insert into test01 values(18,'mbac@test.com','mbac','ok',null,'2016-10-17');


2. 연산자
select * from test01 where tno > 3;
select * from test01 where tno >= 3;
select * from test01 where tno < 3;
select * from test01 where tno <= 3;
select * from test01 where tno = 3;
select * from test01 where tno > 3 and tno < 7;
select * from test01 where tno between 3 and 7; /* 3이랑 7을 포함한다. */
select * from test01 where tno < 3 or tno > 7;
select * from test01 where tno in (2,4,6,8);
select * from test01 where fst_nm is null;
select * from test01 where fst_nm=null; /* null은 is를 써야한다. */
select * from test01 where fst_nm is not null; /* null이 아닌 것만 찾는다. */
select * from test01 where tno not in (2,4,6,8);
select * from test01 where fst_nm='hh';
select * from test01 where email like '%test.com'; /* % : 0개 이상의 문자 */
select * from test01 where email like 'hh%';
select * from test01 where email like '%@test%'; /* 전체검색으로 인해 속도가 느리다. */
select * from test01 where fst_nm like 'm_'; /* _ : 1개의 문자 */
select * from test01 where fst_nm like 'm__c';
select * from test01 where cre_dt >= '2016-5-1' and cre_dt < '2016-7-1';


3. 문자열 함수
select tno, fst_nm, lst_nm from test01;
select tno, concat(lst_nm,fst_nm) from test01;
select tno, concat_ws(' ',lst_nm,fst_nm,email) from test01;
select tno, char_length(email) from test01;
select tno, substr(email,1,5) from test01;





























