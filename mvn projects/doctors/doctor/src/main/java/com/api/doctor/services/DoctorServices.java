package com.api.doctor.services;

import java.util.ArrayList;
import java.util.List;

import com.api.doctor.model.Doctor;

public class DoctorServices {
	
	public void saveDoctor() {
		List<Doctor> doctorList= new ArrayList<Doctor>();
		Doctor doctor = new Doctor();
		doctor.setId(1);
		doctor.setName("Muhammad Mubeen");
		doctorList.add(doctor);
		
		Doctor doctor2 = new Doctor();
		doctor2.setId(2);
		doctor2.setName("Adnan");
		doctorList.add(doctor2);
		
		Doctor doctor3 = new Doctor();
		doctor3.setId(3);
		doctor3.setName("Ali");
		doctorList.add(doctor3);
		
		showList(doctorList);
	}
	
	public void showList(List<Doctor> doctorList) {
		for(Doctor doctor: doctorList) {
			System.out.println("ID : " + doctor.getId());
			System.out.println("Name : " + doctor.getName());
		}
	}
}
