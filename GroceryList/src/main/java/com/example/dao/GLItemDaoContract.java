package com.example.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.model.GroceryListItem;

public interface GLItemDaoContract extends CrudRepository<GroceryListItem, Integer> {
	GroceryListItem findById(int id);
	
	
}
