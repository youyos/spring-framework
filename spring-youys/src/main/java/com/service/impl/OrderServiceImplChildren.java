package com.service.impl;

import org.springframework.stereotype.Service;

/**
 * @Author: youys
 * @Date: 2020/10/16
 * @Description:
 */
//@Service
public class OrderServiceImplChildren extends OrderServiceImpl{


	@Override
	protected String getNameForDataBase(String name) {
		return name + ": 李四";
	}
}
