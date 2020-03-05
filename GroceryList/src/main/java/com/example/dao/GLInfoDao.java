package com.example.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.model.GroceryListInfo;

@Repository
@Transactional
public class GLInfoDao {

	private SessionFactory sesfact;
	
	@Autowired
	public GLInfoDao(SessionFactory sesfact)
	{
		super();
		this.sesfact = sesfact;
	}
	
	public List<GroceryListInfo> findAll() {
		return sesfact.openSession().createQuery("from GroceryListInfo", GroceryListInfo.class).list();
	}
	
	public List<GroceryListInfo> findByName(String name) {
		return sesfact.openSession()
				.createNativeQuery("select * from grocery_list_info where"
						+ " list_owner = '" + name + "'", GroceryListInfo.class)
				.list();
	}
}
