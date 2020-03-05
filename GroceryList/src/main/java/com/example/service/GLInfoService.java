package com.example.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.dao.GLInfoDaoContract;
import com.example.model.GroceryListInfo;

public class GLInfoService {

	@Autowired
	GLInfoDaoContract infod;
	
	public GroceryListInfo getById(int id)
	{
		return infod.findById(id);
	}
	
	public ArrayList<GroceryListInfo> getAll()
	{
		return infod.findAll();
	}
	
	public ArrayList<GroceryListInfo> getByName(String name)
	{
		ArrayList<GroceryListInfo> unfiltered = infod.findAll();
		ArrayList<GroceryListInfo> filtered = new ArrayList<>();
		
		for(GroceryListInfo gli : unfiltered)
		{
			if (gli.getOwner().equals(name))
				filtered.add(gli); 
		}
		
		return filtered;
	}
}
