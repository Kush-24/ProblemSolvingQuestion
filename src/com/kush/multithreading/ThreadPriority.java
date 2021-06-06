package com.kush.multithreading;

class First extends Thread{
	public void run() {
		System.out.println("first.."+Thread.currentThread().getPriority());
	}
}

class Second extends Thread{
	public void run() {
		System.out.println("Second..");
	}
}
public class ThreadPriority {
	public static void main(String[] args) {
		First t1=new First();
		t1.start();
		
		System.out.println("Id: "+t1.getId()+" Name: "+t1.getName()+" Priority: "+t1.getPriority());
		
		t1.setName("first class thread");
		t1.setPriority(Thread.MAX_PRIORITY);
		
		System.out.println("Name "+t1.getName()+ "Priority "+t1.getPriority());
		
		// Thread 2 of class second
		Second t2=new Second();
		t2.start();	
		System.out.println("Id: "+t2.getId()+" Name: "+t2.getName()+" Priority: "+t2.getPriority());
	}

}
