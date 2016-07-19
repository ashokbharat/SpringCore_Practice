package org.ashok.springDemo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class DrawingApp {

  /**
   * @param args
   */
  public static void main(String[] args) {
    //Triangle triangle = new Triangle();
    
    //Using BeanFactory
    /*BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
    Triangle triangle = (Triangle)factory.getBean("triangle");*/
    
    //Using ApplicationContext similar to BeanFactory, move spring xml to under src/main/java and also usage of IntializingBean and Disposable Bean
    //default bean lifecycle callback methods 
    //ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
    /*AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
    ctx.registerShutdownHook();//register to shutdownhook for a desktop application
    Triangle triangle = (Triangle)ctx.getBean("triangle");
    triangle.draw();*/
    
    //Demo of Injecting Derived Object Types Dependency in which four Point objects will be injected into the Rectangle class and also bean definition inheritance
    /*ApplicationContext ctx = new ClassPathXmlApplicationContext("derivedobjectDependency.xml");
    Rectangle rect = (Rectangle) ctx.getBean("rectangle1");
    rect.draw();*/
    
    //Demo of Injecting Bean List, list of point objects list dependency inside a Pentagon and list merge along with bean definition inheritance
    /*ApplicationContext ctx = new ClassPathXmlApplicationContext("ListInjection.xml");
    Pentagon ptgn = (Pentagon) ctx.getBean("pentagon1");
    ptgn.draw();*/
    
    //Demo of Injecting Bean Dependency by autowire attribute and demo of @Component Stereotype annotation
    /*ApplicationContext ctx = new ClassPathXmlApplicationContext("autowire.xml");
    Shape sh = (Shape) ctx.getBean("circle");
    sh.draw();*/
    
    //Demo of Bean PostProcessor for doing initialization of beans after postProcess and also usage of @PostConstruct and @PreDestroy annotations
    //ApplicationContext ctx = new ClassPathXmlApplicationContext("beanPostProcessor.xml");
   /* AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("beanPostProcessor.xml");
    ctx.registerShutdownHook();//register to shutdownhook for a desktop application
    Shape shape = (Shape) ctx.getBean("circle");
    shape.draw();*/
    
    //Demo of using MessageSource interface to get messagetest from properties file, ClassPathAppllnContext class also implements MessageSource Interface and
    //ApplicationListener and ApplicationEventPublisher and CustomEvent usage
    ApplicationContext ctx = new ClassPathXmlApplicationContext("messageSource.xml");
    MyMessageSource msgSrc = (MyMessageSource) ctx.getBean("myMessageSource");
    msgSrc.draw();
    //System.out.println(ctx.getMessage("greeting", null, "Default Greeting: Welcome", null));
  }

}
