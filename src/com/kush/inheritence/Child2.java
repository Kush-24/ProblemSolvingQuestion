package com.kush.inheritence;

/* Why binding of static, final and private methods is always a static binding? 
     Static binding is better performance wise (no extra overhead is required).
     Compiler knows that all such methods cannot be overridden and will always be accessed by object of local class.
      Hence compiler doesn't have any difficulty to determine object of class (local class for sure).
     That�s the reason binding for such methods is static.
 */

class Parent2{
	public static void show() {
		System.out.println("Parent2 show..");
	}
}

public class Child2 extends Parent2 {
	public static void show() {
		System.out.println("Child2 show..");
	}
	public static void main(String[] args) {
		Parent2 p=new Child2();
		p.show();
		
		Parent2 p1=new Parent2();
		p1.show();
		
		Child2 c=new Child2();
		c.show();
		
	}
	/*
	* This is called Static binding.
	 * We can't overide static,final,private method.
	 * So it all happen in compile time.
*/
}
