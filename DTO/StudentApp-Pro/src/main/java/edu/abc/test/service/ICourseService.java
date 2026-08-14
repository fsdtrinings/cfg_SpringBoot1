package edu.abc.test.service;

import org.springframework.stereotype.Service;

import edu.abc.test.entity.Course;

@Service
public interface ICourseService {

	
	public Course saveCourse(Course course);
	
}
