package com.cognizant.skygrade.service;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.skygrade.model.Student;
import com.cognizant.skygrade.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	StudentRepository studentRepository;
	
	@Override
	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}

	@Override
	public Student getStudentById(int id) {
		Student student = studentRepository.findById(id).orElse(null);
		if(student != null) {
			return student;
		}
		else {
			throw new NoSuchElementException("Student not found with id: " + student.getId() );
		}
	}

	@Override
	public Student addStudent(Student student) {
		return studentRepository.save(student);
	}
	
	@Override
	public Student updateStudentDetails(Student student) {
		Student studentToBeUpdated = studentRepository.findById(student.getId()).orElse(null);
		if(studentToBeUpdated != null) {
			studentToBeUpdated.setName(student.getName());
			studentToBeUpdated.setSchoolName(student.getSchoolName());
			studentToBeUpdated.setFavSubject(student.getFavSubject());
			return studentRepository.save(studentToBeUpdated);
		}
		else {
			throw new NoSuchElementException("Student not found with id: " + student.getId() );
		}
	}

	@Override
	public String deleteStudent(int id) {
		Student studentToBeDeleted = studentRepository.findById(id).orElse(null); 
		if(studentToBeDeleted == null) {
			return "Student not found.";
		}
		else {
			return "Student details deleted.";
		}
	}

}
