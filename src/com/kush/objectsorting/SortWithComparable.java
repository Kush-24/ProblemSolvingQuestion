package com.kush.objectsorting;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class SortWithComparable {
//Sort an Employee Object list first by salary and if salaries are equal,
// then by name if duplicates.
	public static void main(String[] args) {
		List<Student1> list = new ArrayList<>();
        list.add(new Student1(1, 98, "kush"));
        list.add(new Student1(2, 98, "john"));
        list.add(new Student1(3, 95, "alice"));
        list.add(new Student1(4, 95, "bob"));

        Collections.sort(list);

        for (Student1 student : list) {
            System.out.println(student.getId() + ": " + student.getSalary() + " - " + student.getName());
        }
	}

}


class Student1 implements Comparable<Student1> {
    private int id;
    private int salary;
    private String name;

    public Student1(int id, int salary, String name) {
        this.id = id;
        this.salary = salary;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Student1 other) {
        // First, compare by salary
        int salaryComparison = Integer.compare(this.salary, other.salary);
        if (salaryComparison != 0) {
            return salaryComparison;
        }
        // If salaries are equal, compare by name
        return this.name.compareTo(other.name);
    }
}