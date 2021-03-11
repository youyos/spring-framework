package com.service.impl;

import com.postprocessor.FirstBeanFactoryProcessor;
import com.service.OrderService;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

/**
 * @Author: youys
 * @Date: 2020/4/3
 * @Description:
 */
@Service
public class UserServiceImpl implements UserService {

	@Resource
//	@Qualifier("order1")
	private OrderService orderServiceImpl;

//	public UserServiceImpl() {
//		System.out.println("UserServiceImpl无参构造");
//	}


//	public UserServiceImpl(@Qualifier("order1") OrderService orderServiceImpl) {
////		this.orderService = orderService2;
//		System.out.println("UserServiceImpl有参构造" + orderServiceImpl);
//	}

	@Override
	public String getUser() {
		System.out.println(orderServiceImpl);
		return "张三";
	}


	public void setXxxx(OrderService orderService22){
		System.out.println("setXxxx被调用了" + orderService22);
	}

	public void setOrderServiceImpl(OrderService orderServiceImpl22) {
		this.orderServiceImpl = orderServiceImpl;
		System.out.println("setOrderServiceImpl被调用了" + orderServiceImpl22);
	}

	public void setABC(String a){
		System.out.println("---------");
	}

}
