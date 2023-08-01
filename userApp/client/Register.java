package com.userapp.client;

import java.util.Scanner;

import com.userapp.exception.NameExistsException;
import com.userapp.exception.TooLongException;
import com.userapp.exception.TooShortException;
import com.userapp.service.IValidationService;
import com.userapp.service.ValidationServiceImpl;

public class Register {

	public static void main(String[] args) throws TooShortException,TooLongException {
		Scanner registerDetails=new Scanner(System.in);
		System.out.println("Enter user name:");
		String username=registerDetails.next();
		
		
		IValidationService validate=new ValidationServiceImpl();
		try {
			validate.validateUsername(username);
			System.out.println("password:");
			String password=registerDetails.next();
			if(validate.validatePassword(password)) {
				System.out.println("Welcome user");
				System.out.println("Registered successfully");
			}
		}
		catch(NameExistsException e){
			System.out.println(e.getMessage());
		}
		catch(TooLongException e) {
			System.out.println(e.getMessage());
		}
		catch(TooShortException e) {
			System.out.println(e.getMessage());
		}
		catch(Exception e) {
			System.out.println("Try again");
		}
		finally {
			System.out.println("Closing....");
		}
		
			
		
		
	}

}
