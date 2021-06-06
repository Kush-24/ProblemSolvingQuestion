package com.kush.equals;

class Student{
	private int id;
	private String name;
	private String college;
	public Student(int id, String name, String college) {
		super();
		this.id = id;
		this.name = name;
		this.college = college;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}

}

public class HashCodeEquals {
	public static void main(String[] args) {
		Student s1=new Student(1, "Kushagra", "Ajay kumar garg");
		Student s2=new Student(1, "Kushagra", "Ajay kumar garg");
		
		System.out.println("HashCode s1:"+s1.hashCode());
		System.out.println("Hashcode s2: "+s2.hashCode());
		
		System.out.println(s1.equals(s2));
		/*
		 * Although the two instances have exactly the same attribute values, 
		 * they are stored in different memory locations.(diff hascode values)
		 * Hence, they are not considered equal as per the default implementation of equals().
		 *  The same applies for hashcode() — a random unique code is generated for each instance.
		 */
		
	}
}
