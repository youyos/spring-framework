package com.service.impl;

import com.service.OrderService;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * @Author: youys
 * @Date: 2020/4/8
 * @Description:
 */
//@Primary
@Service
public class OrderServiceImpl implements OrderService {




	@Autowired
	private OrderService orderServiceImpl;

	@Override
	public void export(String name) {
		System.out.println(orderServiceImpl.getName());
//		System.out.println(getNameForDataBase(name));
	}

	@Override
	public String getName() {
		return "orderServiceImpl";
	}

	protected String getNameForDataBase(String name){
		return name + ": 张三";
	}
}
