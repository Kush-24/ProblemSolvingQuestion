package com.kush.interview;

class ParentClass{
	//JVM creates Single Object for Parent in child Object Creation.
	ParentClass(){
		System.out.println("Parent obj is: "+this);
	}
	
}

public class Child extends ParentClass {
	Child(){
		super();
		System.out.println("Child Obj is:"+this);
	}
	public static void main(String[] args) {
		new Child();
	}

}
