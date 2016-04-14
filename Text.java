/*
step01 : 주석, 클래스, 진수의 표현, 값 표현.
step02 : 변수 선언, 배열.
step03 : String 도구, Object와 Reference.
step04 : 연산자, 형변환.
step05 : 조건문, 반복문.
step06 : 메서드 정의.
step07 : 클래스 변수 사용.
step08 : 클래스 구동 원리.
step09 : 사용자 정의 타입, 생성자, 인스턴스 초기화.
step10 : 캡슐화, 메서드 접근 레벨.
step11 : 생성자 오버로딩과 호출규칙.
step12 : 스태틱/인스턴스 변수, final 상수.
step13 : 랩퍼 클래스, 아규먼트, final.
step14 : 상속, super/this.
step15 : 다형적 변수
step16 : java.lang.Object, toString()/equals()/hashCode() 오버라이딩.
step17 : 키보드 입력(Scanner).
step18 : Generic.
step19 : 예외 처리(Exception).
step20 : 중첩 클래스.
step21 : Collection API.
step22 : 파일 입출력.
step23 : 인터페이스 개념.
step24 : 인터페이스 구현.
step25 : 클래스 정보 추출, Reflection API
step26 : Generic.
step27 : Annotation.
step28 : JDBC, statement.
step29 : DB 사용, 커넥션풀.
step30 : mybatis.
step31 : 정규표현식.
*/




