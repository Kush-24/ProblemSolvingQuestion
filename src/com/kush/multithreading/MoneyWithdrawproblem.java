package com.kush.multithreading;
/*Here couple have the join account & they both are withdrawing the money from the diff. ATM 
 * Both trans. work on the diff thread and both threads are unaware to each other with cause
 * inconsistency. To avoid it we can use sync method.
 * Note: One try with with sync method
 */
class Account{
	int balance;
	
	public Account() {
		balance=5000;
	}
	public synchronized void withdraw(int amount) {
		System.out.println(Thread.currentThread());
//		try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();}
		balance-=amount;
		System.out.println(+amount+" Amount deducted from ur Account "+
		                   ", Remaining balance : "+balance);
	}
	
//this can make the issue as its not sync with object balance
	public  void deposite(int amount) {
		System.out.println(Thread.currentThread());
		balance+=amount;
		System.out.println(+amount+" Amount Added in ur Account "+
		               ", Current balance : "+balance);
	}
}
class C implements Runnable{
	 Account obj;
	 int wa; // withdraw amount
	public C(Account a,int am){
		obj=a;
		wa=am;
	}

	@Override
	public void run() {
		obj.withdraw(wa);
	}
	
	/*
	Sync Block,make withdraw() without sync 
	and use this code, it'll also work the same.
	@Override
	public void run() {
		synchronized (obj) {
			obj.withdraw(wa);
		}	
	}
	*/
	
	
	
}
class A implements Runnable{
	 Account obj;
	 int wa;
	public A(Account a,int am){
		obj=a;
		wa=am;
	}

	@Override
	public void run() {
		obj.withdraw(wa);
	}
	
}


public class MoneyWithdrawproblem {
	public static void main(String[] args) {
		Account a=new Account();
		 C c=new C(a,400);
		  Thread t=new Thread(c);
		  t.start();
	// t.start(); java.lang.IllegalThreadStateException,can't call thread twice
		  
		new Thread(new A(a,300)).start(); // 2nd thread.
		new Thread(new A(a,300)).start();
		new Thread(new A(a,300)).start();
		//  new Thread(c).start();
		
		Runnable r1=new Runnable() {
			@Override
			public void run() {
				a.withdraw(300);
				a.deposite(1000);
				a.withdraw(1000);
				a.deposite(300);
			}
		};
		new Thread(r1).start();
	}
}
