package edu.abc.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.abc.test.entity.Laptop;

@Repository
public interface ILaptopRepository extends JpaRepository<Laptop, Integer>
{

	
}
