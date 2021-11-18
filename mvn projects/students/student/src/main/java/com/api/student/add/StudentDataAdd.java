package com.api.student.add;

import java.util.ArrayList;
import java.util.List;

import com.api.student.data.StudentData;

public class StudentDataAdd {
	public void saveStudent() {
//		StudentData stdData = new StudentData();
//		
//		stdData.setId(1);
//		stdData.setName("Mubeen");
//		System.out.println("Id :" + stdData.getId());
//		System.out.println("Name :" + stdData.getName());
		
		List<StudentData> studentList = new ArrayList<StudentData>();
		StudentData stdData = new StudentData();
		stdData.setId(1);
		stdData.setName("Mubeen");
		studentList.add(stdData);
		
		StudentData stdData2 = new StudentData();
		stdData2.setId(2);
		stdData2.setName("Waqar");
		studentList.add(stdData2);
		
		StudentData stdData3 = new StudentData();
		stdData3.setId(3);
		stdData3.setName("Mubeen");
		studentList.add(stdData3);
		
		showStudentList(studentList);
	}
	public void showStudentList(List<StudentData> studentList) {
		for(StudentData stdData: studentList ) {
			System.out.println("ID : " + stdData.getId());
			System.out.println("Name : " + stdData.getName());
		}
	}
}
