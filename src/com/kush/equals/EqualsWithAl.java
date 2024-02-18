package com.kush.equals;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

class Student3{
	int id;
	String name;
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
	public Student3(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (this.getClass() != obj.getClass()) return false;
		
		if(this.getId() == ((Student3) obj).getId())
			return true;
		else
			return false;
	}
	// hide this and try.
	@Override 
	public int hashCode() {
		return this.id;
	}
}
public class EqualsWithAl {

	public static void main(String[] args) {
		Student3 alex = new Student3(1, "Alex");
		List<Student3> al = new ArrayList<>();
		al.add(alex);
		al.add(alex);
		al.add(alex); //size =3 (AL can contain duplicate)

		System.out.println("Arraylist size = " + al.size());
		System.out.println("Hashcode of Alex "+alex.hashCode());
		System.out.println("Arraylist contains Alex = " + al.contains(new Student3(1, "Alex")));

		Student3 alex1 = new Student3(1, "Alex");
		Student3 alex2 = new Student3(1, "Alex");
		HashSet<Student3> students = new HashSet<>();
		students.add(alex1);
		students.add(alex2);
		/*
		 * If we will override the hashCode and equals then size will be 1 otherwise 2
		 */

		System.out.println("HashCode of alex1 & alex2 = " + alex1.hashCode() + " " + alex2.hashCode());
		System.out.println("HashSet size = " + students.size());
		System.out.println("HashSet contains Alex = " + students.contains(new Student3(1, "Alex")));

		/*
		 * HashSet stores its elements in memory buckets. Each bucket is linked to a
		 * particular hash code. When calling students.add(alex1), Java stores alex1
		 * inside a bucket and links it to the value of alex1.hashcode(). Now any time
		 * an element with the same hash code is inserted into the set, it will just
		 * replace alex1. However, since alex2 has a different hash code, it will be
		 * stored in a separate bucket and will be considered a totally different
		 * object. Now when HashSet searches for an element inside it, it first
		 * generates the element's hash code and looks for a bucket which corresponds to
		 * this hash code.
		 * @Override public int hashCode() { return id; }
		 */
	}

}
