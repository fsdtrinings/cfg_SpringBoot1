package edu.abc.test.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.abc.test.entity.Address;
import edu.abc.test.entity.Student;
import edu.abc.test.repository.IStudentRepository;
import jakarta.transaction.Transactional;

@Service
public class StudentServiceImpl implements IStudentService {

	@Autowired
	IStudentRepository studentRepository;

	@Override
	@Transactional
	public String saveStudent(Student student) {

		// check business constraint
		if (student != null) {

			Student savedStudent = studentRepository.save(student);
			return "Student Saved " + savedStudent.getStudentId();
		}
		return "Student is Null , Contact to Customer Care ";
	}

	@Override
	public List<Student> getAllStudents() {

		return studentRepository.findAll();
	}

	@Override
	@Transactional
	public Student updateStudentAddress(int id, Address address) {
	
		Optional<Student> optionalStudent = studentRepository.findById(id);
		
		Student student = optionalStudent.get();
		
		if(student != null && address != null)
		{
			student.setAddress(address);
		}
		
		
		
		return student;
	}

	
	
	
	
	
	
	
	
	
	
	
	@Override
	public Student getStudentById(int id) {
		return null;
	}

	@Override
	public List<Student> getStudentByDepartment(String department) {
		return null;
	}

	@Override
	public List<Student> getStudentByDepartmentAndYear(String department, int year) {
		return null;
	}

}
