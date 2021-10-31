package com.simplilearn.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="students_classes")
public class students_classes {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int srno ;    
	private int classes_id ;
	private int student_id;
	
	
	public students_classes() {
		super();
	}
	public students_classes(int classes_id, int student_id) {
		super();
		this.classes_id = classes_id;
		this.student_id = student_id;
	}
	public int getSrno() {
		return srno;
	}
	public void setSrno(int srno) {
		this.srno = srno;
	}
	public int getClasses_id() {
		return classes_id;
	}
	public void setClasses_id(int classes_id) {
		this.classes_id = classes_id;
	}
	public int getStudent_id() {
		return student_id;
	}
	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}
}
