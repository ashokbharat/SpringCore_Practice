package org.ashok.springDemo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor{

  @Override
  public void postProcessBeanFactory(ConfigurableListableBeanFactory factory) throws BeansException {
    System.out.println("MyBeanFactoryPostProcessor method is invoked\n");
    System.out.println("factory singleton count is" + factory.getSingletonCount());
  }

}
