package com.kush.multithreading.threadcall;

import java.util.concurrent.TimeUnit;

public class ThreadCallTechnique3 {

	public static void main(String[] args) {
		System.out.println("Main thread starts here..");
		new ThirdTask();
		new ThirdTask();
		System.out.println("Main thread ends here..");
	}

}

class ThirdTask implements Runnable{
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

	public ThirdTask() {
		this.id=++count;
		new Thread(this).start();
	}
}