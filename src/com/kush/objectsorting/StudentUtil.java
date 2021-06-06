package com.kush.objectsorting;

import java.util.ArrayList;
import java.util.List;

public class StudentUtil {
	public static List<Student> getStudents(){
		List<Student> list=new ArrayList<>();
		list.add(new Student(1, 98, "kush"));
		list.add(new Student(3, 89, "mukul"));
		list.add(new Student(2, 45, "rahul"));
		
		list.add(new Student(56, 23, "rajat"));
		return list;
	}
}
