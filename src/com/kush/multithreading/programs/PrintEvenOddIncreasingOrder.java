package com.kush.multithreading.programs;

public class PrintEvenOddIncreasingOrder {
	int counter=1;
	private static final int LIMIT;
	
	static{
		LIMIT=20;
	}
	
	public void printOdd(){
		 synchronized (this) {
			 // while number in range.
			while(counter < LIMIT) {
			// wait until, we can't print odd value
				while(counter%2==0){
					try {
						wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
		// if we came here it mean we can print odd value
			System.out.println(counter+" "+Thread.currentThread().getName());
		// increment counter
			counter++;
		// notify other thread to run
			notify();
			}
			
		}
	}
	
   public void printEven(){
		synchronized (this) {
			while(counter<LIMIT) {
			// wait until counter value is odd.
				while(counter%2==1) {
					try {
						wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			System.out.println(counter+" "+Thread.currentThread().getName());
			counter++;
			notify();
			}
		}
	}


	public static void main(String[] args) {
		PrintEvenOddIncreasingOrder obj=new PrintEvenOddIncreasingOrder();
  // thread-1 for printing odd numbers
   Thread t1=new Thread(new Runnable() {
	@Override
	public void run() {
	   obj. printOdd();
	}
   },"Thread-1");
   t1.start();
   
   Thread t2=new Thread(new Runnable() {
		@Override
		public void run() {
		obj.printEven();
		}
	   },"Thread-2");
	   t2.start();
	}
}
