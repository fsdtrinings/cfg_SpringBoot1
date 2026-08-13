package edu.abc.test.entity;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.CascadeType;
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
	
	
	@OneToOne(mappedBy = "laptop",cascade = CascadeType.ALL)
	@JsonBackReference // ignore bi-driectional looping issue in one to one
	private Student student;

}
