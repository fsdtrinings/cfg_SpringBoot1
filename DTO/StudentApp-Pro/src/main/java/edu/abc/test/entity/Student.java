package edu.abc.test.entity;

import org.hibernate.annotations.Collate;

import jakarta.annotation.Generated;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int studentId;
	
	@Column(nullable = false)
	@NotBlank(message = "Student Name cannot be Blank")
	@Size(min = 3,max = 50, message = "Enter Valid Name")
	private String studentName;
	
	@Column(nullable = false)
	@NotBlank(message = "Department Name cannot be Blank")
	@Size(min = 1,max = 50, message = "Enter Valid Depatment Name")
	private String department;
	
	@Min(value = 1,message = "Invalid Marks ")
	@Max(value = 100,message = "Invalid Marks ")
	private int marks;

	@Embedded
	@Column(unique = true)
	private Address address;
	
	private int year;
	
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "laptop_Number")
	private Laptop laptop;
	
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "enrolledCourse")
	private Course course;
	

	public Student(String studentName, String department, int marks, int year) {
		super();
		this.studentName = studentName;
		this.department = department;
		this.marks = marks;
		this.year = year;
	}




	
	
}//end class











