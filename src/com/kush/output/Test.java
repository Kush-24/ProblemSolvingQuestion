package com.kush.output;

public class Test {
public static void main(String[] args) {
	Sum sum=new Sum();
	sum.math(12,30);
	System.out.println("x"+sum.x+"  y"+sum.y);
	
	sum.testInteger();
	sum.string();
	sum.shadowing();
}
}

 class Sum{
	public int x = 100;
	public int y;

	void math(int a,int b) {
		x=a*4;
		y=b;
	}
	
	void testInteger() {
		Integer i=34;
		int j=34;
		
		if(i.equals(j))
			System.out.println("true..");
		else
			System.out.println("false..");
	System.out.println("instance variable x is"+this.x);
	}
	
	void string() {
		String a="kushagra";
		String b="kushagra";
		//String b="yadav"; C.E
		String c=new String("kushagra");
		 
		if(a==b)
				System.out.println("true..");
			else
				System.out.println("false..");
		
		if(a==c)
			System.out.println("true..");
		else
			System.out.println("false..");
		
		if(a.equals(c))
			System.out.println("true");
		else 
			System.out.println("false");		
	}
	//If the name of a Local Variable is same as the name of an instance variable,
	//it results in shadowing.
	void shadowing() {
		int x = 0; // we need to initialize the local variable.
		
		System.out.println("shadowing" +x);
	}
}
