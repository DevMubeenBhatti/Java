package com.api.student;

import com.api.student.add.StudentDataAdd;

public class StudentApp {
	public static void main(String arg[]) {
		System.out.println("***Student Portal***");
		
		StudentDataAdd stdDataAdd =  new StudentDataAdd();
		stdDataAdd.saveStudent();
	}
}
