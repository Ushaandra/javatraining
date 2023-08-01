package com.lumen.overload;

public class Employee {
	String EmpName;
	String Designation;
	public Employee(String empName, String designation) {
		EmpName = empName;
		Designation = designation;
	}
	double CalcBonus(double basicAllowance) {
		return(basicAllowance);

	}
	double CalcBonus(double basicAllowance,double carAllowance) {
		return(basicAllowance+carAllowance);
	}
	double CalcBonus(double basicAllowance,double carAllowance,double houseAllowance) {
		return(basicAllowance+carAllowance+houseAllowance);
	}

}
