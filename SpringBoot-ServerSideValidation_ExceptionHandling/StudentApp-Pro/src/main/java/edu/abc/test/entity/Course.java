package edu.abc.test.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Course {

	@Id
	private String courseCode;
	
	private String courseName;
	private int duration;
	private String category;
	
	
	@OneToMany(mappedBy = "course")
	//@JsonManagedReference // ignore bi-directional looping issue , and used at parent side of the relationship
	List<Student> allStudents;
	
	
}
