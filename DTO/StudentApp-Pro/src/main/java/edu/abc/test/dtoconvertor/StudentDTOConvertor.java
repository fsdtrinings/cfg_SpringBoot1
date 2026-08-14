package edu.abc.test.dtoconvertor;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.annotations.Comment;
import org.springframework.stereotype.Component;

import edu.abc.test.dto.AdminStudentResponseDTO;
import edu.abc.test.entity.Student;


public class StudentDTOConvertor {
	
	public static List<AdminStudentResponseDTO> getAllStudentDTO(List<Student> students)
	{
		
		List<AdminStudentResponseDTO> outputList = new ArrayList<>();
		
		for (Student s : students) {
			
			AdminStudentResponseDTO obj = new AdminStudentResponseDTO(s.getStudentName(), s.getStudentId(), s.getDepartment(), s.getMarks());
			outputList.add(obj);
			
		}
		
		return outputList;
		
	}
	
}
