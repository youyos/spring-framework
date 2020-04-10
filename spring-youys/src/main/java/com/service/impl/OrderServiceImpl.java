package com.service.impl;

import com.service.OrderService;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * @Author: youys
 * @Date: 2020/4/8
 * @Description:
 */
@Primary
@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	private UserService userService;
}
