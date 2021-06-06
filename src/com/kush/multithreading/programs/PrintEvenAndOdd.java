package com.kush.multithreading.programs;

class NumbersGenerator1 {
	 
	private int number = 1;
	private int numberOfThreads;
	private int totalNumbersInSequence;
	
	public NumbersGenerator1(int numberOfThreads, int totalNumbersInSequence) {
		super();
		this.numberOfThreads = numberOfThreads;
		this.totalNumbersInSequence = totalNumbersInSequence;
	}
	
	public void printNumbers(int result) {
		synchronized (this) {
			while (number < totalNumbersInSequence) {
				while (number % numberOfThreads != result) {
					try {
						wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				
				System.out.println(Thread.currentThread().getName()+" "+number++);
				notify();
			}
		}
	}
}

class SequenceGeneratorTask1 implements Runnable {
	 
	private NumbersGenerator1 numbersGenerator;
	private int result;
	
	public SequenceGeneratorTask1(NumbersGenerator1 numbersGenerator, int result) {
		super();
		this.numbersGenerator = numbersGenerator;
		this.result = result;
	}
 
	@Override
	public void run() {
		numbersGenerator.printNumbers(result);
	}
 
}
public class PrintEvenAndOdd {
	private static final int TOTAL_NUMBER_IN_SEQUENCE = 20;
	private static final int TOTAL_NUMBER_OF_THREADS = 2;
	
	public static void main(String[] args) {
		
		NumbersGenerator1 numbersGenerator = new NumbersGenerator1(TOTAL_NUMBER_OF_THREADS, TOTAL_NUMBER_IN_SEQUENCE);
		
		//Created three Threads
		Thread t1 = new Thread(new SequenceGeneratorTask1(numbersGenerator, 1), "Thread-1");
		Thread t2 = new Thread(new SequenceGeneratorTask1(numbersGenerator, 0), "Thread-2");
		
		//Start all three threads
		t1.start();
		t2.start();

	}

}
