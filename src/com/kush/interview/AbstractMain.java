package com.kush.interview;

abstract class AbstractClass {
// we can write main method inside the abstract class bcz static method don't need 
//	to object creation for calling them. and main is static .
	public void show() {
		System.out.println("Show");
	}
	abstract void show2();
	
	public static void one() {
		System.out.println("One...");
	}
	public AbstractClass(){
		System.out.println("abstract contructor..");
		// Abstract class can contain constructor
		//1.The main purpose of the constructor is to initialize the newly created object.
		//2.it is used for super calls for initialization events common to all the subclasses.
		//3.Also, even if we don’t provide any const the compiler will add default const.
		//4.An abstract class can be inherited by any number of sub-classes,
		//thus functionality of constructor present in abstract class can be used by them.
	}
	/*
	public static void main(String[] args) {
		System.out.println("Main method");
		AbstractClass.one(); // printing static meth
	}*/
}

public class AbstractMain extends AbstractClass{
	public AbstractMain() {
		//super(); for calling abstract contructor content.
		System.out.println("kush constructor..");
	}
	public static void main(String[] args) {
		AbstractMain k=new AbstractMain();
		k.show();
		k.show2();
		
	}

	@Override
	void show2() {
		System.out.println("Overriding show2 method..");
	}
}