package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Entity
@Table(name = "grocery_list_item")
@Data
@AllArgsConstructor
@ToString
public class GroceryListItem {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "glitem_id")
	private int glitemId;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "list_id")
	@JsonIgnore
	private GroceryListInfo listId;
	
	@Column(name = "item_type")
	private String itemType;
	
	@Column(name = "item")
	private String item;
	
	
}
