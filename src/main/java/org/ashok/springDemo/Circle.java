package org.ashok.springDemo;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;
@Component
//Tell Spring to instantiate circle bean without you declaring bean tag in xml
//Used for DataAccess,Service Class,Controller and View standard Spring beans
public class Circle implements Shape{
  private Point center;
  
  public Point getCenter() {
    return center;
  }
  //Usage of RequiredAnnotation which let SPring know to load the RequiredAnnotationBeanPostProcessor to do validation of instance variable of Circle shape
  //and if dependency is not met, then throw an exception at earlier stage at compile time instead of throwing Runtime exceptions
 // @Required
 // @Autowired
 // @Qualifier("circleRelated")
  //@Resource(name="pointA")//JSR 250 annotation standard which injects the dependency by matching name, pointC
  @Resource
  //For Autowired Annotation makes use of AutowiredAnnotationBeanPostProcessor to wire the beans first by type, if it fails then it tries by name, if it fails
  //still then it makes use of qualifiers
  public void setCenter(Point center) {
    this.center = center;
  }

  @Override
  public void draw() {
    System.out.println("Drawing Circle shape\n");
    System.out.println("circle center pointx is :" + center.getX() + "pointy is :" + center.getY());
    
  }

}
