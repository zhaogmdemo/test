package com.zhiyou.test;

import java.lang.reflect.Proxy;

import org.junit.Test;

import com.zhiyou.proxy2.BookMan;

import com.zhiyou.proxy2.BookProxy;
import com.zhiyou.proxy2.HZXWBook;


public class MainClass {
	/*@Test
	public void method(){
		BookMan book=new XHSDBookproxy();//��̬����
		book.sellingBook();
	}*/
	@Test
	public void method2(){
		BookProxy book=new BookProxy(new HZXWBook());//��̬����
		BookMan newp = (BookMan) Proxy.newProxyInstance(book.getClass().getClassLoader(), new Class[]{BookMan.class}, book);
		//���������ģ��ӿڣ�����ִ�еĶ���
		//�������ǵĴ��������
		newp.sellingBook();
		
	}

}
