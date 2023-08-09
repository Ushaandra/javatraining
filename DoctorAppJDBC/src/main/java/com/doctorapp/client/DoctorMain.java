package com.doctorapp.client;

import java.util.ArrayList;
import java.util.List;

import com.doctorapp.dao.DBConnection;
import com.doctorapp.model.Doctor;
import com.doctorapp.service.DoctorServiceImpl;
import com.doctorapp.service.IDoctorService;

public class DoctorMain {
	public static void main(String[] args) {
//		DBConnection dbConnection=new DBConnection();
//        dbConnection.openConnection();
		IDoctorService doctorService=new DoctorServiceImpl();
//		Doctor doctor=new Doctor("Vijay","Ortho",12,3000);
//		doctorService.addDoctor(doctor);
//		doctorService.addDoctor(new Doctor("John","pediat",10,2500));
//		doctorService.addDoctor(new Doctor("Ram","Gynic",15,3000));
//		doctorService.addDoctor(new Doctor("Varun","veternary",12,1500));
//		doctorService.addDoctor(new Doctor("Clara","Ortho",15,4000));
		
		doctorService.updateDoctor(6, 4000);
//		doctorService.deleteDoctor(1);
		List<Doctor> doctors=doctorService.getallDoctors();
		doctors.forEach(System.out::println);
		System.out.println();
		
		doctors=doctorService.getBySpeciality("Ortho");
		doctors.forEach(System.out::println);
		System.out.println();
		
		doctors=doctorService.getBySpecialityAndFees("Ortho", 3000);
		doctors.forEach(System.out::println);
	}
}
