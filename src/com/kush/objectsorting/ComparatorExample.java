package com.kush.objectsorting;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee{

	public Employee(int empId, int income, int age, String name) {
		super();
		this.empId = empId;
		this.income = income;
		this.age = age;
		this.name = name;
	}

	private int empId;
	private int income;
	private int age;
	private String name;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", income=" + income + ", age=" + age + ", name=" + name + "]";
	}

	public int getIncome() {
		return income;
	}

	public void setIncome(int income) {
		this.income = income;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

class SortBasedonId implements Comparator<Employee> {
	@Override
	public int compare(Employee o1, Employee o2) {
		if(o1.getEmpId() > o2.getEmpId()) 
			return 1;
		else if(o1.getEmpId() < o2.getEmpId())
			return -1;
		else
			return 0;
	}
}

class sortBasedOnAge implements Comparator<Employee> {
	@Override
	public int compare(Employee e1, Employee e2) {
		return e1.getAge() - e2.getAge();
	}
}

/*
class sortBasedOnName implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getName().compareTo(o2.getName());
	}

}*/

public class ComparatorExample {
	static List<Employee> list;
	public static void main(String[] args) {
		System.out.println("sorting based on id");
		list=EmployeeUtil.getEmployeeData();
		Collections.sort(list,new SortBasedonId());
		list.forEach(emp-> System.out.println(emp));
		
		
		System.out.println("sorting based on Age");
		list=EmployeeUtil.getEmployeeData();
		Collections.sort(list, new sortBasedOnAge());
		list.forEach(emp-> System.out.println(emp));
		
		System.out.println("sorting based on name with anonymous & Inner class.");
		list=EmployeeUtil.getEmployeeData();
		Collections.sort(list,new Comparator<>() {
			@Override
			public int compare(Employee o1, Employee o2) {
				return o1.getName().compareTo(o2.getName());
			}
		});
		list.forEach(emp-> System.out.println(emp));
		
		System.out.println("sorting based on income with lambda expression --->");
		
		list=EmployeeUtil.getEmployeeData();
		Collections.sort(list,(a,b)-> a.getIncome() - b.getIncome());
		list.forEach(System.out::println);
		
		
		System.out.println("sorting based on income with method refrence");
		list=EmployeeUtil.getEmployeeData();
		list.sort(Comparator.comparing(Employee::getIncome));
		list.forEach(emp-> System.out.println(emp));
		
		// sorting based on income if same then on name.
		// if amit and sumit both has 40k salary then amit will print first.
		System.out.println("sorting wrt Income and names:");
		list=EmployeeUtil.getEmployeeData();
		list.sort(Comparator.comparing(Employee::getIncome).thenComparing(Employee::getName));
		
		list.forEach(emp-> System.out.println(emp));
		
	}
}
