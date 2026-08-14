package edu.abc.test.dto;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AdminStudentResponseDTO {
	
	private String name;
	private int studentCode;
	private String department;
	private int year;
	

}
