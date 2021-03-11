package com.service.impl;

import com.service.A;
import com.service.B;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * @Author: youys
 * @Date: 2020/7/15
 * @Description:
 */
@Component
public class AImpl  implements A {

	@Autowired
	private B b;

	@Autowired
	private ObjectFactory<B> factory;

	@Override
	public void test(){
		System.out.println("b--------" + b);
		System.out.println("b-factory--------" + factory.getObject());
//		System.out.println("event listener");
	}
}
