package com.kush.equals;

 class Student1{
	private int id;
	private String name;
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
	public Student1(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	/*
	 * We consider that two students are equal if they have the same ID, 
	 * so we override the equals() method and provide our own implementation as the following:
	 */
	@Override
	public boolean equals(Object obj) {
	 if(obj==null) return false;
	 // if obj is not a object of student class.
	 if(!(obj instanceof Student1)) return false;
	 // if we check for same object.
	 if(this==obj) return true;
	 
	 if(this.getId() == ((Student1) obj).getId())
		 return true;
	 else
		return false;
		
	}
}
public class OveridingHashcode {
	public static void main(String[] args) {
		Student1 s1=new Student1(100,"sandy");
		Student1 s2=new Student1(100,"sandy");
		
		System.out.println(" s1 & s2  "+s1.hashCode()+" "+s2.hashCode());
		
		System.out.println("s1 & s2 equals or not :"+s1.equals(s2));
	}	
}
