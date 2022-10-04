package com.javatpoint.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javatpoint.model.Student;
import com.javatpoint.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	StudentRepository studentRepository;

	// get all student

	public List<Student> getAllStudent() {
		List<Student> student = new ArrayList<>();
		studentRepository.findAll().forEach(student1 -> student.add(student1));
		return student;
	}

	// get student by id
	public Student getStudentById(int id) {
		return studentRepository.findById(id).get();
	}
//	
//	//save a student
//	
	public void SaveOrUpdate(Student student) {
	studentRepository.save(student);
	}
	
// delete student

	public void DeleteStudent(int id) {
		studentRepository.deleteById(id);
	}
//	
//	//update student
	
	public void UpdateStudent(Student student, int studentid) {
		studentRepository.save(student);
	}
}
