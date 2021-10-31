package com.simplilearn.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="classes")
public class classes {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	//@Column(name="id")
	private int id;
	private int section;
	private String teacher;
	private String subject;
	private String time;
	
	private String teachername ;
	private String subjectname;
	
public String getTeachername() {
		return teachername;
	}
	public void setTeachername(String teachername) {
		this.teachername = teachername;
	}
	public String getSubjectname() {
		return subjectname;
	}
	public void setSubjectname(String subjectname) {
		this.subjectname = subjectname;
	}
	//	@OneToMany(mappedBy="classes" ,cascade= CascadeType.ALL)
	//@JoinTable(joinColumns=@JoinColumn(name="sid"),inverseJoinColumns=@JoinColumn(name="id"))
/*	private List<teachers> teachers=new ArrayList<teachers>();
	
	
	public List<teachers> getTeachers() {
		return teachers;
	}
	public void setTeachers(List<teachers> teachers) {
		this.teachers = teachers;
	}*/
	public classes() {
		super();
	}
	public classes(int id, int section, String teacher, String subject, String time) {
		super();
		this.id = id;
		this.section = section;
		this.teacher = teacher;
		this.subject = subject;
		this.time = time;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSection() {
		return section;
	}
	public void setSection(int section) {
		this.section = section;
	}
	public String getTeacher() {
		return teacher;
	}
	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	
	
	
	
}
