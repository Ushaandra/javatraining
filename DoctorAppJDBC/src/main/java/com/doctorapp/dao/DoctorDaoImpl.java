package com.doctorapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.doctorapp.dao.DBConnection;
import com.doctorapp.exceptions.DoctorNotFoundException;
import com.doctorapp.model.Doctor;
import com.doctorapp.util.Queries;

public class DoctorDaoImpl implements IDoctorDao{

	@Override
	public void addDoctor(Doctor doctor) {
		try (Connection connection=DBConnection.openConnection();
			PreparedStatement statement=connection.prepareStatement(Queries.INSERTQUERY);){
			
			statement.setString(1,doctor.getDoctorName());
			statement.setString(2, doctor.getSpeciality());
			statement.setDouble(3, doctor.getFees());
			statement.setInt(4, doctor.getExperience());
			statement.execute();
			
		} 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void updateDoctor(int doctorId, double fees) {
		try (Connection connection= DBConnection.openConnection();
				PreparedStatement statement=connection.prepareStatement(Queries.UPDATEQUERY);){
			statement.setInt(1,doctorId);
			statement.setDouble(2,fees);
			statement.executeUpdate();
	}
	catch(SQLException e) {
		e.printStackTrace();
	}
	}
		//doctorName, speciality,experience, fees

	@Override
	public Doctor findById(int doctorId) {
		Doctor doctor=new Doctor();
		try(Connection connection=DBConnection.openConnection();
				PreparedStatement statement=connection.prepareStatement(Queries.QUERYBYID);){
			statement.setInt(1, doctorId);
			statement.execute();
			ResultSet rs=statement.executeQuery();
			while(rs.next()) {
				String doctorname=rs.getString("doctorName");
				String spec=rs.getString("speciality");
				int exp=rs.getInt("experience");
				double fee=rs.getDouble("fees");
				doctor.setDoctorName(doctorname);
				doctor.setSpeciality(spec);
				doctor.setExperience(exp);
				doctor.setFees(fee);
			}
				
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		return doctor;
	}

	@Override
	public void deleteDoctor(int doctorId) {
		try(Connection connection=DBConnection.openConnection();
				PreparedStatement statement=connection.prepareStatement(Queries.DELETEQUERY)){
			statement.setInt(1, doctorId);
			statement.executeUpdate();
		} 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public List<Doctor> findallDoctors() {
		List<Doctor> doctorlist=new ArrayList<>();
		try(Connection connection=DBConnection.openConnection();
				PreparedStatement statement=connection.prepareStatement(Queries.QUERY);
						ResultSet rs=statement.executeQuery()){
			while(rs.next()) {
				String name=rs.getString("doctorName");
				int id=rs.getInt("doctorId");
				String spec=rs.getString("speciality");
				int exp=rs.getInt("experience");
				double fees=rs.getDouble("fees");
				Doctor doctor=new Doctor(name,spec,fees,exp);
				doctorlist.add(doctor);
			}
			
		} 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return doctorlist;
	}

	@Override
	public List<Doctor> findBySpeciality(String Speciality) throws DoctorNotFoundException {
		List<Doctor> doctorlist=new ArrayList<>();
		try(Connection connection=DBConnection.openConnection();
				PreparedStatement statement=connection.prepareStatement(Queries.QUERYBYSPECIALITY);){
			statement.setString(1, Speciality);
			statement.execute();
			ResultSet rs=statement.executeQuery();
			while(rs.next()) {
				String name=rs.getString("doctorName");
				String spec=rs.getString("speciality");
				int exp=rs.getInt("experience");
				double fees=rs.getDouble("fees");
				Doctor doctor=new Doctor(name,spec,fees,exp);
				doctorlist.add(doctor);
			}
		} 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return doctorlist;
	}

	@Override
	public List<Doctor> findBySpecialityAndExp(String Speciality, int experience) throws DoctorNotFoundException {
		List<Doctor> doctorlist=new ArrayList<>();
		try(Connection connection=DBConnection.openConnection();
				PreparedStatement statement=connection.prepareStatement(Queries.QUERYBYSPECIALITYANDEXP);){
			statement.setString(1, Speciality);
			statement.setInt(2, experience);
			statement.execute();
			ResultSet rs=statement.executeQuery();
			while(rs.next()) {
				String name=rs.getString("doctorName");
				String spec=rs.getString("speciality");
				int exp=rs.getInt("experience");
				double fees=rs.getDouble("fees");
				Doctor doctor=new Doctor(name,spec,fees,exp);
				doctorlist.add(doctor);
			}
		} 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return doctorlist;
		
	}

	@Override
	public List<Doctor> findBySpecialityAndFees(String Speciality, double fees) throws DoctorNotFoundException {
		List<Doctor> doctorlist=new ArrayList<>();
		try(Connection connection=DBConnection.openConnection();
				PreparedStatement statement=connection.prepareStatement(Queries.QUERYBYSPECIALITYANDFEES);){
			statement.setString(1, Speciality);
			statement.setDouble(2, fees);
			statement.execute();
			ResultSet rs=statement.executeQuery();
			while(rs.next()) {
				String name=rs.getString("doctorName");
				String spec=rs.getString("speciality");
				int exp=rs.getInt("experience");
				double fee=rs.getDouble("fees");
				Doctor doctor=new Doctor(name,spec,fee,exp);
				doctorlist.add(doctor);
			}
		} 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return doctorlist;
	}

}
