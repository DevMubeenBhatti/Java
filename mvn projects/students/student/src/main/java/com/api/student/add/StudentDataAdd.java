package com.api.student.add;

import com.api.student.data.StudentData;

public class StudentDataAdd {
	public void saveStudent() {
		StudentData stdData = new StudentData();
		
		stdData.setId(1);
		stdData.setName("Mubeen");
		
		System.out.println("Id :" + stdData.getId());
		System.out.println("Name :" + stdData.getName());
	}
}
