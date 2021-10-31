package com.simplilearn.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="subjects")
public class subjects {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String shortcut;
	
	
	public subjects() {
		super();
	}
	public subjects(int id, String name, String shortcut) {
		super();
		this.id = id;
		this.name = name;
		this.shortcut = shortcut;
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
	public String getShortcut() {
		return shortcut;
	}
	public void setShortcut(String shortcut) {
		this.shortcut = shortcut;
	}
	

}
