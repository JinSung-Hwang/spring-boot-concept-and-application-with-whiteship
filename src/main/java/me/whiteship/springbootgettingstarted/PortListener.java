package me.whiteship.springbootgettingstarted;

import org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext;
import org.springframework.boot.web.servlet.context.ServletWebServerInitializedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class PortListener implements ApplicationListener<ServletWebServerInitializedEvent> { // ServletWebServerInitializedEvent이 이벤트는 웹서버가 생성이 되면 onApplicationEvent 리스너가 호출이 되도록 만든다.
  @Override
  public void onApplicationEvent(ServletWebServerInitializedEvent servletWebServerInitializedEvent) {
    ServletWebServerApplicationContext applicationContext = servletWebServerInitializedEvent.getApplicationContext();
    System.out.println(applicationContext.getWebServer().getPort()); // applicationContext를 통해서 webServer를 가져올수있고 webserver를 통해서 port도 가져올 수 있다.
  }
}
