package com.kush.multithreading;

class Counter{
     int counter;
   
//	public void increment() {
//		counter++;
//	}
    // So 1 thread call it at a time. Now it's thread safe.
    // when we use wait() of Object class Method must be synchronized.
	public synchronized void increment() {
		counter++;
	}
}

public class SyncDemo {
	public static void main(String[] args) throws InterruptedException{
		Counter c=new Counter();
		// for printing main thread 
		System.out.println(" Main :"+Thread.currentThread());
		
		Thread t1=new Thread(new Runnable() {
			public void run() {
			System.out.println("Inside t1");
				for(int i=0;i<20;i++)
				{
					c.increment();
					System.out.println(c.counter+" "+"inside thread 1");
				}
			}
		});
		
		Thread t2=new Thread(new Runnable() {

			public void run() {
				System.out.println("Inside t2");
				for(int i=0;i<20;i++)
				{
					c.increment();
				 System.out.println(c.counter+" "+"inside thread 2");
				}
			}
			
		});
		t1.start();
		// t1.run(); behave like a normal method.
		t2.start();
		
		//t1.join();
		//t2.join();
		
		System.out.println(" Count : "+c.counter);

	}

}
