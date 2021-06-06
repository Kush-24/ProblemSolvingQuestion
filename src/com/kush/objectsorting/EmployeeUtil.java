package com.kush.objectsorting;

import java.util.ArrayList;
import java.util.List;

public class EmployeeUtil {
	
	public static List<Employee> getEmployeeData() {
		List<Employee> list=new ArrayList<>();
		list.add(new Employee(890, 40000, 52, "rahul"));
		list.add(new Employee(12, 60000, 41, "rajat"));
		list.add(new Employee(34, 40000, 22, "amit"));
		list.add(new Employee(67, 50000, 32, "kushagra"));
		list.add(new Employee(23, 78000, 65, "mukul"));
	
		return list;
	}

}
