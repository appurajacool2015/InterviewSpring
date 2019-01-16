package com.anand.springevents;

import java.util.Arrays;
import java.util.Date;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan(basePackages = { "com.anand.practise" })
@Configuration
public class CustomerService
		implements InitializingBean, DisposableBean, BeanNameAware, BeanFactoryAware, ApplicationContextAware {

	@Autowired
	CustomEventPublisher customEventPublisher;

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet :: I am in after properties set.");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("destroy ::  overrided method of DisposableBean");
	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("setBeanFactory method of BeanFactoryAware Aware bean is called");
		System.out.println("setBeanFactory:: Aware bean singleton=" + beanFactory.isSingleton("customEventPublisher"));
	}

	@Override
	public void setBeanName(String beanName) {
		System.out.println("setBeanName method of BeanNameAware Aware bean is called");
		System.out.println("setBeanName:: Bean Name defined in context=" + beanName);
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("setApplicationContext method of Aware bean is called");
		System.out.println("setApplicationContext:: Bean Definition Names="
				+ Arrays.toString(applicationContext.getBeanDefinitionNames()));
		System.out.println(
				"setApplicationContext:: Application startup date =" + new Date(applicationContext.getStartupDate()));
	}
	
	@PostConstruct
	public void postConstructMethod() {
		System.out.println("postConstructMethod :: overrided method of InitializingBean");
	}

	@PreDestroy
	public void preDetroytMethod() {
		System.out.println("preDetroyMethod :: overrided method of DisposableBean");
		System.out.println("**** preDetroyMethod :: start to publish an Event ******");
		customEventPublisher.publish();
		System.out.println("**** preDetroyMethod :: After Event published ******");
	}

}
