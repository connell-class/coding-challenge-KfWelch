package com.example.model;


import java.sql.Timestamp;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Table(name = "grocery_list_info")
public class GroceryListInfo {

	@Id
	@Column(name = "glinfo_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int glinfoId;
	
	@Column(name = "list_owner")
	private String owner;
	
	@Column(name = "list_desc")
	private String description;
	
	@Column(name = "date_made")
	private Timestamp dateMade;
	
	@OneToMany(mappedBy = "listId", fetch = FetchType.EAGER)
	private Set<GroceryListItem> items;
	
	
	
	@Override
	public String toString() {
		return "GroceryListInfo [glinfoId=" + glinfoId + ", owner=" + owner + ", description=" + description
				+ ", dateMade=" + dateMade + ", items=" + items + "]";
	}

	public GroceryListInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GroceryListInfo(int glinfoId, String owner, String description, Timestamp dateMade,
			Set<GroceryListItem> items) {
		super();
		this.glinfoId = glinfoId;
		this.owner = owner;
		this.description = description;
		this.dateMade = dateMade;
		this.items = items;
	}

	public int getGlinfoId() {
		return glinfoId;
	}

	public void setGlinfoId(int glinfoId) {
		this.glinfoId = glinfoId;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Timestamp getDateMade() {
		return dateMade;
	}

	public void setDateMade(Timestamp dateMade) {
		this.dateMade = dateMade;
	}

	public Set<GroceryListItem> getItems() {
		return items;
	}

	public void setItems(Set<GroceryListItem> items) {
		this.items = items;
	}

}
