package com.simplilearn.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="subjects_teachers")
public class subjects_teachers {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	  private int sr;          
	  private int subjects_id; 
	  private int teachers_id;
	  
	  
	  
	public subjects_teachers() {
		super();
	}
	public subjects_teachers(int subjects_id, int teachers_id) {
		super();
		this.subjects_id = subjects_id;
		this.teachers_id = teachers_id;
	}
	public int getSr() {
		return sr;
	}
	public void setSr(int sr) {
		this.sr = sr;
	}
	public int getSubjects_id() {
		return subjects_id;
	}
	public void setSubjects_id(int subjects_id) {
		this.subjects_id = subjects_id;
	}
	public int getTeachers_id() {
		return teachers_id;
	}
	public void setTeachers_id(int teachers_id) {
		this.teachers_id = teachers_id;
	}
	  
	  

}
