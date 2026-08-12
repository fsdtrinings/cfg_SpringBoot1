package edu.abc.test.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.abc.test.entity.Course;
import edu.abc.test.entity.Student;

@Repository
public interface ICourseRepository extends JpaRepository<Course, String> {

	
	public List<Course> findByCategory(String category);
}
