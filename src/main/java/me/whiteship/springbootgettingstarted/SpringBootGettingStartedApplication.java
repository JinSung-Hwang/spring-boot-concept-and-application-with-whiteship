package me.whiteship.springbootgettingstarted;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootGettingStartedApplication {
	// Spring에서는 권장하는 Application Class의 파일 위치는 디폴트 패키지에 위치시키는것을 권장한다.
	// 디폴트 패키지는 1번 라인에 있는것이 디폴트 패키지 위치이다.
	// Application Class를 디폴트 패키지에 위치시켜야 이 파일 위치를 기준으로 아래있는 java파일을 읽으면서 컴포넌트 스캔을 진행한다.
	// 따라서 Application Class 상위 패키지에 java파일을 두면 컴포넌트 스캔 대상이 되지 않는다.

	public static void main(String[] args) {
		SpringApplication.run(SpringBootGettingStartedApplication.class, args);
	}

}
