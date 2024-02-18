package com.kush.objectsorting;

import java.util.Collections;
import java.util.List;
import java.util.TreeSet;
/*
The Comparable interface is implemented by a class to define a natural ordering of its instances.
It contains a single method compareTo(), which is used to compare the current object with another object.
The compareTo() method returns a negative integer, zero, or a positive integer if the current object is less than, equal to, or greater than the specified object, respectively.
Implementing Comparable allows objects of that class to be automatically sorted using methods like Collections.sort() or Arrays.sort().

// with comparable we can write only default sorting technique.
// here we are sorting based on marks. what if we want to sort on id ?
 */
class Student implements Comparable<Student>{
	private int id;
	private int marks;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Student(int id, int marks, String name) {
		super();
		this.id = id;
		this.marks = marks;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", marks=" + marks + ", name=" + name + "]";
	}
	@Override
	public int compareTo(Student o) {
		return this.marks-o.marks;
	}	
}
/*
 * When to use what ? 

> Use Comparable when you want to define the natural ordering of objects within the class itself.
 
> Use Comparator when you want to define different ways of comparing objects or when you can't
modify the class whose objects you want to compare. It's useful for implementing sorting in 
various contexts or for sorting objects based on multiple criteria.
*/

public class ComparableExample{
	public static void main(String[] args) {
		List<Student> list=StudentUtil.getStudents();
	
		list.forEach(s-> System.out.println(s));
		
		Collections.sort(list);
		
		list.forEach(s-> System.out.println(s));
		
		//If our class implemets comparable then we can use that data is treeset.
		TreeSet<Student> ts=new TreeSet<>();
		list.forEach(s-> ts.add(s));
		
		for(Student s: ts)
			System.out.println("ts"+s);
		
	}	
}
