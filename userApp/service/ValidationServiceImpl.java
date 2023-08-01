package com.userapp.service;

import com.userapp.exception.NameExistsException;
import com.userapp.exception.TooLongException;
import com.userapp.exception.TooShortException;

public class ValidationServiceImpl implements IValidationService{

	@Override
	public boolean validateUsername(String username) throws NameExistsException {
		String[] usernames= {"usha","suma","vahathi","venu","lokesh"};
		for(String name:usernames) {
			if(name.equalsIgnoreCase(username)) {
				throw new NameExistsException("Name already exists");
			}
		}
		return true;
	}

	@Override
	public boolean validatePassword(String password) throws TooLongException,TooShortException {
		if(password.length()<6)
			throw new TooShortException("Password is too short");
		else if(password.length()>15)
			throw new TooLongException("password is too long");
		return true;
	}

}
