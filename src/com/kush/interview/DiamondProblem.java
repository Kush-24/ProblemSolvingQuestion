package com.kush.interview;

class First{
	void show() {
		System.out.println("Showing from first");
	}
}
class Second{
	void show() {
		System.out.println("Showing from second");
	}
}
// class Third extends First,Second {} not possible
// In this problem Diamond class can't extends both First & second classes
//bcz compiler get confused which show() should call(Ambiguity)

interface I1{
	void one(); // by default its public abstract
}

interface I2{
	public abstract void one();
}
// With interface its resolved bcz interfaces just declare methods not define them.
// so we can overide that show() in our class and call it.
public class DiamondProblem implements I1,I2{
	public static void main(String[] args) {
		DiamondProblem dp=new DiamondProblem();
		dp.one();
	}
	@Override
	public void one() {
		System.out.println("Diamond problem resolved");
	}

}
