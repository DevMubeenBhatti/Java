package com.api.doctor.services;

import com.api.doctor.model.Doctor;

public class DoctorServices {
	
	public void saveDoctor() {
		Doctor doctor = new Doctor();
		doctor.setId(1);
		doctor.setName("Muhammad Mubeen");
		
		System.out.println("ID : " + doctor.getId());
		System.out.println("Name : " + doctor.getName());
	}
}
