package com.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.DeptDao;
import com.model.Dept;
import com.model.Introduce;
import com.service.DeptSrvice;
@Service
public class DeptServiceImpl implements DeptSrvice{

	@Autowired
	DeptDao deptdao;

	public void save(String sql, Dept dept) {
		deptdao.save(sql, dept);
		
	}
	

}
