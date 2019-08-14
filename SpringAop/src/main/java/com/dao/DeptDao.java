package com.dao;

import java.util.List;

import com.model.Dept;
import com.model.Introduce;

public interface DeptDao {

	/**
	 * ����
	 * @param id
	 * @return
	 */
	public void save(String sql,Dept dept);
	
	/**
	 * ɾ������
	 * @param id
	 * @return
	 */
	public void delete(String sql,int id);
	
	/**
	 * �޸ķ���
	 * @param id
	 * @return
	 */
	public void update(String sql,Dept dept);
	
	/**
	 * ����ID��ѯ����
	 * @param id
	 * @return
	 */
	public Dept selectById(String sql,int id);
	
	
	public List<Dept> select(String sql,Object...objects);


}
