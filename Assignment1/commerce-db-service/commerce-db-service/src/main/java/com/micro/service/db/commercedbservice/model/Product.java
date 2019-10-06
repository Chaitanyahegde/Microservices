package com.micro.service.db.commercedbservice.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int catentryID;
	
	private String name;
	private String description;
	
	public int getCatentryID() {
		return catentryID;
	}
	public void setCatentryID(int catentryID) {
		this.catentryID = catentryID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
