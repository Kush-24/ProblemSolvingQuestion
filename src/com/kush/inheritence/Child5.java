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
  
    /*
     *  you cannot overload a method in Java solely by changing the return type. 
     *  Overloading in Java is based on the method signature,
     *   which includes the method name and the parameter types, but not the return type.
        
     * public int show() {
		System.out.println("Child5 show..");
		return 1;
	}*/
	public static void main(String[] args) {
		Parent5 p=new Child5();
		p.show();
		Child5 c=new Child5();
		c.show();
	}

}
