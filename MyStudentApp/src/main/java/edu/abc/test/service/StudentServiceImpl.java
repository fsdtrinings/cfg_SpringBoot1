package edu.abc.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.abc.test.entity.Student;
import edu.abc.test.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepository repository;
	
	@Override
	public List<Student> getAllStudents() {
		
		List<Student> list =  repository.getAllStudents();
		System.out.println(" ----- inside service impl all Student "+list.size());

		return list;
	}

	@Override
	public List<Student> getAllStudentsByLocation(String location) {
		
		return repository.getAllStudentsByCity(location);
	}

	@Override
	public List<Student> getAllStudentsByCourse(String course) {
		
		return repository.getAllStudentsByCourse(course);
	}

	@Override
	public Student getStudentByRollNumber(int rollNumber) {
		
		return repository.getStudentByRollNumber(rollNumber);
	}

	@Override
	public String insertStudent(Student s) {
		
		System.err .println(" ====>> inside service "+s);
		return repository.addStudent(s);
	}
	
	
	

}




















