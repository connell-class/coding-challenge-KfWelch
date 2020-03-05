package com.example.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.GroceryListInfo;
import com.example.service.GLInfoService;

@RestController
@RequestMapping(value = "/mascot")
public class GLInfoController {

	private GLInfoService glis;
	
	@Autowired
	public void setGlis(GLInfoService glis) {
		this.glis = glis;
	}
	
	@GetMapping(value = "/alllists.app")
	public ArrayList<GroceryListInfo> getAll() {
		return glis.getAll();
	}
	
	@GetMapping(value = "/lists.app/{name}")
	public ArrayList<GroceryListInfo> getByName(@PathVariable("name") String name) {
		return glis.getByName(name);
	}
}
