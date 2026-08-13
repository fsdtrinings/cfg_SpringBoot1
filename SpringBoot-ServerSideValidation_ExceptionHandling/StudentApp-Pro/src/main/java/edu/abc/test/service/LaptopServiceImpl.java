package edu.abc.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.abc.test.entity.Laptop;
import edu.abc.test.repository.ILaptopRepository;

@Service
public class LaptopServiceImpl implements ILaptopService {

	@Autowired
	ILaptopRepository laptopRepository;
	
	@Override
	public String saveLaptop(Laptop laptop) {
		
		Laptop savedLaptop = laptopRepository.save(laptop);
		return "Laptop Saved "+savedLaptop.getSerialNumber();
	}

	@Override
	public Laptop getLaptopByID(int id) 
	{
		// some code
		return laptopRepository.findById(id).get();   // Optional<Laptop>
		
	}

}
