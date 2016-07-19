package org.ashok.springDemo;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;
@Component
public class MyEventListener implements ApplicationListener<ApplicationEvent>{

  @Override
  public void onApplicationEvent(ApplicationEvent event) {
    System.out.println("Event listened to is :" + event.toString());
  }

}
