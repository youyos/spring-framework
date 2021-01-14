package com.postprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.stereotype.Component;

/**
 * @Author: youys
 * @Date: 2020/4/7
 * @Description:
 */
@Component
public class FirstBeanFactoryProcessor implements BeanDefinitionRegistryPostProcessor {

	@Override
	public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
		System.out.println("first postProcessBeanDefinitionRegistry");

//		GenericBeanDefinition genericBeanDefinition = new GenericBeanDefinition();
//		genericBeanDefinition.setBeanClass(SecondBeanFactoryProcessor.class);
//		registry.registerBeanDefinition("second",genericBeanDefinition);

//		AbstractBeanDefinition userServiceImpl = (AbstractBeanDefinition) registry.getBeanDefinition("userServiceImpl");
//		userServiceImpl.setAutowireMode(AbstractBeanDefinition.AUTOWIRE_BY_TYPE);

	}

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("first postProcessBeanFactory");
	}
}
