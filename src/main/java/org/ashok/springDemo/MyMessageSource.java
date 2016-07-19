package org.ashok.springDemo;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

@Component
public class MyMessageSource implements Shape,ApplicationEventPublisherAware {
  private Point pointMsg;
  private ApplicationEventPublisher publisher;
  @Autowired
  private MessageSource messageSource;
  
  public MessageSource getMessageSource() {
    return messageSource;
  }
  public void setMessageSource(MessageSource messageSource) {
    this.messageSource = messageSource;
  }
  public Point getPointMsg() {
    return pointMsg;
  }
  @Resource
  public void setPointMsg(Point pointMsg) {
    this.pointMsg = pointMsg;
  }

  @Override
  public void draw() {
    CustomEvent myEvent = new CustomEvent(this);
    publisher.publishEvent(myEvent);
    //You can also use application context's publishevent method but always prefer to code with interfaces
    System.out.println("message text from properties file is:" + this.messageSource.getMessage("greeting", null, "Default Greeting: Welcome", null));
    System.out.println("message text point coordinates from properties file is:" + this.messageSource.getMessage("msgText.pointXY", new Object[]{pointMsg.getX(),pointMsg.getY()}, "Default Greeting: Welcome", null));
    //System.out.println("Point x co-ordinate is :" + pointMsg.getX());
    //System.out.println("Point y co-ordinate is :" + pointMsg.getY());
    
  }
  @Override
  public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
    this.publisher = publisher;
    
  }
  
  
}
