package com.kush.interview;

 interface InterfaceExample {
	int a = 90; //need to assign
	static int b = 8;
	final int c = 78;

	void display();

	abstract void first();

	public default void show() {
		System.out.println("hello");
	}

	public static void print() {
		System.out.println("static allow after 1.8 ");
	}

	/*
	 * public void normalMethod() { System.out.println("normal method"); }
	 */

	// InterfaceExample(){} constructor not allowed

}

public class InterfaceEx implements InterfaceExample{

	public static void main(String[] args) {
		InterfaceEx obj=new InterfaceEx();
		obj.display();
		obj.first();
		System.out.println(obj.a + " "+obj.b+ " "+obj.c);

	}

	@Override
	public void display() {
		System.out.println("non abstract display");
	}

	@Override
	public void first() {
		System.out.println("abstract method implementation:");
	}

}
