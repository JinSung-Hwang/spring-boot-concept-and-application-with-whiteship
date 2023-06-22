package me.whiteship.springbootgettingstarted;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

//@SpringBootApplication

@Configuration
@ComponentScan // 스프링은 Bean을 두 단계로 나눠서 읽는다. // 처음에는 컴포넌트스캔을 통해서 bean을 등록하고
@EnableAutoConfiguration // 두번째로는 @EnableAUtoConfiguration을 통해서 bean을 등록한다. @EnableAutoConfiguration 은 없어도 스프링은 사용가능하다.
                         // 물론 @EnableAutoConfiguration 이 없다면 webserver로는 동작하지 않는다. 그 이유는 이 어노테이션에서 ServletWebServerFactory Bean을 등록하기 때문이다.
public class SpringBootGettingStartedApplication {
	// Spring에서는 권장하는 Application Class의 파일 위치는 디폴트 패키지에 위치시키는것을 권장한다.
	// 디폴트 패키지는 1번 라인에 있는것이 디폴트 패키지 위치이다.
	// Application Class를 디폴트 패키지에 위치시켜야 이 파일 위치를 기준으로 아래있는 java파일을 읽으면서 컴포넌트 스캔을 진행한다.
	// 따라서 Application Class 상위 패키지에 java파일을 두면 컴포넌트 스캔 대상이 되지 않는다.

	public static void main(String[] args) {
		SpringApplication application = new SpringApplication(SpringBootGettingStartedApplication.class);
		application.setWebApplicationType(WebApplicationType.NONE);
		application.run(args);

//		SpringApplication.run(SpringBootGettingStartedApplication.class, args);
	}

}
