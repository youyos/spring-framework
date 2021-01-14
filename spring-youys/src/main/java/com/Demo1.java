package com;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author: youys
 * @Date: 2020/9/17
 * @Description:
 */
public class Demo1 {



	public static void main(String[] args) {
		String s1 = new String("hello");
		String s2 = new String("hello");
		char[] ch = {'h','e','l','l','o'};
		System.out.println("s1.eq(s2): " + s1.equals(s2));
		System.out.println("s1=====s2" + s1 ==s2);
		System.out.println("ch eq s1" + s1.equals(ch));


		A a = (A)Proxy.newProxyInstance(Demo1.class.getClassLoader(), new Class[]{A.class}, new B());
		a.print();
	}


	interface A{
		void print();
	}

	static class B implements  InvocationHandler{

		@Override
		public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
			System.out.println(1111);
			System.out.println(proxy.getClass());
			return proxy;
		}
	}

}
