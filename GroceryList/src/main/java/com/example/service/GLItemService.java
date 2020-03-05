package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.dao.GLItemDaoContract;
import com.example.model.GroceryListItem;

public class GLItemService {

	@Autowired
	GLItemDaoContract itemd;
	
	public void saveItem(GroceryListItem item) 
	{
		itemd.save(item);
	}
}
