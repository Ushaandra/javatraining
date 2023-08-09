package com.doctorapp.util;

public class Queries {
	public static final String CREATEQUERY=
			"create table doctor(doctorName varchar(20),doctorId integer primary key auto_increment,speciality varchar(20),experience int,fees double)";
	
	public static final String UPDATEQUERY=
			"update doctor set fees=? where doctorId=?";
//	public static final String DELETEQUERY=
//			"delete from doctor where doctorId=?";
//	
	public static final String INSERTQUERY=
			"insert into doctor(doctorName,speciality,experience,fees) values(?,?,?,?)";
	
	public static final String DELETEQUERY=
			"delete from doctor where doctorId=?";
	
	public static final String QUERY=
			"select * from doctor";
	
	public static final String QUERYBYID=
			"select * from doctor where doctorId=?";
	
	public static final String QUERYBYSPECIALITY=
			"select * from doctor where speciality like ?";
	
	public static final String QUERYBYSPECIALITYANDEXP=
			"select * from doctor where speciality like ? and experience=?";
	
	
	public static final String QUERYBYSPECIALITYANDFEES=
			"select * from doctor where speciality like ? and fees=?";

}
