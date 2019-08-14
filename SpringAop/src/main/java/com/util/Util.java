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
	//模拟调用方法的时候的日志操作
	@Before("ff()")
	public void getDate(){
		System.out.println(new Date()+"操作数据");
	}
	//模拟事务提交操作
	@AfterReturning("ff()")
	public void save(){
		System.out.println("transaction");
	}
	//模拟出现bug的操作
	@AfterThrowing("ff()")
	public void getBug(){
		System.out.println("操作出现bug");
	}
	
	//模拟关闭资源操作
	@After("ff()")
	public void close(){
		System.out.println("关闭资源");
	}
	//@Around("ff")
	public Object around(ProceedingJoinPoint pjp){
		System.out.println(new Date()+"环绕增强  操作数据");
		Object obj=null;
		try {
			 obj = pjp.proceed();
		} catch (Throwable e) {
			System.out.println(" 环绕增强 操作出现bug");

		}finally{
			System.out.println("环绕增强 关闭资源");
		}
		return obj;
	}

}
