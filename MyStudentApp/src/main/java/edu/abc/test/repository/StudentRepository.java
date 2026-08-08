package edu.abc.test.repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import edu.abc.test.entity.Student;

//@Repository
@Component
public class StudentRepository {

	List<Student> allStudents = new ArrayList<>();
	
	public StudentRepository() {
		System.out.println(" === StudentRepository Connstructor ===");
		int i = 1;
		Student s1 = new Student(i++,"A", 80, "Delhi", "Java");
		Student s2 = new Student(i++,"B", 40, "Noida", "Java");
		Student s3 = new Student(i++,"AHB", 20, "Delhi", "Java");
		Student s4 = new Student(i++,"A", 90, "Delhi", "Oracle");
		Student s5 = new Student(i++,"dfA", 70, "Noida", "Java");
	
		allStudents.add(s1);
		allStudents.add(s2);
		allStudents.add(s3);
		allStudents.add(s4);
		allStudents.add(s5);
	
	
		//allStudents = Arrays.asList(s1,s2,s3,s4,s5);
		
		System.err.println("All Student Size "+allStudents.size());
	}
	
	
	
	public List<Student> getAllStudents() {
		return allStudents;
	}


	public Student getStudentByRollNumber(int rollNumber)
	{
		
		return allStudents.stream().filter((s)->{
			if(s.getRollNumber() == rollNumber)
				return true;
			return false;
			
		}).findFirst().get();
		
	}//end of method
	
	public List<Student> getAllStudentsByCity(String cityName)
	{
		List<Student> tempList = new ArrayList<>();
		
		for (Student student : allStudents) {
			if(student.getLocation().equals(cityName))
			{
				tempList.add(student);
				
			}
		}
		
		return tempList;
		
	}
	
	public List<Student> getAllStudentsByCourse(String course)
	{
		List<Student> tempList = 
				allStudents.stream().filter((s)->{
					if(s.getCourse().equals(course))
						return true;
					return false;
				}).collect(Collectors.toList());
		
		return tempList;
		
	}
	

	public String addStudent(Student s) {
		
		System.err.println(" ====>> Inside Repository "+s);
		System.err.println(" ===>> Inside repository allStudent List : "+allStudents);
		 allStudents.add(s);
		 System.err.println(" ===>> After Insert "+allStudents.size());
		 return "Student Added !!!";
	}
	
	
}//end of class


















