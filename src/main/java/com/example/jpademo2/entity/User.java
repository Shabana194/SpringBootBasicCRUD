package com.example.jpademo2.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name="tbl_user")
@Entity
public class User {
	
	@Id
	private int id;
	private String name;
	
	public String toString() {
		return name+":"+id;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
