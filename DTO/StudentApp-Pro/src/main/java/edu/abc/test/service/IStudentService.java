package edu.abc.test.service;

import java.util.List;

import org.springframework.stereotype.Service;

import edu.abc.test.entity.Address;
import edu.abc.test.entity.Student;
import edu.abc.test.exceptions.UserNotFoundException;

@Service
public interface IStudentService {


	public String saveStudent(Student student);

	public Student getStudentById(int id)throws UserNotFoundException;
	
	public List<Student> getAllStudents();
	
	public List<Student> getStudentByDepartment(String department);
	
	public List<Student> getStudentByDepartmentAndYear(String department,int year);
	
	public Student updateStudentAddress(int id,Address address)throws UserNotFoundException;
	
	
	public Student linkLaptop(int sid,int lid)throws UserNotFoundException;
	
	// -------------------------------------------
	

	
	
	

}























