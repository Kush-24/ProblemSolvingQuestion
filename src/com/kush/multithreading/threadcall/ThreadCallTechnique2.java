package com.kush.multithreading.threadcall;

public class ThreadCallTechnique2 {
// we are not going to start the thread immidiately asa instance of 2nd task created.
	public static void main(String[] args) {
		System.out.println("Main thread starts here..");
		new SecondTask().start();
		Thread t=new SecondTask();
		t.start();
		System.out.println("Main thread ends here..");
	}

}

class SecondTask extends Thread {
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

	public SecondTask() {
		this.id=++count;
	}
}