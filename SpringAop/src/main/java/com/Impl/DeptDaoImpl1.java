package com.Impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.dao.DeptDao;
import com.model.Dept;
import com.model.Introduce;

@Repository
public class DeptDaoImpl1 implements DeptDao{

	public void save(String sql, Dept dept) {
		System.out.println("save");
		
	}

	public void delete(String sql, int id) {
		// TODO Auto-generated method stub
		
	}

	public void update(String sql, Dept dept) {
		// TODO Auto-generated method stub
		
	}

	public Dept selectById(String sql, int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Dept> select(String sql, Object... objects) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
