package com.service;

import org.springframework.stereotype.Service;

/**
 * @Author: youys
 * @Date: 2020/4/3
 * @Description:
 */
@Service
public class UserServiceImpl implements UserService {
	@Override
	public String getUser() {
		return "张三";
	}
}
