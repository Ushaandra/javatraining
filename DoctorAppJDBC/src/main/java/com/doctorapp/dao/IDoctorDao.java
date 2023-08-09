package com.doctorapp.dao;

import java.util.List;

import com.doctorapp.exceptions.DoctorNotFoundException;
import com.doctorapp.model.Doctor;

public interface IDoctorDao {
	void addDoctor(Doctor doctor);
	
	void updateDoctor(int doctorId,double fees);
	Doctor findById(int doctorId);
	void deleteDoctor(int doctorId);
	List<Doctor> findallDoctors();
	
	List<Doctor> findBySpeciality(String Speciality) throws DoctorNotFoundException;
	List<Doctor> findBySpecialityAndExp(String Speciality,int experience) throws DoctorNotFoundException;
	List<Doctor> findBySpecialityAndFees(String Speciality,double fees) throws DoctorNotFoundException;
}
