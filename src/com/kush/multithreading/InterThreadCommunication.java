package com.kush.multithreading;


class Producer extends Thread{
	StringBuffer sb;
   public Producer(){
		sb=new StringBuffer(); 
	 }

   @Override
public void run() {
	synchronized (this.sb) {
		for(char i='a';i<='z';i++) {
			try {
			sb.append(i+" : ");
			Thread.sleep(100);
			System.out.println("appending..");
		} catch (InterruptedException e) {}
		}
		sb.notify(); // sb.notifyAll();// to notify all thread who used sb obj.
		System.out.println("Giving notification to consumer, sb is free now..");
	}
}	
}
 
class Consumer extends Thread{
	Producer prod;
	
	Consumer(Producer prod){
		this.prod=prod;
	}
	
	@Override
	public void run() {
		synchronized (prod.sb) {
			System.out.println(prod.sb); // consuming..
			try {
				System.out.print("waiting for producer object..");
				prod.sb.wait();
			} catch (Exception e) {
				 e.printStackTrace();
			}
		}
	}	
}
public class InterThreadCommunication {

	public static void main(String[] args) {
		Producer prod=new Producer();
		Consumer cons=new Consumer(prod);
		
		prod.start();
		cons.start();
		
		try {
	        prod.join();
	        cons.join();
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
	    System.out.println("Producer and Consumer threads have completed.");
		
	}

}
