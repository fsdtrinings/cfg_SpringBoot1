package edu.abc.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.abc.test.entity.Laptop;
import edu.abc.test.service.ILaptopService;

@RestController
@RequestMapping("cgc/admin/laptop")
public class LaptopAdminController {

	@Autowired
	ILaptopService laptopService;
	
	
	public LaptopAdminController() {
		System.out.println("Laptop Admin Constructor called ");
	}

	@PostMapping("")
	public String createLaptop(@RequestBody Laptop laptop)
	{
		return laptopService.saveLaptop(laptop);
	}
	
	
}
