package com.simplilearn.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="teachers_classes")
public class teachers_classes {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 private int sr;
	 private int student_id; 
	 private int classes_id;
	 
	 
	public teachers_classes() {
		super();
	}
	public teachers_classes(int student_id, int classes_id) {
		super();
		this.student_id = student_id;
		this.classes_id = classes_id;
	}
	public int getSr() {
		return sr;
	}
	public void setSr(int sr) {
		this.sr = sr;
	}
	public int getStudent_id() {
		return student_id;
	}
	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}
	public int getClasses_id() {
		return classes_id;
	}
	public void setClasses_id(int classes_id) {
		this.classes_id = classes_id;
	}
	 
}
