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
import jakarta.persistence.OneToOne;
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
	private String studentName;
	
	@Column(nullable = false)
	private String department;
	
	private int marks;

	@Embedded
	@Column(unique = true)
	private Address address;
	
	private int year;

	public Student(String studentName, String department, int marks, int year) {
		super();
		this.studentName = studentName;
		this.department = department;
		this.marks = marks;
		this.year = year;
	}


	@OneToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name = "laptop_Number")
	private Laptop laptop;
	

	
	
}//end class











