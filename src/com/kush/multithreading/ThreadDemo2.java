package com.kush.multithreading;

/* A thread is a thread of execution in a program. The Jvm allows 
 * an application to have multiple threads of execution running concurrently.
 * Here we want to print hi and hello together by using 2 thread
 * 1. extends thread class (throw NullPointerException)
 * 2. implements runnable interface
 * */
class Hi2 extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("Hi..");
			// thread sleep for 500ms
			try{Thread.sleep(500);}
			catch(Exception e) {}
		}
	}
	
}
class Hello2 extends Thread{	
	public void run(){
		for(int i=0;i<5;i++) {
			System.out.println("Hello..");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}


public class ThreadDemo2 {
	// we need to throws bcz we are using hello2 method which throws exception
	// if we use try-catch then we don't need to throws exception
	// But we can't use throws with run() method.
	public static void main(String[] args) throws InterruptedException {
		Hi2 obj=new Hi2();
		Hello2 obj2=new Hello2();
		//obj.run(); It behave like a normal method
		//obj2.run();
		obj.start(); // it is thread function start to invoke run().
		obj2.start();
		
		System.out.println(obj.isAlive());
		
		obj.join(); //Waits for this thread to die. 
		obj2.join();
		
		System.out.println(obj.isAlive());
		
		System.out.println("main print.."); //main thread print it first
	}
	
}
