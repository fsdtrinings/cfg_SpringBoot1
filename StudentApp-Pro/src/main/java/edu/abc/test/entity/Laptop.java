package edu.abc.test.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Laptop {

	@Id
	private int serialNumber;

	private String brandName;
	private LocalDate expiryDate;
	private String configurations;
	
	
	@OneToOne(mappedBy = "laptop")
	private Student student;

}
