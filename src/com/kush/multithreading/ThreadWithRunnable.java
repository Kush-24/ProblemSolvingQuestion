package com.kush.multithreading;
/* Runnable interface:
 * runnable class only have one method run().
 * so for calling thread we need to make a obj of Thread class
 * and linked our class with Thread obj.
*/
class One implements Runnable{
	public void run() {
		System.out.println("calling one method..");
	}
}
class Two implements Runnable{
	public void run() {
		System.out.println("calling two method..");
	}
	
}
public class ThreadWithRunnable {
	
	public static void main(String[] args) {
		One one=new One();
		Two two=new Two();
		
		Thread t1=new Thread(one);
		Thread t2=new Thread(two);	
		
		t1.start();
		t2.start();
	}
}
