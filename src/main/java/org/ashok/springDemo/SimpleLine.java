package org.ashok.springDemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

  public class SimpleLine implements InitializingBean,DisposableBean,Shape {
  private Point pointA;
  private Point pointB;
  public Point getPointA() {
    return pointA;
  }
  public void setPointA(Point pointA) {
    this.pointA = pointA;
  }
  public Point getPointB() {
    return pointB;
  }
  public void setPointB(Point pointB) {
    this.pointB = pointB;
  }
  public void draw(){
    System.out.println("Drawing Simple Line Shape\n");
    System.out.println("pointA x co-0rdinate is :" + pointA.getX() + "pointA y co-ordinate is :" + pointA.getY());
    System.out.println("pointB x co-0rdinate is :" + pointB.getX() + "pointB y co-ordinate is :" + pointB.getY());
  }
  @Override
  public void destroy() throws Exception {
    System.out.println("DisposableBean Default Lifecycle callback method, do some cleanup operations here\n");
    
  }
  @Override
  public void afterPropertiesSet() throws Exception {
    System.out.println("Initializing Bean Default Bean Lifecycyle CallBck Method, do some intializing operations here\n ");
    
  }
  public void myInit(){
    System.out.println("My Own Implementation of Init method of bean, mention init-method attribute in bean definition\n");
  }
  public void cleanUp(){
    System.out.println("My Own Implementation of cleanup method of bean, mention destroy-method attribute in bean definition");
  }
  @PostConstruct
  public void initializeLine(){
    System.out.println("Line is initialized with @PostConstruct annotation");
  }
  @PreDestroy
  public void destroyLine(){
    System.out.println("Line is destroyed with @PreDestroy annotation");
  }
}
