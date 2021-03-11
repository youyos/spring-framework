package com.config;

import com.service.A;
import com.service.B;
import com.service.impl.AImpl;
import com.service.impl.BImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author: youys
 * @Date: 2020/4/3
 * @Description:
 */
@Configuration
@ComponentScan("com")
@EnableAspectJAutoProxy
public class AppConfig {


//	@Bean
//	public A a(){
//		AImpl a = new AImpl();
//		return a;
//	}
//
//
//	@Bean
//	public B b(){
//		A a = a();
//		System.out.println(a);
//		return new BImpl();
//	}


}
