package com.util;
import java.util.Date;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
@Aspect
public class Util {
	
	@Pointcut("execution(* com.service..*.*(..))")
	public void ff(){
		
	}
	//ģ����÷�����ʱ�����־����
	@Before("ff()")
	public void getDate(){
		System.out.println(new Date()+"��������");
	}
	//ģ�������ύ����
	@AfterReturning("ff()")
	public void save(){
		System.out.println("transaction");
	}
	//ģ�����bug�Ĳ���
	@AfterThrowing("ff()")
	public void getBug(){
		System.out.println("��������bug");
	}
	
	//ģ��ر���Դ����
	@After("ff()")
	public void close(){
		System.out.println("�ر���Դ");
	}
	//@Around("ff")
	public Object around(ProceedingJoinPoint pjp){
		System.out.println(new Date()+"������ǿ  ��������");
		Object obj=null;
		try {
			 obj = pjp.proceed();
		} catch (Throwable e) {
			System.out.println(" ������ǿ ��������bug");

		}finally{
			System.out.println("������ǿ �ر���Դ");
		}
		return obj;
	}

}
