package com;

import com.config.AppConfig;
import com.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: youys
 * @Date: 2020/4/3
 * @Description:
 */
public class Main {

	public static void main(String[] args) {


		AnnotationConfigApplicationContext annotationConfigApplicationContext =
				new AnnotationConfigApplicationContext(AppConfig.class);

		UserService userService = annotationConfigApplicationContext.getBean(UserService.class);
		System.out.println(userService.getUser());
	}
}
