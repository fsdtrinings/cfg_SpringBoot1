package edu.abc.test.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import edu.abc.test.entity.Student;

@Repository
public interface IStudentRepository extends JpaRepository<Student, Integer>
{


	
}



