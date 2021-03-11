package com;

import com.config.AppConfig;
import com.event.TestEvent;
import com.service.A;
import com.service.OrderService;
import com.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.event.ContextStartedEvent;

/**
 * @Author: youys
 * @Date: 2020/4/3
 * @Description:
 */
public class Main {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext annotationConfigApplicationContext =
				new AnnotationConfigApplicationContext();

		// 关闭循环依赖
//		annotationConfigApplicationContext.setAllowCircularReferences(false);
		annotationConfigApplicationContext.register(AppConfig.class);
		annotationConfigApplicationContext.refresh();

		annotationConfigApplicationContext.close();
////		annotationConfigApplicationContext.scan("com");
//		System.out.println(annotationConfigApplicationContext.getBean(A.class));

//		annotationConfigApplicationContext.publishEvent(new TestEvent("123"));

//		OrderService orderService = (OrderService) annotationConfigApplicationContext.getBean("orderServiceImpl");
//		orderService.export("what your name: ");

		//
//		A bean = annotationConfigApplicationContext.getBean(A.class);
//		bean.test();


	}

	static final int tableSizeFor(int cap) {
		int n = cap - 1;
		n |= n >>> 1;
		n |= n >>> 2;
		n |= n >>> 4;
		n |= n >>> 8;
		n |= n >>> 16;
		return (n < 0) ? 1 : (n >= Integer.MAX_VALUE) ? Integer.MAX_VALUE : n + 1;
	}

}
