package edu.abc.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import edu.abc.test.entity.Address;
import edu.abc.test.entity.Student;
import edu.abc.test.exceptions.UserNotFoundException;
import edu.abc.test.service.IStudentService;

@RestController
@RequestMapping("cgc/student")
public class StudentController {
	
	@Autowired
	IStudentService studentService;
	
	public StudentController()
	{
		System.out.println("StudentController contrsuctor");
	}

	// ... 7081/cgc/student?id=1 + [body of address ]
	@PutMapping("")
	public ResponseEntity<Student> 
	      updateAddress(@RequestBody Address address,@RequestParam(required = true) int id)
	      throws UserNotFoundException
	{

		Student updatedStudent = studentService.updateStudentAddress(id, address);
		
		
		return new ResponseEntity<Student>(updatedStudent,HttpStatus.OK);
	}
	
}
