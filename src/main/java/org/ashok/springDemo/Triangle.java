package org.ashok.springDemo;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Triangle implements InitializingBean,DisposableBean {
  Log log = LogFactory.getLog(Triangle.class);
  private String type;//Bean Property initialization done in spring.xml  Setter Injection: using property tag
  private int height;
  private int width;
  
  
  public Triangle(){
    
  }
  //Constructor Injections
  public Triangle(String type){
    this.type=type;
  }
  
  public Triangle(int height){
    this.height = height;
  }
  
  public Triangle(String type, int height) {
    this.type = type;
    this.height = height;
  }
  
  public Triangle(String type, int height, int width) {
    this.type = type;
    this.height = height;
    this.width = width;
  }
  public int getHeight() {
    return height;
  }
  
//Setter Injections
 /* public void setHeight(int height) {
    this.height = height;
  }*/
  
  /*
   * public void setType(String type) {
   *  this.type = type; 
   * }
   */
  public String getType() {
    return type;
  }
  
  public int getWidth() {
    return width;
  }
 
  public void draw(){
    log.info("Inside draw method of Triangle class");
    System.out.println("Drawing triangle Shape\n");
    System.out.println(getType() + " Triangle is drawn of height " + getHeight() + "and of width" + getWidth());
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
}
