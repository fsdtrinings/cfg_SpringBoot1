package edu.abc.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {

	public HelloController() {
		System.out.println("--- Hello Controller Started ----");
	}
	
	@GetMapping("/hello")
	public String iugghjvhjv()
	{
		return "Hello World";
	}
}


// localhost:7080/api/hello

// www.myabc.com = localhost:7080/api
// www.myabc.com/hello