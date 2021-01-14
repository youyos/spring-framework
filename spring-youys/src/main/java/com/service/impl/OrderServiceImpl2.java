package com.service.impl;

import com.service.OrderService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * @Author: youys
 * @Date: 2020/4/8
 * @Description:
 */
@Service
public class OrderServiceImpl2 implements OrderService {

	@Override
	public void export(String name) {
		System.out.println("OrderServiceImpl2");
	}

	@Override
	public String getName() {
		return "OrderServiceImpl2";
	}
}
