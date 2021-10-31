package com.simplilearn.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="subjects_classes")
public class subjects_classes {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int sr;        
	private int subject_id ;
	private int classes_id;
	
	
	
	public subjects_classes() {
		super();
	}
	public subjects_classes(int subject_id, int classes_id) {
		super();
		this.subject_id = subject_id;
		this.classes_id = classes_id;
	}
	public int getSr() {
		return sr;
	}
	public void setSr(int sr) {
		this.sr = sr;
	}
	public int getSubject_id() {
		return subject_id;
	}
	public void setSubject_id(int subject_id) {
		this.subject_id = subject_id;
	}
	public int getClasses_id() {
		return classes_id;
	}
	public void setClasses_id(int classes_id) {
		this.classes_id = classes_id;
	}
	
	
	

}
