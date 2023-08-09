package com.doctorapp.service;

import java.util.List;

import com.doctorapp.exceptions.DoctorNotFoundException;
import com.doctorapp.model.Doctor;

public interface IDoctorService {
	void addDoctor(Doctor doctor);
	
	void updateDoctor(int doctorId,double fees);
	Doctor getById(int doctorId);
	void deleteDoctor(int doctorId);
	List<Doctor> getallDoctors();
	
	List<Doctor> getBySpeciality(String Speciality) throws DoctorNotFoundException;
	List<Doctor> getBySpecialityAndExp(String Speciality,int experience) throws DoctorNotFoundException;
	List<Doctor> getBySpecialityAndFees(String Speciality,double fees) throws DoctorNotFoundException;
}