/*
// 2.15 (월)
*부팅순서
﻿﻿BIOS가 CMOS 정보 읽음
부트로더 실행
OS 실행

* 리눅스
http://hamonikr.org/ -> [하모니카 2.1 MATE 로사 + Plank Dock 및 Numix] 다운로드
﻿부팅디스크 만들기
OS 설치



// 2.16 (화)
* 개발도구준비
1. 자바 개발도구 준비
- 설치
  - JAVA_HOME 환경 변수 설정 (JAVA_HOME : JDK가 설치된 디렉토리)

  - JDK(Java Development Kit)
    - Compiler (javac.exe)
    - Debugger (jdb.exe)
    - JVM (java.exe) - code를 해석해서 실행하는 프로그램 (interpreter, player, engine, vm...)
    - Profiler (javap.exe)
    - 문서생성기 (javadoc.exe)
    - 파일묶음 (jar.exe)

2. 명령어 작성기 설치
  - Simple (Atom, VS Code)
    - Syntax coloring (언어에 따라 다른 규칙 제공)   
  - IDE (Integrated Development Environment)
    - Syntax coloring
    - Compiler를 이용하여 컴파일 수행
    - Debugger를 이용하여 디버깅 수행

* 패키지 관리 s/w
sudo apt-get install 패키지명 (sudo : root 권한으로 실행하라)
- 1. apt get에서 [s/w Repository]로 조회 
  2. [s/w Repository]에서 다운로드
  3. PC에 설치

* JDK 설치
제어센터 -> 소프트웨어 관리자 -> JDK 설치(oracle-java8-installer)
cd JVM
cd java-8*
echo $JAVA_HOME
java -version
javac -version
cd $JAVA_HOME
cd bin
which javac

** .bashrc에 export JAVA_HOME=/usr/lib/jvm/java-8-oracle 추가
** 확인 : echo $JAVA_HOME, javac -version
   javac 위치 : which javac, readlink -f /usr/bin/javac
   설정 : export JAVA_HOME=/usr/lib/jvm/java-8-oracle
   재접속 후 : echo $JAVA_HOME

* C의 실행 이슈
- CPU, 운영체제의 종속
  => Write Once, Run Anywhere (Java 탄생)

* Java 컴파일과 실행
  - 자바소스 (.java) ==> 가상기계어 (.class) ==> JVM ==> 실행 (플랫폼에 따라 JVM을 통해 실행)
                [컴파일러 이용]           [인터프리터 이용]        
    (가상기계어 : 바이트코드라 부름)    
  - 특징 : OS에 독립적, 실행속도가 느림   
  - 서버는 다양한 플랫폼으로 이루어져있기 때문에 자바를 주로 사용

* Atom 실행 과정   
  - 자바 코딩후 저장
  - 터미널에서 javac 파일명.java (c언어는 gcc)
  - ls -l 로 class파일 생성된 것 확인
  - java 파일명 으로 실행

* JDK vs JRE   
  - JRE (Java Runtime Environment)
    - JVM (Bytecode[.class]를 실행)
    - Java에서 제공하는 명령어들을 포함
  - JDK (Java Development Kit)
    - JRE + 개발도구 (개발도구 : 컴파일러, 디버거 등)

* git 버전확인 : git --version 
  업데이트 : sudo apt-get install git

  git 폴더 생성       
  - cd => mkdir git => cd git(git 폴더로 이동)

* 프로젝트 공유 방법   
- 1. 파일공유
  - 네트워크 폴더 공유
  - FTP 서버 이용
  => 파일 변경관리 X, 파일 자동백업 X
    
- 2. 형상관리 s/w
  - 파일별 버전 관리 (바뀔때마다 버전이 올라감)
  - 이전 버전의 파일은 자동 백업
  - 변경된 부분만 조회 가능
  => 파일의 변경상태 관리 가능
  => 종류 : CVS -> SVN -> Git
      - CVS : 변경한 파일을 업로드할 때 파일 전체를 업로드한다. (네트워크 오버헤드 발생-> 느림)
      - SVN : 변경된 내용만 업로드한다. (CVS보다 빠름)
      - Git  : 저장소 전체를 복제한다. (저장소 : Repository) (관련사이트 : Github.com, bitbucket.org)

** Git에서 파일 받기        
github.com/eomjinyoung => java76 -> https(주소) 복사 후 git폴더에서 [git clone 복사내용]
** Git로 올릴 때는 [git commit] : 로컬 Repository에 저장 (변경내역을 로컬에 백업하는 개념)                             
                  [git push] : 서버로 올림 (백업된 변경내역을 서버로 보내 저장하는 개념)
                  [git pull] (서버에 변경내역을 다시 로컬로 받아오는 개념)

*프로젝트 준비
- workspace => java01 => bin, src 폴더 추가    
  - src : 소스파일 (ex : .java, .txt)    
  - bin : 바이트코드 (ex : .class)

- 컴파일 산출물을 별도의 폴더에 두기   
  - .java파일이 위치하는 폴더로 이동
  - javac -d ./bin ./src/Hello.java [javac -d [class파일을 저장할 공간] [java파일의 경로와 이름]
    ==> .java와 .class가 다른 폴더에 저장된다.

- 다른 디렉토리의 클래스파일(.class) 실행   
  - java -classpath ./bin Hello (./bin : 클래스파일 위치, Hello : 클래스명) (실행할때는 확장자명을 붙이지 않음)
    (-classpath : -cp)
  - 클래스파일 위치에서 실행시는 [java Hello]

- 강사님 파일 받는법 (받은 파일이 변경된 것을 다시 받을 때)   
  - 해당폴더에서 [git pull] (서버에 변경내역을 다시 로컬로 받아오는 개념)



// 2.17 (수)
* package : 컴파일시 컴파일된 클래스파일이 저장될 위치 설정 (관리 용이)

* Java 소스 및 클래스 관리 규칙   
  - 1. package 명령을 사용하여 분류를 설정
  - 2. 소스 파일을 패키지에 해당하는 디렉토리에 저장
  - 3. 클래스 파일도 패키지 디렉토리에 저장
  - ex) package dir1.dir2.dir3;

* javac -cp bin -d bin src/step04/exam09/Exam09.java   
  - Exam09가 다른 클래스를 사용해야할 경우에 -cp 사용
  - -cp bin : Exam09가 사용할 클래스가 저장된 장소 (상위 디렉토리[가장 상위 패키지가있는 곳]만 지정할 것)

* 패키지 소속 클래스 실행    
  - java -cp [기준 디렉토리] [패키지명+클래스명]    
  - ex) java -cp bin step04.exam09.Hello

*
컴파일 : javac -d [class파일을 저장할 공간] [java파일의 경로와 이름]   
  - 별도 클래스가 있을 경우 : javac -cp [기준 디렉토리] -d [class파일을 저장할 공간] [java파일의 경로와 이름]
  ex) javac -d bin src/Hello.java     
      javac -cp bin -d bin src/step04/exam09/Exam09.java

실행 : java -cp [기준 디렉토리] [클래스명]   
  - 별도 클래스가 있을 경우 : java -cp [기준 디렉토리] [패키지명+클래스명]
  ex) java -cp bin Hello     
      java -cp bin step04.exam09.Exam09

* main() 메소드   
  - program start entry (프로그램 시작점)
  - JVM이 자바 프로그램을 실행할 때 제일 먼저 실행하는 메소드
  - 문법 : public static main(String[] args) {}
  - main()이 없으면 JVM이 실행을 할 수 없음

* 컴파일시 참조하고있는 클래스가 있을 경우 그 해당 클래스부터 컴파일이 되어야 함

* JAR 파일 (Java Archive)   
  - .class 파일들의 묶음 (.properties, .xml, .txt 등의 묶음)
  - 확장자 : .jar
  - 사용법 : java -cp lib/aaa.jar Hello  // java -cp [JAR파일명까지 지정] [클래스명]
  - 여러개의 파일을 백업할 경우, 하나의 파일로 묶어서 저장하기 위해 사용
  - 컴파일 : javac -cp lib/aaa.jar Hello

* 웹
  test02 ===> test02.war ==> Tomcat ==> 실행     
     [gradle 이용]
- gradel 설치 : sudo apt-get install gradle (구버전이 설치됨) *gradle : 컴파일, 빌드 후 아카이브로 만들어줌
- sudo add-apt-repository ppa:cwchien/gradle (apt-get이 찾는 서버를 추가로 등록, 최신버전이 있는 서버임) 
  sudo apt-get update (서버 추가 등록 후 업데이트) 
  sudo apt-get install gradle  ==> 최신버전 설치 (gradle -v 로 버전 확인)

- workspace/test02에서 [gradle build] ==> war 파일 만들어짐

- tomcat 설치 : www.apache.org 접속 -> tomcat 클릭 -> tomcat 8.0 클릭 -> zip 다운로드
- 다운로드 받은 위치에서 [md5sum apache-tomcat-8.0.32.zip] => md5 비교(Hashcode)
- [unzip *.zip]으로 압축풀기
- 모드 변경 : chmod 755 *.sh (ls -al *.sh : .sh파일들 확인) (변경 후 파일명이 초록색으로 바뀜)
- tomcat 실행 : ./startup.sh
- tomcat 종료 : ./shutdown.sh
- .war파일 복사 : cp ~/workspace/test02/build/libs/*.war ~/devtools/apache-tomcat-8.0.32/webapps 
  (복사 후 실행하면 test02.war 폴더가 자동생성됨, 재실행 해야함)
- 톰켓 실행 후 웹브라우저에서 접속 : localhost:8080



// 2.18 (목)
* 자바 컴파일러 @ 옵션
  - javac @파일명(컴파일옵션정보) @파일명(소스파일정보)
  - 1. options.txt 파일 생성 (-d bin -cp ~~~)
  - 2. sources.txt. 생성 (find src -name "*.java" > sources.txt)
  - 3. javac @options.txt @sources.txt

* MySQL 설치   
  - hostname : 호스트네임 확인
  - sudo apt-get update
  - sudo apt-get upgrade
  - sudo apt-get install mysql-server

  - 접속
    - mysql -u root -p 후에 암호입력       
    - show variables like "collation_database"; 로 latin1 확인 (utf8을 설정하기 위함)
    - show variables like "%character%";
    - show variables like "%collation%";

    - 파일시스템 - etc / mysql 에서 my.cnf 관리자로 열기
    - mysqld 밑에 붙여넣기
      1. init_connect='SET collation_connection = utf8_general_ci'  
      2. init_connect='SET NAMES utf8'  
      3. character-set-server=utf8  
      4. collation-server=utf8_general_ci  
      5. skip-character-set-client-handshake
        - sudo /etc/init.d/mysql stop
        - sudo /etc/init.d/mysql start (MySQL 재시작)

        - 위에 show 과정으로 utf-8로 바뀐것 다시 확인
        - 관련사이트 : http://kosalads.blogspot.com/2013/03/mysql-55-how-to-change-mysql-default.html

    - 데이터베이스 생성 (실습용)
        - 실습용 사용자 추가
        - 사용자가 사용할 DB의 권한 지정

        - create database java80db character set utf8 collate utf8_general_ci; (DB 생성)
        - show databases; (생성된 DB 확인)
        - create user 'java80'@'localhost' identified by '1111'; (localhost 사용자가 1111로 접속가능)
        - grant all on java80db.* to 'java80'; (권한지정)
        - show variables like 'c%'; (utf-8 확인)

    - 테이블 생성       
        - mysql -u java80 -p (java80 사용자로 sql 접속)
        - use java80db; (java80db로 들어감)
        - show tables; (테이블 확인)    
      * gradle clean : gradle 지우고 다시 빌드할 경우에 사용 (gradle build로 다시 생성)

* Application Architecture 역사   
  - 1세대 (MainFrame[서버] - Terminal[모니터+키보드+연결장치] 시대)
    - 모든 프로그램은 Mainframe에 설치되고, 실행됨 (사용언어 : cobol, fortran, c)       
    - 프로그램 변경 및 배포가 용이함
    - 서버 H/W 확장이 어려움 (사용자 증가에 효과적 대비가 어려움)

  - 2세대 (워크스테이션, PC 시대)
    - 소형화가 이루어짐
    - 자체 CPU, HDD를 가진 PC가 등장 (PC에서 자체적으로 프로그램 실행이 가능해짐)
    - Mainframe이 혼자 하던 작업을 서버와 클라이언트로 나누어 처리함
    - Server : 데이터 처리 (Database 운영)
    - Client : UI, Business 로직 처리 (Application 실행)
    - 사용언어 : VC++, Delphi, PowerBuilder, VB (단순한 스크립트로 간단하게 업무용 App 생성[4GL])
    - 특징 : 서버에 부담을 덜 줌, 사용자 증가에 확장이 용이함
    - 단점 : 프로그램 배치가 번거로움 (프로그램 변경시 각 PC마다 재설치 해야함)
             외부에서 DBMS로 직접 접근이 가능 (보안에 취약)

  -3세대 (Web App 시대)
    - 인터넷 확산, 비즈니스의 글로벌화 가속 -> 경쟁 가속 -> 제품의 라이프사이클이 짧아짐 -> 
      기업의 조직 및 업무프로세스가 자주 변경됨 -> 업무 프로그램이 자주 변경되어야 하기 때문에 3세대 도래
    - Web Server[서버] <--> Web browser[클라이언트]
    - 특징 : Web을 기반으로 App 실행
             서버에서 Business 로직 처리
             클라이언트에서 UI 처리
             프로그램 변경 및 배치가 쉬움
             H/W 확장이 쉬움 (소형 컴퓨터를 추가하여 확장)
             DBMS가 외부에 노출되지 않음 (보안에 강함)
        * 서버 = Web Browser -> Web Server -> Application Server(Business 처리) -> DBMS(Data 처리)
          Application Server의 언어 : 자바, 자바스크립트, 파이썬 등
    - Web Browser는 서버에서 HTML을 받아 parsing, display 작업을 수행함 (Rendering) (해당엔진 : Webkit)



// 2.19 (금)
* HTML (Hyper Text Markup Language)
  - <html> (시작 태그)
             (컨텐츠)     
    </html> (끝 태그)     ( 3개를 합쳐 엘리먼트[태그]라고 부름)

  - <h1> 내용 </h1> : 제목 설정시 사용 (markup = tag라고 부름)
    - 내용 : Data
    - <h1> ~ </h1> : meta data (Data를 설명하는 데이터)

  - <p> ~ </p> : 문단 구분

* NodeJS   
  - 설치       
    - 다운로드 후 /usr/local에 압축을 품

    - 파일탐색기 -> .bashrc에서            
      export NODEJS_HOME=~/devtools/node-v5.6.0-linux-x86            
      export PATH=${NODEJS_HOME}/bin:${PATH}  추가 (순서가 바뀌면 안됨)

    - 터미널 재시작 후 node -v, npm -v 로 버전 확인
      (안될경우, echo $NODEJS_HOME, echo $PATH로 경로 확인
        - echo $NODEJS_HOME : /home/bitcamp/devtools/node-v5.6.0-linux-x86,
          echo $PATH : /home/bitcamp/devtools/node-v5.6.0-linux-x86/bin:  )

    - hello.js 파일을 만든 후 터미널에서 node hello.js 로 실행가능
      * 브라우저는 HTML없이 자바스크립트를 실행할 수 없지만, NodeJS를 사용하면 바로 실행 가능

    - npm (Node Package Manager) : nodejs가 사용할 패키지를 관리

    - devtools -> node~에서 sudo cp -rf no* /usr/local/ 로 폴더 복사
    - sudo ln -s /usr/local/node-v5.6.0-linux-x86/bin/node /usr/bin/node (링크 설정 부분)
    - sudo ln -s /usr/local/node-v5.6.0-linux-x86/bin/npm /usr/bin/npm (링크 설정 부분)
    - ls -al /usr/bin/node, ls -al /usr/bin/npm 으로 확인

    - sudo npm install -g phonegap 으로 폰갭 설치 (-g : 모든 사용자가 사용할 수 있도록 설치)
    - sudo npm install -g cordova 로 코르도바 설치

    - sudo npm cache clean -f
      sudo npm install -g n
      sudo n stable

* Hybrid App 만들기   
  - 1. cordova project 생성
    - http://cordova.apache.org/ -> get started
      >cordova create test04 후 test04로 이동
       www 폴더에 App 작성
      >cordova platform add browser
      >cordova run browser

      >sudo npm install -g phonegap (phonegap -v : 5.5.2)
      >phonegap serve -> 폰으로 확인 (폰갭에 해당하는 폴더에서 실행해야함)



// 2.22 (월)
*
class : function들을 분류한 것 (function = procedure = method)
package = namespace

argument : 명령을 내릴 때 넘겨주는 값
parameter : 명령을 내리기 위해 필요한 변수

네이버 d2 코딩 폰트설정하기
  - 아톰 -> edit -> preference에서 font family에 D2Coding 삽입

즐겨찾기 추가
  - java api document
  - java spec



// 2.23 (화)
* 줄바꿈
  - windows : 0d0a (2byte)
    (0d : carrage return, 0a : linefeed)
  - unix/linux : 0a (1byte)

예)
4142430a616263
unix : ABC     
       abc
windows : ABCㅁabc
(0a는 0d가 빠졌기 때문에 엔터가 아닌 일반 문자로 취급한다)

예)4142430d0a616263
unix : ABCㅁ     
       abc
windows : ABC      
          abc

*
reusable (재사용성) : refactoring(나누고, 분류)해야 한다.              
                      가독성이 좋다. (성능은 손해)
performance (성능) : 성능을 높이려면 code를 optimizing(최적화)해야 한다.                                
                     읽기가 난해하다.
==> 최근에는 재사용성에 무게를 둔다. (성능은 하드웨어 업그레이드로 해결)



// 2.24 (수)
* 터미널에서 호스트네임 안보이게 만드는 방법
1. 파일시스템 
2. etc -bash.bashrc
3. PS1='${debian_chroot:+($debian_chroot)}\[\033[01;32m\]\u@\h\[\033[01;34m\] \w \$\ [\033[00m\] '    <--- 이 부분 복사
4. 홈 -> .bashrc 를 아톰으로 열고 export PS1='\[\033[01;34m\] \w \$\[\033[00m\] '   <-- 맨 밑에 추가



// 2.25(목)
* 후위 연산자 (step04.Exam11)
i = 10;
i = i++;    // 이 전체를 명령문(statement)이라고 한다.

1) i++ 자리에 i 값인 10을 놓는다.
2) i 변수의 값을 11로 증가시킨다.
3) l-value 변수인 i에 미리 놓여져 있던 10을 저장한다.
   즉, i 변수의 값은 다시 10이 된다.

- 할당 연산자를 기준으로 왼쪽 : l-value. 변수 (메모리)
  할당 연산자를 기준으로 왼쪽 : r-value. 변수, 값 (식, expression)

- 할당 연산자는 r-value를 모두 실행한 후에 수행한다.




// 2.26(금)
* 폰트
1) raster (bitmap)
- 픽셀로 표현
- 크기를 늘리면 계단 현상 발생
- 복사해서 출력하기 때문에 속도가 빠르다
- 예) 그림파일들 (.bmp, .jpeg, .gif 등)

2) vertor (truetype)
- 선 그리기 명령으로 표현
- 크기를 변경해도 깨끗하게 출력
- 출력할 때마다 계산해야 하기 때문에 속도가 느리다
- 예) 클립아트, CAD 이미지 등


// 8, 10, 12, 15
// 17, 19



// 2.29(월)
*** git 설정하는 법
1) github에서 Repository 만들기
2) git init
3) git add -A
4) git commit -m "first commit"
5) git push origin master



// 3.2(수)
* 클래스 로딩
- 외부 저장 장치에 저장된 바이트코드를 JVM이 관리하는 메모리(RAM)로 로딩하는 것.
- 프로그램 실행원리
1) HDD -> RAM 명령어 로딩
2) RAM -> CPU 적재

* JVM 메모리 관리
1) Method Area
    - 클래스가 로딩되는 영역이다.
2) Heap
    - 인스턴스가 생성되는 영역이다.
3) Stack
    - 메서드를 호출할 때마다 그 메서드에 선언된 로컬 변수를 준비하는 영역이다.
4) Constant pool
    -

* 클래스 파일 실행 과정
1) HDD -> Method Area로 .class 파일을 로딩한다. (이때, Main method 호출)
2) 유효 여부 검증 (.class가 제대로 컴파일된 파일인지 검사)
    - 바이트 코드 유효 여부 검사
3) 준비
    - 클래스 변수 준비
4) 실행
    - main() 실행

*
1) Method Area로 .class 파일을 로딩.
2) Method Area에서 Main method를 호출.
3) Stack에서 Main method가 사용할 메모리를 준비.
4) 다른 클래스가 필요하면 Method Area에 해당 클래스가 로딩된다.
    - main에서 다른 클래스를 필요로 할때 로딩이 이루어진다.
    - 미리 로딩되지 않는다.
    - 새 클래스가 로딩될 때 그 안에 있는 클래스 변수가 준비된다.
5) 준비를 마치면 main()을 다시 실행한다.
6) 모든 명령을 실행한 후 stack에 준비된 로컬 변수들의 메모리를 제거한다.


// 3.7(월)
Value Object (vo)
Data Transfer Object (DTO)



// 3.8(화)
* jar 파일 만들기 (클래스파일을 사용)
jar cvf calc.jar step14/Calculator.class

* jar 파일에 있는 클래스를 사용하기
javac -cp libs/calc.jar -d bin -sourcepath src src/step14/Exam01.java
java -cp bin:libs/calc.jar step14.Exam01

*
클래스 정의 ("추상화")
1) 상속 -> 코드 재사용성을 증가시킴.

2) 캡슐화 -> 무효한 데이터가 입력되는 것을 막아 추상화 개념을 보존하는 것.
- public, protected, (default), private

3) 다형성 -> 유연한 코드를 작성할 수 있게 도와줌.
- overloading, overriding, 다형적 변수



// 3.9(수)
*
Class
  1. 변수
    - 스태틱
    - 인스턴스

  2. 메서드
    - 스태틱
    - 인스턴스

=> 클래스 정의 (추상화)
   - 메서드를 묶음
   - 사용자 정의 데이터 타입

=> 생성자
   - super(), 인스턴스 블록(스태틱 블록)

=> 캡슐화
   - 추상화를 유지시키는 문법 (유효한 값을 유지시키는 문법)
   - public, private, (default), protected

=> 재사용
   상속
     - Specialization (상위->하위)
     - Generalization (하위->상위) --> Abstract (추상클래스)
     - 다형성
       -> Overriding, Overloading, 다형적 변수
     - super, this


*
- UML (Unified Modeling Language)
1) Class Diagram : 클래스 간의 관계를 표현
   - 클래스 표현
     - 클래스는 사각형으로 표현
     - 변수명:타입 // (자바와 순서가 반대)
     - 메서드명(파라미터명:타입):리턴타입
   - 관계
     - 1) 상속
        Calculator  (수퍼/부모 클래스)
            ^
            |
        Calculator2 (서브/자식 클래스) (위쪽 화살표로 표현)
        // class CalculatorPlus extends Calculator {}

     - 2) Association (연관) - 지속적인 관계
          Test --> Calculator (화살표로 표현)
          // 인스턴스 변수나 스태틱 변수에 담아둔다.
          // class Test {
               Calculator p;
             }

     - 3) Aggregation (집합) - 포함관계
          Computer ◇----> Mouse
          // class Computer {     // Association과 같다.
               Mouse p;
             }
          부모와 자식의 생명주기(Lifecycle)가 일치하지 않음

     - 4) Composition (합성) - 포함관계
          PhoneMainboard ◆----> CPU
          (Container)          (Containee)
          // class PhoneMainboard {
               CPU p;
             }
          부모와 자식의 생명주기(Lifecycle)가 일치함

     - 5) Dependency (의존) - 특정 메서드에서만 사용
          학생 - - - -> 강사  (점선으로 표현)
          // class 학생 {
               void m() {
               강사 p = new 강사();
               }
             }

2) Sequence Diagram : 시간 흐름에 따른 객체 간의 상호작용을 표현
3) Collaborator Diagram : 공간에 객체를 배치하여 참여 객체의 관계를 표현
4) State Diagram : 객체 상태 변화를 표현
5) Use Case Diagram : 사용자(Actor)의 요구사항
* 관련책 - UML, 실전에서는 이것만 쓴다



// 3.10(목)
* Refactoring
주석을 달아야 하는 로직(특정 작업을 수행하는 명령어)을 메서드로 분리
=> 코드 읽기를 쉽게하기 위해 (유지보수가 용이한 구조로 개편)



// 3.11(금)
* 기술부채
- 동작하기 위한 코드를 작성한 후 Refactoring을 통한 구조 조정을 하지않고
  새로운 기술이 계속 추가된 상태


* dependency (의존)
ProjectApp ---> MemberController ---> Scanner
- ProectApp은 MemberController에 의존한다. (의존객체)
  MemberController는 Scanner에 의존한다. (의존객체)

DI (Dependency Injection) - 의존객체 주입



// 3.15(화)
* Generic
- 타입 안정성 강화 (컴파일 오류 최소화)
- 디버깅이 쉬움



// 3.16(수)
Object -> Throwable -> Error, Exception(RuntimeException)



// 3.18(금)
Object -> hashCode() : 내용에 상관없이 무조건 인스턴스가 다르면 다른 값 리턴



// 3.22(화)
* Streaming (step22/exam02/Test01)
- 일관된 Data 입출력을 위해 만든 API
- H/W에 상관없이 모두 다(프린터, 스캐너 등) I/O의 대상으로 본다.


* 면접 질문
자바란?
- 한 번 작성한 코드를 플랫폼에 상관없이 실행할 수 있음
- 그 이유로 서버에서 많이 사용
왜 자바를 쓰는가?
- 객체 중심적
- 대형 프로젝트에서 코드를 좀 더 효율적으로 관리할 수 있음
개발자란?
- 사용자 중심적으로
- 컴퓨터란 도구를 활용하여 문제해결을 도와주는 역할
컴파일러란?
- JVM이 이해할 수 있는 명령어(바이트 코드)로 변환해주는 것
- 다른언어 : cpu가 이해할 수 있는 언어로 변환해주는 역할

extends&implements
-

추상&인터페이스
- 추상 :
- 인터페이스 : 호출 규칙을 정의

오버라이딩&오버로딩
- 오버라이딩 : 메서드를 상속받아 재정의하는 것
- 오버로딩 : 같은 이름을 갖는 생성자를 만들어 일관성을 유지하는 것

JavaScript에서 onload와 ready에 대한 설명

MVC model1 & model2 비교

Spring 장단점


* Offset
- 메모리 내에서 어느 지점에서부터의 상대적 주소를 의미한다.


*
유니코드 : 0xAC00 (가)
           1010_1100_0000_0000
           <UTF-8로 변환>
           UTF-8 : 1110xxxx_10xxxxxx_10xxxxxx (설계 공식)
                   x 부분에 나머지 값을 채운다.
                   11101010_10110000_10000000
                   ea_b0_80


* Decorator 패턴
- 기능을 선택적으로 추가/삭제할 수 있게 한다.
- 데코레이터는 스스로 기능을 수행하지는 않는다.

- Java I/O API
  => Decorator 패턴이 적용되어 있다.

- 생성자에서 자신에게 상속해준 클래스를 파라미터로 받는다면 데코레이터이다.
  (OutputStream, InputStream)



// 3.23 (수)
OutputStream : Abstract (추상 클래스), 직접 사용하지 않는 클래스이다.
InputStream  : Abstract (추상 클래스), 직접 사용하지 않는 클래스이다.

write() : 맨 끝 1바이트만 출력한다.
read()  : 맨 끝 1바이트만 읽는다.



// 3.24 (목)
* 인터페이스
- caller와 callee의 호출 규칙을 정의하는 것.
=> 일관된 구현(클래스 정의)을 할 수 있게 해준다.
=> 일관된 규칙으로 분리 개발이 가능하다.
=> 규칙만 맞다면 기존 기능을 다른 기능으로 대체하기가 쉽다.



// 3.25 (금)
* 이클립스 설치
- properties : java로 설정
- window - show view - navigator 추가
- window - preference
  Appearence - color ~ : 폰트 설정
  Editors - Text editors :tab width(2)
                          insert spaces 체크
                          show print margin(80) 체크
  workspace - utf8 확인
  java - code style - formatter : new => bitcamp
                                  space only, 2, 2 설정
  compiler : 1.8버전 확인
  installed jre : location 부분 확인
  web : css, html, jsp file 부분 utf8 확인


* gradle
터미널 -> java01로 이동 -> [gradle -v] 로 버전확인
java01에 build.gradle 파일 만들기 -> 밑에 내용 입력 ->
터미널 -> java01에서 [gradle eclipse], project01에 build.gradle 복사 후 [gradle eclipse]
******************************************
//Gradle 설정 파일(build.gradle)

// 1) 사용할 gradle 플러그인 가져오기
apply plugin: 'java'
apply plugin: 'eclipse'

// 2) 자바 소스 폴더 지정
// => 지정하지 않으면 다음 구조로 간주한다.
//   src/
//     main/
//       java/
//       resources/
//     test/
//       java/
//       resources/
// => src 폴더에 자바 소스 파일을 바로 두도록 설정을 변경한다.
sourceSets {
    main {
        java {
            srcDir 'src'
        }
        resources {
            srcDir 'src'
        }
    }
}
****************************************



// 4.4 (월)
* DBMS (DataBase Management System)
  - Data I/O 처리 담당
  - Data 저장 규칙에 따라 유효성 검사
  - 프로그래밍 언어에 독립적
  - SQL 이라는 일관된 명령 문법
  - library(X) => 별도로 실행하는 소프트웨어
  - 여러 요청을 동시에 처리할 수 있음
  - 예) Oracle, MS-SQL, MySQL, , MariaDB, DB2(IBM), Tibero(Tmax), Altibase...

* 직접 DBMS에 SQL 문을 보내는 code를 작성할 수 없다.
  - 각 제조사의 통신 규칙이 비공개이기 때문.
  - 각 제조사가 공급해주는 API를 "Vendor API" 라고 부른다.
  - SQL (Structured Query Language) : DBMS에 명령을 내리는 표준 문법

* Vendor API
  - 벤더마다 API 명세가 다르다. => DBMS 별로 작성해야하는 단점. (유지보수 힘듬)
    => ODBC(Open DataBase Connectivity) 등장 : API 명세를 통일함.  

<각 호출(call) 관계>
- JavaApp -> JDBC Driver -> 각 Vendor ODBC Driver -> 각 Vendor API(c/c++) -> DBMS

* JDBC API(Java DataBase Connectivity) 명세
Type1 : ODBC C/C++ API 호출한다.
        JRE에 포함되어 있다.
        속도가 느리다.
        ODBC Driver가 있다면 접근 가능하다.
        "ODBC-JDBC" Bridge 드라이버라고 부른다.

Type2 : 중간 ODBC 구간을 거치지 않고 바로 각 Vendor API(Native API)를 호출한다.
        JRE에 포함되어 있지 않다.
        DBMS 별로 다운로드를 받아야 한다.
        속도가 빠르다.
        
Type4 : 바로 DBMS를 호출한다. (DBMS와 직접 접속)
        pure Java라고 부른다. (중간에 각 Vendor API를 거치지 않기 때문)
        DBMS 별로 다운로드가 필요하다.
        현업에서 가장 많이 사용하는 타입이다.
        

* DBMS 설치
1) www.mysql.com -> [다운로드] -> APT Repository -> Ubuntu/Debian 다운로드 -> 설치
2) www.mysql.com -> MySQL Connectors 클릭 -> Connector/J 클릭 -> 
   Platform independent -> ZIP 파일 다운로드 -> 압축 해제 -> xxx.jar 복사 ->
   workspace/java01/libs에 붙여넣기 -> eclipse에서 확인(F5)
3) gradle 방식
   mvnrepository.com 접속 -> mysql jdbc 검색 -> 
   build.gradle 파일에 dependencies 부분에 추가 ('mysql:mysql-connector-java:5.1.38')
   -> 터미널에서 workspace/java01에서 gradle eclipse (이클립스 관련 설정파일 재설정) 
   


// 4.5 (화)
* Driver --> Connection --> Statement --> ResultSet
       (준비)         (준비)        (준비)
       
com.mysql.jdbc.Driver --> com.mysql.jdbc.ConnectionImpl --> com.mysql.jdbc.StatementImpl --> com.mysql.jdbc.ResultSetImpl
                    (리턴)                            (리턴)                           (리턴)



// 4.7 (목)
* DB 연결
- 서버와 통신 시작
- User 존재 및 유효성 검증 (Autentication, 인증)
- User 권한 부여 (Authorization, 권한)


* Multi-User 환경에서 DB 커넥션
- 서버 <-> 클라이언트 관계

ProjectApp --> XxxController --> XxxDao --> Connection --> DBMS
         list()         selectList()  statement
         add()          insert()      preparedstatement
         delete()       delete()

- XxxDao 까지는 여러 사용자가 동시에 처리가 가능하다.
- Connection은 하나이기 때문에 동시에 처리하지 못하고 순차적으로 처리해야 한다.

* 커넥션 공유시 문제점
- SQL 실행을 순차적으로 한다. (Multi-Tasking 방해)
- SQL 실행중에 문제가 발생하여 커넥션을 닫거나 롤백하면
  그 커넥션에 소속된 모든 Statement에 영향을 끼친다.
  => XxxDao 까지 처리된 여러 명령들도 영향을 받게 된다.
  => 결론 : Multi-Tasking 환경에서는 Connection을 동시에 공유해서 사용하지 않는다.
     해결 : 하나의 작업 당 하나의 Connection을 사용한다.
==> Connection Pool에서 Connection을 관리하여 배분해준다.
    - 이 때, 하나의 작업 당 하나의 Connection을 사용한다.
    - Connection을 넘겨주고, Pool에서 다시 리턴받는다. => 재사용이 가능해진다.


* Mybatis (SQL Mapper) -> Persistence FrameWork
- BoardDao에서 JDBC코드와 SQL코드를 분리하고, BoardDao는 그것들을 사용하는 용도로 쓴다.
- JDBC코드 => sqlSession
- SQL코드  => SQL
BoardDao --(사용)--> sqlSession --(사용)--> SQL

1) Java 코드에서 SQL 분리 -> SQL 관리가 쉽다
2) JDBC 코드를 캡슐화 -> 단순하고 반복적인 코드를 감춘다. (자동화 시킴)

- Persistence FrameWork
  => Data (지속성) 처리
  1) SQL Mapper
    Java Code <=> FrameWork <=> SQL --(실행)--> DBMS
    (자바 코드와 SQL을 연결해주는 역할), (JDBC와 SQL문을 처리)
    JDBC와 SQL은 개발자가 작성
    DBMS에 종속적이다. (DBMS 마다 질의어가 조금씩 다름)
    DBMS예 최적화된 SQL문을 만들 수 있기 때문에 우수한 성능을 구현할 수 있다.
    ex) mybatis

  2) OR Mapper(객체-관계 맵퍼)
    Java Code --(객체 질의어)--> FrameWork --(생성)--> SQL --(실행)--> DBMS
    SQL문을 개발자가 작성하지 않고, FrameWork전용 질의 문법을 사용하여 실행한다.
    장점 : DBMS에 독립적이다.
    ex) Hibernate, TopLink



* Abstract Factory 패턴
- 공통 기능을 묶어 Factory 추상 클래스를 만들어 사용하는 것.



// 4.8 (금)
* HTML5 : 비디오 플레이 등의 작업을 tag를 통해 수행하도록 html명세에 포함했다.
          sementic 웹

* step30/exam02
1) insert MEMBERS(...)
   values(...)
   를 DBMS로 보낸다.
2) DBMS에서 Temp(임시 테이블)에 임시보관을 한다.
3) commit을 통해 Temp에서 MEMBERS 테이블로 적용한다.
   (Temp 테이블에서 Transaction 작업이 수행된다.)

** JDBC 프로그래밍시 auto commit으로 설정되어 있으면
   insert, update, delete 후 자동 commit이 된다.
   => auto commit을 해제하면 transaction 작업을 수행할 수 있게 된다.
   
* Transaction
ex) 계좌이체 업무
    1) 자신의 잔액 변경
    2) 타인의 잔액 변경
    3) + 금액 입력
    4) - 금액 입력
    ==> 4가지의 업무를 묶어 하나의 작업으로 다루는 것
        (이체 업무는 4단계가 모두 성공했을 때만 유효하다)
        -> commit : 모두 성공했을 경우
        -> rollback : 한 개라도 실패했을 경우



// 4.12(화)
* regex 설치
// http://www.getproxy.jp/kr/korea
// 아이피, 포트번호 복사
// window --> preference --> general --> network connections --> manual
// --> http 에 아이피, 포트번호 붙여넣기
// help --> eclipse marketplace에서 regex 설



// 4.14 (목)
* Dynamic SQL
 - if
 - choose (when, otherwise)
 - trim (where, set)
 - foreach
 ==> SQL문에서 사용 가능.
 
 
* Hyper-Text Markup Language (HTML)
 - FTP (File Transfer Protocol) 문제점?
   1) 논문이 참조하는 다른 논문을 다운로드가 불편
      - 서버 정보가 없기 때문.
      - 직접 서버에 접속해서 다운로드해야 하기 때문.

 - 해결방안?
   1) 참조하는 논문의 연결 정보를 포함. -> Hyper-Text 고안.
      -> 부가정보(연결정보)를 포함할 수 있는 특별한 문법을 추가하게 됨.
      (부가정보 : metadata)
      (markup : metadata를 표현하는 문법)
      ==> Hyper-Text Markup Language (HTML)

  - HTML을 FTP보다 쉽게 다운로드 할 수 있는 방법을 고안
    - 규칙을 정의하게 됨 => HTTP를 정의 (Hyper-Text Transfer Protocol)
    - HTTP Server (Web Server) <-> HTTP Client (Web Browser)

  - HTML의 목표
    1) 연결정보를 문서 내에 포함. ex) a
    2) 콘텐츠의 모양을 제어. ex) i, b, hr, div
    3) 콘텐츠의 구조 설명. ex) h1, h2, p, address

  - XML (Extensible Markup Language)
    목표 : 데이터를 구조화 시키는데 초점을 맞춤. (데이터 정의/추출이 쉬워짐)
           => 이기종 S/W 끼리 데이터 교환이 용이해진다.


* Web의 진화
 1) 문서를 연결하는데 초점 -> 정보 수집이 쉬워짐
 2) Nescape GUI 웹 브라우저 등장 -> 그림 출력 가능 -> 홍보 페이지(마케팅용)로 사용 -> 홈페이지 등장
    Homepage + Program ==> 고객과 Interaction이 가능해짐 (게시판, 방명록, 의뢰 등..)
    ==> 마케팅 뿐만 아니라 온라인 비즈니스가 시작됨
 3) 웹의 대중화 -> 업무용 S/W 개발할 때,
                   기존 C, Delphi에서 Java, HTML 등의 웹 기술로 바뀜.
    [웹의 필요성]
    신자유주의 -> 글로벌화 가속 -> 무한경쟁 -> 제품 주기 가속 -> 업무 프로세스 변경이 자주 발생































*/
