package com.ibm.service;

import java.ibm.model.student;

public class StudentService {
	
	void save(Student s);
	
	Student fetch(int rollNo);
	
	List<Student> fetchAll();

}
