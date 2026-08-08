package edu.abc.test.entity;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Entity
@Component

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {

	private int rollNumber;
	private String name;
	private int marks;
	private String location;
	private String course;
	
	
	
	
}
