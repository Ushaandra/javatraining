package com.voterapp.service;

import com.voterapp.exception.InvalidVoterException;
import com.voterapp.exception.LocalityNotFoundException;
import com.voterapp.exception.NoVoterIdException;
import com.voterapp.exception.UnderAgeException;

public class ElectionBoothImpl implements IElectionBooth{
	
	private boolean checkAge(int age) throws UnderAgeException {
		if(age < 18)
			throw new UnderAgeException("Under age...");
		return true;
	}
	
	private boolean checkLocality(String locality) throws LocalityNotFoundException{
		String[] localities= {"anantapur","kadapa","kurnool"};
		for(String local:localities) {
			if(locality.equalsIgnoreCase(local)) {
				return true;
			}
		}
		throw new LocalityNotFoundException("Locality not found");	
	}
	
	private boolean checkVoterId(int voterId) throws NoVoterIdException {
		if(voterId>=1000 && voterId<=9999) {
			return true;
		}
		throw new NoVoterIdException("No voterId matched");
	}
	
	
	@Override
	public boolean checkEligibility(int age, String locality, int voterId) throws InvalidVoterException {
		try {
			if(checkAge(age)) {
				if(checkLocality(locality)) {
					if(checkVoterId(voterId)) {
						return true;
					}
				}
			}
		}
		catch(UnderAgeException e) {
			System.out.println(e.getMessage());
		}
		catch(LocalityNotFoundException e) {
			System.out.println(e.getMessage());
		}
		catch(NoVoterIdException e) {
			System.out.println(e.getMessage());
		}
		return false;
	}
	

}
