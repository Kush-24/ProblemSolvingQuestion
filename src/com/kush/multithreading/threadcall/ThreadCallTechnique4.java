package com.kush.multithreading.threadcall;

import java.util.concurrent.TimeUnit;

public class ThreadCallTechnique4 {

	public static void main(String[] args) {
		System.out.println("Main thread starts here..");
		new Thread(new FourthTask()).start();
		
		FourthTask f=new FourthTask();
		Thread t=new Thread(f);
		t.start();
		
		System.out.println("Main thread ends here..");
	}

}

class FourthTask implements Runnable{
	public static int count=0;
	public int id;

	@Override
	public void run() {
		for (int i = 10; i >= 1; i--) {
			System.out.println("<"+id+"> Tic- tic " + i);
			try {
				TimeUnit.MILLISECONDS.sleep(250);	
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public FourthTask() {
		this.id=++count;
	}
}