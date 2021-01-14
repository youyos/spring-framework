package com.postprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @Author: youys
 * @Date: 2020/9/10
 * @Description:
 */
@Component
public class PrintInfoBeanPostProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		if(beanName.equalsIgnoreCase("userServiceImpl")){
			System.out.println("before");
		}


		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		if(beanName.equalsIgnoreCase("userServiceImpl")){
			System.out.println("after");
		}
		return bean;
	}
}
