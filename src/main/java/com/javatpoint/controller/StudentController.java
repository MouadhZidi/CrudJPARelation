package com.javatpoint.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.javatpoint.model.Student;
import com.javatpoint.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	StudentService studentService;

	@GetMapping("/student")
	private List<Student> getAllStudent() {
		return studentService.getAllStudent();
	}

	@GetMapping("/student/{studentid}")
	private Student getStudent(@PathVariable("studentid") int studentid) {
		return studentService.getStudentById(studentid);
	}
	
	@DeleteMapping("/student/{studentid}")
	private void DeleteStudent(@PathVariable("studentid") int studentid) {
	studentService.DeleteStudent(studentid);
	}
	
	@PostMapping("/students")
	private int saveStudent(@RequestBody Student student) {
		studentService.SaveOrUpdate(student);
		return student.getStudentid();
	}
	
	@PutMapping("/students")
	private void updateStudent(@RequestBody Student student) {
		studentService.SaveOrUpdate(student);
}

}
