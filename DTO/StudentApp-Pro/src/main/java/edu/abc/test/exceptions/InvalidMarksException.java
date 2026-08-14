package edu.abc.test.exceptions;

import java.nio.InvalidMarkException;

public class InvalidMarksException extends InvalidMarkException{

	int marks;

	public InvalidMarksException(int marks) {
		super();
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "InvalidMarksException [marks=" + marks + "] are invalid !!! Check with Teacher ";
	}
	
	
}
