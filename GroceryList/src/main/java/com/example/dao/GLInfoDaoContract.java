package com.example.dao;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;

import com.example.model.GroceryListInfo;

public interface GLInfoDaoContract extends CrudRepository<GroceryListInfo, Integer> {
	GroceryListInfo findById(int id);
	
	ArrayList<GroceryListInfo> findAll();
	
}
