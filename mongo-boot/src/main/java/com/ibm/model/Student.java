package com.ibm.model;

import org.springframework.data.annotation.id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Student {

	private int rollNo;
	private String name;
	private String school;
	
	public int getRollNo() {
		return rollNo = rollNo;
    }
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	
	public String getName() {
		return name;
	}
	public void  setname(String name) {
		this.name = name;
	}
	public String getSchool() {
		return school;
		
	}
	public void setSchool(String school) {
		this.school = school;
	}
}
