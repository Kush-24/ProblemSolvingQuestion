package com.kush.java8;


interface Interface{
	default void one() {
		System.out.println("I1 default method..");
	}
	default boolean hello(String a) {
		System.out.println(a+" ");
		return true;
	}
	static void staticMethod() {
		System.out.println("static..");
	}
	/*
    A default method cannot override a method from java.lang.Object
	default boolean equals(Object obj) {
		return true;
	} */
}
class A{
	// If one() is not public.
	//The inherited method A.one() cannot hide the public abstract method in Interface
	public void one(){
		System.out.println("method in A class..");
	}
}
public class Scenerio2 extends A implements Interface{
// In this class we have 2 definition of one(). 1st in interface & 2nd in A class.
// So compiler will give preference to class method.
	public static void main(String[] args) {
		Scenerio2 obj=new Scenerio2();
		obj.one();
		obj.hello("We can use this..");
		Interface.staticMethod(); // obj.staticMethod();
	}
}
