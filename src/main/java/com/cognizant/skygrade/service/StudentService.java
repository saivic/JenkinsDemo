package com.cognizant.skygrade.service;

import java.util.List;

import com.cognizant.skygrade.model.Student;

public interface StudentService {

	public List<Student> getAllStudents();
	public Student getStudentById(int id);
	public Student addStudent(Student student);
	public Student updateStudentDetails(Student student);
	public String deleteStudent(int id);
}
