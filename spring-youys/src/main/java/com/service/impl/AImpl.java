package com.service.impl;

import com.service.A;
import org.springframework.context.event.EventListener;

/**
 * @Author: youys
 * @Date: 2020/7/15
 * @Description:
 */
public class AImpl  implements A {


	@Override
	public void test(){
		System.out.println("event listener");
	}
}
