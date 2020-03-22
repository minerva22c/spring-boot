# spring-boot

1. (로컬)source upload

　　git init                                     =>  .git 디렉토리생성(최초 1회만)

　　git add .                                     => 현재 디렉토리의 모든 파일을 git으로 add (stage에 임시반영)
  
　　git status                                    => git에 반영하려고 하는 파일이 모두 포함되었는지 확인
                                                         원치 않는 파일이 포함되어 있는 경우 "git reset"으로 제외
                                                         
　　git commit -m "first commit"                                         => add된 대상을 로컬 저장소에 저장. -m 은 메시지 지정
  
　　git remote add origin https://github.com/minerva22c/spring-boot.git  => 원격저장소를 origin으로 지정 (최초에 1회 만)
  
　　git push origin master                                               =>commit 된 대상을 원격 저장소에 저장
  
  

2. (서버)source download

　　git clone "https://github.com/minerva22c/spring-boot.git"
  
　　git pull -- git서버에서 최신 코드 받아와 merge 하기 ( 최초 download이후 변경분을 받을경우 )
  
　　git reset -- hard HEAD^ && git pull : git 코드 강제로 모두 받아오기



3. 빌드

　　./gradlew clean build



4. api 실행

　　java -jar build/libs/spring-boot-0.0.1-SNAPSHOT.jar



5. (h2)테스트 테이터 입력

　　http://자신의EC2주소:8080/h2-console/


6. API 실행

　　curl -i -X GET "http://자신의EC2주소:8080/books/1/"
