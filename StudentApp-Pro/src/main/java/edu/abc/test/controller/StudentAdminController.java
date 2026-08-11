package edu.abc.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.abc.test.entity.Student;
import edu.abc.test.service.IStudentService;

@RestController
@RequestMapping("/cgc/admin")
public class StudentAdminController {

	@Autowired
	IStudentService studentService;
	
	
	public StudentAdminController() {
		System.out.println("StudentAdminController Constructor called");
	}
	
	
	@PostMapping("/student")
	public ResponseEntity<String> saveStudent(@RequestBody Student student)
	{
		String notification =  studentService.saveStudent(student);
		
		return new ResponseEntity<String>(notification,HttpStatus.OK);
	}
	
	@GetMapping("/students")
	public ResponseEntity<List<Student>> getAllStudents()
	{
		List<Student> allSavedStudents =  studentService.getAllStudents();
	
		return new ResponseEntity<List<Student>>(allSavedStudents,HttpStatus.OK);
	}
	
	
}//end class
