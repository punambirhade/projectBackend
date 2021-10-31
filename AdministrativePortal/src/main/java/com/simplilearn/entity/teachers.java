package com.simplilearn.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="teachers")
public class teachers {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String fname;
	private String lname;
	private int age;
	
/*	@ManyToOne
//	@JoinColumn(name="id")
	private classes classes;
	
	
	public classes getClasses() {
		return classes;
	}
	public void setClasses(classes classes) {
		this.classes = classes;
	}*/
	public teachers() {
		super();
	}
	public teachers(int id, String fname, String lname, int age) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	

}
