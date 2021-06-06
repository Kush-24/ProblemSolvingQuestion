package com.kush.multithreading;

class T1 implements Runnable{
	String thread_name;
	Thread t1;
	public T1(String str) {
		thread_name=str;
		t1=new Thread(this, thread_name);
		System.out.println("Just created thread "+t1);
		t1.start();
	}
	@Override
	public void run() {
		System.out.println("Inside T1 run "+t1);
	}
	
}

class T2 implements Runnable{
	String thread_name;
   Thread t2;
   
   public T2(String s) {
	   thread_name=s;
	   t2=new Thread(this,thread_name);
	   System.out.print("thread created "+t2);
	   t2.start();
   }
@Override
public void run() {
	System.out.println("Inside T2 run "+t2);
}
	
	
}
public class MultipleThread {
	public static void main(String[] args) {
		new T1("First Thread");
		new T2("SEcond thread");
	}
}
