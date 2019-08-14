package com.zhiyou.proxy;

public class XHSDBookproxy implements BookMan{

	private XHSDBook book=new XHSDBook();
	public void sellingBook() {

		System.out.println("´òÕÛ");
		book.sellingBook();
		System.out.println("»ý·Ö");
	}

}
