package org.ashok.springDemo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class AbstractShape implements ApplicationContextAware,BeanNameAware,Shape {
  private Point pointA;
  private Point pointB;
  private Point pointC;
  private ApplicationContext ctx=null;
  
  /*public AbstractShape(Point pointA, Point pointB, Point pointC) {
    super();
    this.pointA = pointA;
    this.pointB = pointB;
    this.pointC = pointC;
  }*/
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
  public Point getPointC() {
    return pointC;
  }
  public void setPointC(Point pointC) {
    this.pointC = pointC;
  }
  public void draw(){
    System.out.println("firstPoint x co-ordinate is:" + getPointA().getX() + "firstPoint y co-ordinate is:" + getPointA().getY());
    System.out.println("secondPoint x co-ordinate is:" + getPointB().getX() + "secondPoint y co-ordinate is:" + getPointB().getY());
    System.out.println("thirdPoint x co-ordinate is:" + getPointC().getX() + "thirdPoint y co-ordinate is:" + getPointC().getY());
    /*System.out.println("ctx display name is :" + getCtx().getDisplayName());
    System.out.println("ctx application name is :" + getCtx().getApplicationName());
    System.out.println("ctx bean definition count is :" + getCtx().getBeanDefinitionCount());
    System.out.println("ctx id is :" + getCtx().getId());
    Point pointB = (Point) getCtx().getBean("pointB");
    System.out.println("pointB x co-ordinate is " + pointB.getX());*/
  }
  @Override
  public void setApplicationContext(ApplicationContext context) throws BeansException {
    this.ctx = context;
  }
  public ApplicationContext getCtx() {
    return ctx;
  }
  @Override
  public void setBeanName(String name) {
    System.out.println("Bean name is" + name);
    
  }
  
}
