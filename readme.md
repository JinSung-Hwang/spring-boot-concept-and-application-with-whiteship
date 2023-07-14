백기선님의 "스프링 부트 개념과 활용" 강의를 수강하며 작성한 코드 저장소입니다.


## 독립적으로 실행 가능한 배포된 JAR

Application을 packaging해서 배포하면 하나의 JAR파일이 생성되고 이 하나의 JAR파일을 통해서 SpringBootApplication을 실행시킬 수 있다. </br>
배포된 JAR 파일에는 "Dependency JAR파일들", "Luncher", "JAR FILE(dependency jar파일을 읽는 로더)"가 자동으로 생성되어 들어가게 된다. </br>
"Luncher"는 작성한 SpringBootApplication을 실행시키고 "JAR File"은 내부에 추가된 Dependency JAR파일을 표준 방식으로 읽을 수 있게 한다. </br>
(JAR 파일을 열어보면 MATA-INF 디렉토리에 MANIFEST.MF 파일을 열어보면 JAR의 설정 정보를 확인할 수 있다.)


## Edit Configurations
### Application을 디버그 모드로 실행시키기
Edit Configurations에 `VM Options: -Ddebug` 또는 `Program Arguments: --debug`를 입력해서 Application을 실행시키면 디버그모드로 실행된다.
디버그 모드는 console창에 디버그로그가 표시되고 SpringBoot의 설정 내역도 같이 표시된다.