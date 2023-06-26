package me.whiteship.springbootgettingstarted;

//import org.apache.catalina.Context;
//import org.apache.catalina.LifecycleException;
//import org.apache.catalina.startup.Tomcat;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.thymeleaf.context.IContext;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

//@SpringBootApplication // @SpringBootApplication 안에는 @ComponentScan 와 @EnableAutoConfiguration가 있다.

//@Configuration
//@ComponentScan // 스프링은 Bean을 두 단계로 나눠서 읽는다. // 처음에는 컴포넌트스캔을 통해서 bean을 등록하고
//@EnableAutoConfiguration // 두번째로는 @EnableAUtoConfiguration을 통해서 bean을 등록한다. @EnableAutoConfiguration 은 없어도 스프링은 사용가능하다.
//                         // 물론 @EnableAutoConfiguration 이 없다면 webserver로는 동작하지 않는다. 그 이유는 이 어노테이션에서 ServletWebServerFactory Bean을 등록하기 때문이다.
//public class SpringBootGettingStartedApplication {
//	 Spring에서는 권장하는 Application Class의 파일 위치는 디폴트 패키지에 위치시키는것을 권장한다.
//	 디폴트 패키지는 1번 라인에 있는것이 디폴트 패키지 위치이다.
//	 Application Class를 디폴트 패키지에 위치시켜야 이 파일 위치를 기준으로 아래있는 java파일을 읽으면서 컴포넌트 스캔을 진행한다.
//	 따라서 Application Class 상위 패키지에 java파일을 두면 컴포넌트 스캔 대상이 되지 않는다.

//		public static void main(String[] args) throws LifecycleException {
//		SpringApplication application = new SpringApplication(SpringBootGettingStartedApplication.class);
//		application.setWebApplicationType(WebApplicationType.NONE);
//		application.run(args);

//		SpringApplication.run(SpringBootGettingStartedApplication.class, args);

//		 아래 코드를 통해서 spring mvc를 사용하지 않고 tomcat을 통해서 서버를 띄울 수 있다.
//		   스프링부트는 내부적으로
//		   spring-boot-autoconfigure의 ServletWebServerFactoryAutoConfiguration으로 톰켓을 만들고
//		   spring-boot-autoconfigure의 TomcatServletWebServerFactoryCustomizer를 통해서 서버를 커스터마이징하고
//		   spring-boot-autoconfigure의 DispatcherServletAutoConfiguration을 통해서 서블릿을 만들고 등록을 한다.
//		Tomcat tomcat = new Tomcat();
//		tomcat.setPort(8080);
//		Context context = tomcat.addContext("/", "/");
//		HttpServlet servlet = new HttpServlet() {
//			@Override
//			protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//				PrintWriter writer = resp.getWriter();
//				writer.println("<html><head><title>");
//				writer.println("Hey, Tomcat");
//				writer.println("</title></head>");
//				writer.println("<body><h1>Hello Tomcat</h1></body>");
//				writer.println("</html>");
//			}
//		};
//		String servletName = "helloServlet";
//		tomcat.addServlet("/", servletName, servlet);
//		context.addServletMappingDecoded("/hello", servletName);
//		tomcat.start();
//		tomcat.getServer().await();
//	}
//
//}


@SpringBootApplication
public class SpringBootGettingStartedApplication { // undertow를 사용하기 위함
	public static void main(String[] args) {
		SpringApplication.run(SpringBootGettingStartedApplication.class, args);
	}
}
