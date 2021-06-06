package com.kush.serializable;
//Serializable is marker interface used in java to give run time object info to jvm.

import java.io.FileInputStream;

//object only transfer in nw if object is serializable.
//It is used to convert the object into the byte streams.

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

class Student implements Serializable {
	private int id;
	private String name;
	private String colName;

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

	public Student(int id, String name, String colName) {
		super();
		this.id = id;
		this.name = name;
		this.colName = colName;
	}

	public String getColName() {
		return colName;
	}

	public void setColName(String colName) {
		this.colName = colName;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", colName=" + colName + "]";
	}
}

public class SerializableClass {
	List<Student> list;

	public SerializableClass() {
		list = new ArrayList<>();
		list.add(new Student(1, "Kushagra", "akgec"));
		list.add(new Student(2, "Sumit", "vit"));
		list.add(new Student(3, "mukul", "nit"));

	}

	void writeObject() throws FileNotFoundException, IOException {
		FileOutputStream fos = new FileOutputStream("C:\\temp\\serialize.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(new Student(34, "Sandy", "Agra college"));
		//oos.writeObject(list);
		oos.flush();
		oos.close();
		fos.close();
	}

	void readObject() throws FileNotFoundException, IOException, ClassNotFoundException {
		FileInputStream fis=new FileInputStream("C:\\temp\\serialize.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Student s=(Student) ois.readObject();
		System.out.println(s);
	}

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		SerializableClass sc = new SerializableClass();
		sc.writeObject();
		sc.readObject();
		System.out.println("Program finished..");
	}
}
