package com.zhiyou.test;

import java.lang.reflect.Proxy;

import org.junit.Test;

import com.zhiyou.proxy2.BookMan;

import com.zhiyou.proxy2.BookProxy;
import com.zhiyou.proxy2.HZXWBook;


public class MainClass {
	/*@Test
	public void method(){
		BookMan book=new XHSDBookproxy();//静态代理
		book.sellingBook();
	}*/
	@Test
	public void method2(){
		BookProxy book=new BookProxy(new HZXWBook());//动态代理
		BookMan newp = (BookMan) Proxy.newProxyInstance(book.getClass().getClassLoader(), new Class[]{BookMan.class}, book);
		//类加载器，模拟接口，代理执行的对象
		//生成我们的代理类对象
		newp.sellingBook();
		
	}

}
