package com.lumen.scan;

import java.util.Scanner;

public class Registration {

	public static void main(String[] args) {
		String[] username= {"usha","suma","vahathi","venu","lokesh"};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter username:");
		String name=sc.next();
		
		boolean flag=true;
		for(String i:username) {
			if(i.equals(name)) {
				flag=false;
				System.out.println("Name is not unique");
			}
			
		}
		if(flag)
			System.out.println("You are registered");

	}

}
