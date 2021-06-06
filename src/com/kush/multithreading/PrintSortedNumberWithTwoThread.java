package com.kush.multithreading;

class Thread1 implements Runnable{
	@Override
	public void run() {
		for(int i=1;i<20;i=i+2) {
			System.out.println(i);
			
		}
		notify();
	}
}

class Thread2 implements Runnable{
	@Override
	public void run() {
		for(int i=2;i<20;i=i+2) {
			System.out.println(i);
		}
		try {
			wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

public class PrintSortedNumberWithTwoThread {
public static void main(String[] args) {
	Thread t1=new Thread(new Thread1());
	t1.start();
	Thread t2=new Thread(new Thread2());
	t2.start();
}
}
