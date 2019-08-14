package com.zhiyou.proxy2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class BookProxy implements InvocationHandler{
	
	private Object obj;
	
	public BookProxy(Object obj) {
	
		this.obj = obj;
	}

	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("大甩卖");//前置增强
		Object ob = method.invoke(obj, args);//调用真实对象的方法
		//后置增强
		//jdk自动生成的代理类对象,当前调用的真实方法的对象
		return ob;
	}

}
