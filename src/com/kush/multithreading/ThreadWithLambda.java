package com.kush.multithreading;

public class ThreadWithLambda {
	public static void main(String[] args) {
		/*
		 * class Print implements Runnable{ public void run(){} }
		 */
		// Anonymous classes
		Runnable r1 = new Runnable() {
			@Override
			public void run() {
				System.out.println("printing..");
			}
		};
		Thread t1 = new Thread(r1); // for calling start.
		t1.start();

		// lambda expression remove obj and run method.
		Runnable r2 = () -> {
			System.out.println("printing without run method..");
		};
		Thread t2 = new Thread(r2);
		t2.start();

		// Direct with Thread method lambda expression
		Thread t3 = new Thread(() -> {
			System.out.println("printing thread directly..");
		});
		t3.start();
		
		// we can use this also.
		new Thread(()-> System.out.println("Creating thread..")).start();
		
		// I can do anything with thread.
		new Thread(()-> {
			for(int i=0;i<10;i++)
				System.out.print(" "+i);	
		}).start();
	}
}
