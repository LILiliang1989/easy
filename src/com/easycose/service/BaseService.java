package com.easycose.service;

import java.io.Serializable;
import java.util.List;

import com.easycose.dao.BaseDao;
import com.easycose.util.Order;
import com.easycose.util.Pager;
import com.easycose.util.Property;

/**
 * 业务管理基类
 * @param <T>
 */

public class BaseService<T extends Serializable> {
	
	private BaseDao<T> dao;
	
	public void save(T entity){
		dao.save(entity);
	}
	
	public void update(Object entity) {
		dao.update(entity);
	}
	
	public void delete(Object entity) {
		dao.delete(entity);
	}
	
	public void deleteById(Serializable id) {
		dao.delete(find(id));
	}

	public T find(Serializable id) {
		T entity = (T)dao.find(id);	
		return entity;
	}
	
	public List<T> findAll(){
		return dao.findAll(Order.asc("id"));
	}
	
	public List<T> findByPager(Pager pager){
		return getDao().findByPager(pager, Order.desc("id"));
	}
	
	public List<T> findByPager(Pager pager, Property ... propertys) {
		return getDao().findByPager(pager,Order.desc("id"),propertys);
	}
	
	public List<T> findByPager(Pager pager, Order order, Property ... propertys) {
		return getDao().findByPager(pager, order, propertys);
	}
	
	public List<T> findByPager(Pager pager, Order[] orders, Property ... propertys) {
		return getDao().findByPager(pager, orders, propertys);
	}	
	
	public BaseDao<T> getDao() {
		return dao;
	}

	public void setDao(BaseDao<T> dao) {
		this.dao = dao;
	}
}
