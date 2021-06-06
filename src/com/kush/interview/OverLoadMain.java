package com.kush.interview;

public class OverLoadMain {
	// We can overload main method.
	public static void main(String[] args) {
		OverLoadMain.main(10);
		OverLoadMain.main("hello from the other side");
		System.out.println("main Jvm..");
	}
	public static void main(int a) {
		System.out.println("main loading meth "+a);
	}
	public static void main(String a) {
		System.out.println(a);
	}
}
