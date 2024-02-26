package com.kush.wc;
public class Main2 {
/* 
In Java, when you pass an object, including instances of the Integer wrapper class, 
to a method, you are passing the reference to the object, not the object itself. 
However, Java is always pass-by-value. This can be a bit confusing, 
but it means that a copy of the reference is passed, not a copy of the object.

So, when you pass an Integer object to a method, you are passing the reference to that object by value.
This means that changes made to the object itself (like modifying its properties) will affect 
the original object outside of the method, but reassigning the reference to a new object within
the method will not affect the original reference outside of the method.
*/
public static void main(String[] args) {
	Integer num = 10;
	System.out.println("Before method call: " + num);
	modifyInteger(num);
	System.out.println("After method call: " + num);
}

public static void modifyInteger(Integer number) {
	// This will not affect the original Integer object outside the method
	// We're just assigning a new Integer object to the local variable 'number'
	number = number + 5;
	System.out.println("Inside method: " + number);
}
}
