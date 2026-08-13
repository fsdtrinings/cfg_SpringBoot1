package edu.abc.test.entity;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Address {

	private String houseDetails;
	private String city;
}
