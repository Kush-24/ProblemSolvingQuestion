package com.kush.interview;

 interface InterfaceExample {
	int a = 90; //need to assign
	static int b = 8;
	final int c = 78;
	public static final Integer var=40; //by default public static final

	void display();

	abstract void first();

	public default void show() {
		System.out.println("hello");
	}

	public static void print() {
		System.out.println("static allow after 1.8 ");
	}

	//Normal methods and constructor is not allowed in interface
	/*
	 * public void normalMethod() { System.out.println("normal method"); }
	 */

	// InterfaceExample(){} constructor not allowed

}

public class InterfaceEx implements InterfaceExample{
	@Override
	public void display() {
		System.out.println("non abstract display");
	}

	@Override
	public void first() {
		System.out.println("abstract method implementation:");
	}
	
	public static void main(String[] args) {
		InterfaceEx obj=new InterfaceEx();
		obj.display();
		obj.first();
		//obj.a=40;obj.b=60;obj.c=80; compilation error
		System.out.println(obj.a + " "+obj.b+ " "+obj.c+" "+obj.var);

	}

}
