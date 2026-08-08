package edu.abc.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.abc.test.entity.Student;
import edu.abc.test.service.StudentService;


@RestController
@RequestMapping("/stuapp/student")
public class StudentController
{
	
	@Autowired
	StudentService service;
	
	
	public StudentController() {
		System.err.println("---->>>   Student Controller Constructor");
	}
	
	
	@PostMapping("/save")
	public String insertStudent(@RequestBody  Student student)
	{
		
		System.err.println(" === Inside Controller @Post mapping Student "+student);
		System.err.println(" ===>> service obj inside controller "+service);
		String notification = service.insertStudent(student);
		
		return notification;
		
	}
	
	
	
	@GetMapping("/{rn}")
	public Student getStudentByRollNumber(@PathVariable int rn)
	{
		System.out.println(" inside Controller ====>> "+rn);
		return service.getStudentByRollNumber(rn);
	}
	
	@GetMapping("/all")
	public List<Student> getAllStudents()
	{
		return service.getAllStudents();
				
	}
	

}


// ---  localhost:6080/stuapp/student/1/course/hindi/marks









