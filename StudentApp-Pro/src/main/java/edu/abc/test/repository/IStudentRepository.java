package edu.abc.test.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import edu.abc.test.entity.Student;

@Repository
public interface IStudentRepository extends JpaRepository<Student, Integer>
{

	public List<Student> findByDepartment(String department);
	
	
	public List<Student> findByDepartmentAndYear(String department,int year);
	
	
	
	public List<Student> findByAddressCity(String city);
	
	public List<Student> findByLaptopBrandNameAndAddressCityAndMarksGreaterThan(String brandName,String city,int marks);
	
	
	public List<Student> findByCourseCourseNameAndMarksAndYear(String courseName,int marks,int year);
	
	/*
	 *  count students where based on courseName and location and marks is greater than X
	 * 
	 * count total number of students in CSC using latop which expire in year 2026
	 * */
	
}



