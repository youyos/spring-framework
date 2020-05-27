package com.service.impl;

import com.service.OrderService;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * @Author: youys
 * @Date: 2020/4/3
 * @Description:
 */
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private OrderService orderService;

	public UserServiceImpl() {
		System.out.println("UserServiceImpl无参构造");
	}


//	@Autowired
//	public UserServiceImpl(OrderService orderService) {
//		this.orderService = orderService;
//		System.out.println("UserServiceImpl有参构造");
//	}

	@Override
	public String getUser() {
		return "张三";
	}


	@PostConstruct
	public void init(){
		System.out.println("userService init is run");
	}
}
