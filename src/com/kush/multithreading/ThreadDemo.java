package com.kush.multithreading;

// Here only one main() thread is working.
class Hi{
	public void show() {
		for(int i=0;i<5;i++) {
			System.out.println("Hi..");
		}
	}
	
}
class Hello{
	public void show() {
		for(int i=0;i<5;i++) {
			System.out.println("Hello..");
		}
	}
}

public class ThreadDemo {
	public static void main(String[] args) {
		Hi obj=new Hi();
		Hello obj2=new Hello();
		obj.show();
		obj2.show();
	}

}
