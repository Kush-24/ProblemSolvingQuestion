package com.kush.multithreading.threadcall;

public class ThreadCallTechnique1 {

	// here we are calling the same thread two times.
	public static void main(String[] args) {
		System.out.println("Main thread starts here..");
		new FirstTask();
		Thread t=new FirstTask();
		System.out.println("Main thread ends here..");
	}

}

class FirstTask extends Thread {
	public static int count=0;
	public int id;

	@Override
	public void run() {
		for (int i = 10; i >= 1; i--) {
			System.out.println("<"+id+"> Tic- tic " + i);
			try {
				sleep(250);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public FirstTask() {
		this.id=++count;
		this.start();
	}
}