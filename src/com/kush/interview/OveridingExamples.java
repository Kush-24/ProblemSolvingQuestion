package com.kush.interview;

import java.io.IOException;

class Parent2 {
	public void method() throws IOException {
		System.out.println("parent");
	}
}
/*
The Parent2 class has a method method() that declares it throws an IOException.
The SubClass class extends Parent2 and overrides the method() method. 
Since IOException is a checked exception, the overridden method in the subclass can declare 
that it throws IOException as well. However, it cannot declare that it throws a broader set 
of exceptions than its superclass, which is why the overridden method in SubClass correctly 
throws IOException and not a more general Exception
*/

class SubClass extends Parent2 {
	@Override
	// public void method() throws Exception{
	// we can't increase the throws class in child class as per parent.
	//either it should be same or less in exception class. 
	public void method() throws IOException {
		System.out.println("child");
	}
}

public class OveridingExamples {
	
	public static void main(String[] args) {
		try {
			Parent2 p2 = new SubClass();
			p2.method();

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
		}

		// without catch also we can write. {try-finally}
		try {
			System.out.println("Inside try block");
			int result = 10 / 0; // This will throw an ArithmeticException
			System.out.println("Result: " + result); // This line won't be executed
		} finally {
			System.out.println("Inside finally block");
		}

	}

}
