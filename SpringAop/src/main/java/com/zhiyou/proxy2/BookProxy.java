package com.zhiyou.proxy2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class BookProxy implements InvocationHandler{
	
	private Object obj;
	
	public BookProxy(Object obj) {
	
		this.obj = obj;
	}

	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("��˦��");//ǰ����ǿ
		Object ob = method.invoke(obj, args);//������ʵ����ķ���
		//������ǿ
		//jdk�Զ����ɵĴ��������,��ǰ���õ���ʵ�����Ķ���
		return ob;
	}

}
