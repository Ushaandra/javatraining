package com.lumen.overload;

import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String name=scanner.nextLine();
		String designation=scanner.next();
		Employee emp=new Employee(name,designation);
		if(emp.Designation.equalsIgnoreCase("Manager")) {
			System.out.println(emp.CalcBonus(1000.0));
		}
		else if(emp.Designation.equalsIgnoreCase("Programmer")) {
			System.out.println(emp.CalcBonus(1000.0, 2000.0));
		}
		else if(emp.Designation.equalsIgnoreCase("Director"))
			System.out.println(emp.CalcBonus(1000.0,2000.0,1500.0));
		scanner.close();
	}

}
