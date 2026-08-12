package edu.abc.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
	
	
	
	//   localhost:7080/cgc/admin/student/laptop?sid=1&lid=123
	@PutMapping("/student/laptop")
	public Student linkLaptopWithStudent(@RequestParam( required =  true) int sid , @RequestParam int laptopid)
	{
		return studentService.linkLaptop(sid, laptopid);
	}
	
	
	
	
	@GetMapping("/student/department/{dname}")
	public ResponseEntity<List<Student>> getStudentsByDepartment(@PathVariable String dname)
	{
		
		List<Student> allStudents = studentService.getStudentByDepartment(dname);
		
		
		return new ResponseEntity<List<Student>>(allStudents,HttpStatus.OK);
	}
	
	
}//end class













