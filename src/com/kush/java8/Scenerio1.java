package com.kush.java8;

interface I1{
	default void one() {
		System.out.println("I1 default method..");
	}
}

interface I2{
	void show();
	default void one() {
		System.out.println("I2 default method..");
	}
}
// Now in java8 again we have default(){} in interfaces so it create diamond problem.
// jvm get confused which meth should call so to overcome this we need to overide that 
// common meth. which is present in both interfaces.

public class Scenerio1 implements I1,I2{
	public static void main(String[] args) {
		Scenerio1 in=new Scenerio1();
		in.one();
	}

	@Override
	public void show() {
		System.out.println("My own implentation..");
	}
	@Override
	public void one() {
		I1.super.one();
		I2.super.one();
	}
}
