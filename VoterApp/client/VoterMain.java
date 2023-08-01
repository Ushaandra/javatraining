package com.voterapp.client;

import java.util.Scanner;

import com.voterapp.exception.InvalidVoterException;
import com.voterapp.service.ElectionBoothImpl;
import com.voterapp.service.IElectionBooth;

public class VoterMain {

	public static void main(String[] args) {
		Scanner voter=new Scanner(System.in);
		System.out.println("Enter age: ");
		int age=voter.nextInt();
		System.out.println("Locality: ");
		String locality=voter.next();
		System.out.println("Voter Id: ");
		int voterId=voter.nextInt();
		
		IElectionBooth electionBooth=new ElectionBoothImpl();
		
		try {
			if(electionBooth.checkEligibility(age, locality, voterId)) {
				System.out.println("Eligible for voting!!");
			}
		}
		catch(InvalidVoterException e) {
			System.out.println("Try using valid Credentials!!!");
			System.out.println(e.getMessage());
			
		}
		finally {
			System.out.println("Done...");
		}
	}

}
