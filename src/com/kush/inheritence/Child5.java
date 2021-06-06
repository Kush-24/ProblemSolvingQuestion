package com.kush.inheritence;


class Parent5{
	  void show() {
		System.out.println("Parent5 show..");
	}
}

public class Child5 extends Parent5 {
	// we can use final in child method call  
	// we cannot reduce the visibility of the inherited method in child but we can increase.
	// here both P & C are abstract if you make Parent method as public it show CE bcz abstact < public
    final void show() {
		System.out.println("Child5 show..");
	}
	public static void main(String[] args) {
		Parent5 p=new Child5();
		p.show();
		Child5 c=new Child5();
		c.show();
	}

}
