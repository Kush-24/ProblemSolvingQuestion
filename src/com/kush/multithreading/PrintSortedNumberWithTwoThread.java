package com.kush.multithreading;
/*
 * In this program first I will print all the values from thread1 then thread2 will start and start working. 
 * So until thread1 will not complete its task thread2 need to wait. 
 */

class Thread1 implements Runnable {
	@Override
	public void run() {
		for (int i = 1; i < 20; i = i + 2) {
			System.out.println(i);
		}
	}
}

class Thread2 implements Runnable {
	Thread tobj; // its thread

	public Thread2(Thread t1) {
		this.tobj = t1;
	}

	@Override
	public void run() {
		try {
			tobj.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		for (int i = 2; i < 20; i = i + 2) {
			System.out.println(i);
		}

	}
}

public class PrintSortedNumberWithTwoThread {
	public static void main(String[] args) {
		Thread t1 = new Thread(new Thread1());
		// Thread t2=new Thread(new Thread2(new Thread()));It will not work as new thread() i m passing
		Thread t2 = new Thread(new Thread2(t1));
		t2.start();
		t1.start();

		/*
		 * Similarly we can acquire the lock for some Object which we can keep in both the threads.
		   Object lock = new Object();
		   Thread t1 = new Thread(newThread1(lock)); 
		   Thread t2 = new Thread(new Thread2(lock));
		   t2.start();
		  t1.start();
		 */
	}
}
