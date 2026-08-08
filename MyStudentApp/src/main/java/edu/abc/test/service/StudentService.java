package edu.abc.test.service;

import java.util.List;

import org.springframework.stereotype.Service;

import edu.abc.test.entity.Student;

@Service
public interface StudentService {

	public List<Student> getAllStudents();
	
	public List<Student> getAllStudentsByLocation(String location);
	
	public List<Student> getAllStudentsByCourse(String course);
	
	public Student getStudentByRollNumber(int rollNumber);
	
	public String insertStudent(Student s);
	
}//end service
