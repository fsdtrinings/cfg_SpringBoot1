package edu.abc.test.exceptions;

public class UserNotFoundException extends Exception
{
	
	int id;

	public UserNotFoundException(int id) {
		super();
		this.id = id;
	}

	@Override
	public String toString() {
		return "UserNotFoundException [id=" + id + "] Invalid !!! ";
	}
	
	

}
