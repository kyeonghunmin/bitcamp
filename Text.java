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































*/
