package com.service.impl;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.stereotype.Service;

/**
 * @Author: youys
 * @Date: 2021/3/11
 * @Description:
 */

@Service
public class DestroyService implements DisposableBean {

	/**
	 * 第一种方式，实现
	 * 第三种方式，通过beanFactoryPostProcessor修改bd的destroyMethod=(inferred) 并且提供close方法或者shutdown方法
	 *
 	 */
	public void close(){
		System.out.println("DestroyService close()");
	}

	@Override
	public void destroy() throws Exception {

	}
}
