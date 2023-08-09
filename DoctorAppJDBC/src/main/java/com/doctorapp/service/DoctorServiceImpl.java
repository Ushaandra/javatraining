package com.doctorapp.service;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.doctorapp.dao.DoctorDaoImpl;
import com.doctorapp.dao.IDoctorDao;
import com.doctorapp.exceptions.DoctorNotFoundException;
import com.doctorapp.model.Doctor;

public class DoctorServiceImpl implements IDoctorService{
	
	IDoctorDao doctorDao=new DoctorDaoImpl();

	@Override
	public void addDoctor(Doctor doctor) {
		doctorDao.addDoctor(doctor);
	}

	

	@Override
	public Doctor getById(int doctorId) {
		Doctor doctor=doctorDao.findById(doctorId);
		if(doctor==null)
			throw new DoctorNotFoundException();
		return doctor;
	}
	
	@Override
	public void updateDoctor(int doctorId, double fees) {
		doctorDao.updateDoctor(doctorId, fees);
	}

	@Override
	public void deleteDoctor(int doctorId) {
		doctorDao.deleteDoctor(doctorId);
	}

	@Override
	public List<Doctor> getallDoctors() {
		return doctorDao.findallDoctors();
	}
	
	


	@Override
	public List<Doctor> getBySpeciality(String Speciality) throws DoctorNotFoundException {
		List<Doctor> doctorlist=doctorDao.findBySpeciality(Speciality);
		if(doctorlist.size()==0) {
			throw new DoctorNotFoundException();
		}
		return doctorlist.stream().collect(Collectors.toList());
	}

	@Override
	public List<Doctor> getBySpecialityAndExp(String Speciality, int experience) throws DoctorNotFoundException {
		List<Doctor> doctorlist=doctorDao.findBySpecialityAndExp(Speciality, experience);
		if(doctorlist.size()==0)
			throw new DoctorNotFoundException();
		return doctorlist.stream().collect(Collectors.toList());
	}

	@Override
	public List<Doctor> getBySpecialityAndFees(String Speciality, double fees) throws DoctorNotFoundException {
		List<Doctor> doctorlist=doctorDao.findBySpecialityAndFees(Speciality, fees);
		if(doctorlist.size()==0)
			throw new DoctorNotFoundException();
		return doctorlist;
	}



	
}
