package com.kush.interview;

/*  DIAMOND PROBLEM:
 * While using multiple inheritance with interfaces in Java when a class implements multiple interfaces, 
 * and these interfaces declare methods with the same signature but different default implementations. 
 * This can lead to ambiguity as to which implementation should be used by the implementing class.
 */

class First{
	void show() {
		System.out.println("Showing from first");
	}
}
class Second{
	void show() {
		System.out.println("Showing from second");
	}
}
/*
Class Third extends First,Second {} not possible
In this problem Diamond class can't extends both First & second classes
because compiler get confused which show() should call(Ambiguity)
*/

interface I1{
	void one(); // by default its public abstract
}

interface I2{
	public abstract void one();
}

// With interface its resolved bcz interfaces just declare methods not define them.
// so we can overide that show() in our class and call it.

public class DiamondProblem implements I1,I2{
	public static void main(String[] args) {
		DiamondProblem dp=new DiamondProblem();
		dp.one();
	}
	@Override
	public void one() {
		System.out.println("Diamond problem resolved");
	}

}


//As java 8 has default methods in interfaces

interface InterfaceA {
    default void display() {
        System.out.println("InterfaceA");
    }
}

interface InterfaceB {
    default void display() {
        System.out.println("InterfaceB");
    }
}

//Without overriding the display() it will make the issue
// Compiler error: Class inherits unrelated defaults for display() from types InterfaceA and InterfaceB
class MyClass implements InterfaceA, InterfaceB {
	@Override
	public void display() {
		InterfaceA.super.display();
	}
}

