package com.cognizant.skygrade.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cognizant.skygrade.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
