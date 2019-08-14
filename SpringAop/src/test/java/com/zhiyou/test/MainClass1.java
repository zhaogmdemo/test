package com.zhiyou.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.service.DeptSrvice;
@RunWith(SpringJUnit4ClassRunner.class)
//º”‘ÿ≈‰÷√Œƒº˛
@ContextConfiguration("classpath:applicationContext2.xml")

public class MainClass1 {
	@Autowired
	DeptSrvice deptService;
	
	
	
	@Test
	public void method(){
		deptService.save(null, null);
		//System.out.println("AOP");
	}

}
