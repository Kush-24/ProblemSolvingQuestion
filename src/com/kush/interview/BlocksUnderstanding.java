package com.kush.interview;

/*
 Static block is used to initializing the static var.
 this block gets executed when the class in the memory.
 class can have multiple static blocks which will execute in the same sequence. */
/*
 * IIB are used to initialize instance variables. IIB are executed before constructor.
 * They run each time when an obj of class is created.
 * 
 */

class Parent{
	static {
		System.out.println("Parent static");
	}
	//Instance initializer block
	{
		System.out.println("Parent IIB");
	}
	Parent(){
		System.out.println("Parent const:");
	}
	Parent(int a){
		System.out.println(a);
	}
}
/*For IIB
 * Jvm copy iib in the constructor
 * child(){
 * super():
 * { Instance initializer block}
 * child statements...
 * }
 * */
public class BlocksUnderstanding extends Parent{
	static {
		System.out.println("child static");
	}
	//Instance initializer block
	{
		System.out.println("Child IIB");
	}
	// Child const call parent cons by default.
	BlocksUnderstanding(){
		//super(); must be in first line. if not, jvm creates it dynamically.
		System.out.println("Child const:");
	}
	public static void main(String[] args) {
		new BlocksUnderstanding();
	}
}

 
