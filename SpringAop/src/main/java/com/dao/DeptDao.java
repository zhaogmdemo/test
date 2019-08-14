package com.dao;

import java.util.List;

import com.model.Dept;
import com.model.Introduce;

public interface DeptDao {

	/**
	 * 增加
	 * @param id
	 * @return
	 */
	public void save(String sql,Dept dept);
	
	/**
	 * 删除方法
	 * @param id
	 * @return
	 */
	public void delete(String sql,int id);
	
	/**
	 * 修改方法
	 * @param id
	 * @return
	 */
	public void update(String sql,Dept dept);
	
	/**
	 * 根据ID查询方法
	 * @param id
	 * @return
	 */
	public Dept selectById(String sql,int id);
	
	
	public List<Dept> select(String sql,Object...objects);


}
