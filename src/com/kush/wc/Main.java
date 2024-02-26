package com.kush.wc;

public class Main {
	/*
	 * If you want to pass a wrapper class object (like Integer) to a method and
	 * modify its value within that method, you can't directly do it because Java
	 * passes objects by value (pass-by-value). However, you can achieve similar
	 * behavior by wrapping the Integer object inside another mutable object, such
	 * as an array or a custom class. Here's an example using an array:
	 */
	public static void main(String[] args) {
		Integer[] num = { 10 }; // Wrap the Integer in an array
		System.out.println("Before method call: " + num[0]);
		modifyInteger(num);
		System.out.println("After method call: " + num[0]);
	}

	public static void modifyInteger(Integer[] number) {
		// Modify the value inside the array
		number[0] += 5;
		System.out.println("Inside method: " + number[0]);
	}
}
