package com.youys.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: youys
 * @Date: 2020/7/21
 * @Description:
 */
@Controller
@RequestMapping("/test")
public class TestController {


	public TestController(){
		System.out.println("controller-----------");
	}


	@RequestMapping("/hello")
	public Object hello(String name) {
		return "hello," + name;
	}
}
