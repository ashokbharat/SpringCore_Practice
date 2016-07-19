package org.ashok.springDemo;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationEventPublisher;

public class MyEventPublisher implements ApplicationEventPublisher{

  @Override
  public void publishEvent(ApplicationEvent event) {
    System.out.println(event.toString());
    
  }

}
