package com.api.doctor;

import com.api.doctor.services.DoctorServices;

public class DoctorApp {
	public static void main(String arg[]) {
		System.out.println("java main entry file");
		DoctorServices doctor = new DoctorServices();
		doctor.saveDoctor();
	}
}
