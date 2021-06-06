package com.kush.inheritence;

/* This is called Dynamic binding.
 * In Dynamic binding compiler doesn’t decide the method to be called. 
 * Overriding is a perfect example of dynamic binding.
 */

class Parent{
	int a=10;
	final int b=100;
	static int d=200;
	
	public void show() {
		System.out.println("Parent1 show..");
	}
}

public class Child1 extends Parent {
	int a=20;
	final int b=110;
	static int d=220;
	public void show() {
		System.out.println("Child1 show..");
	}
	public static void main(String[] args) {
		Parent p=new Child1();
		p.show();
		Child1 c=new Child1();
		c.show();
		System.out.println(p.a+ " "+c.a);
		System.out.println(p.b+ " "+c.b);
		System.out.println(p.d+ " "+c.d);


	}

}
