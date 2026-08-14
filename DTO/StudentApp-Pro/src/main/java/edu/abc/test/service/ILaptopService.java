package edu.abc.test.service;

import org.springframework.stereotype.Service;

import edu.abc.test.entity.Laptop;

@Service
public interface ILaptopService {

	public String saveLaptop(Laptop laptop);
	public Laptop getLaptopByID(int id);
	
}
