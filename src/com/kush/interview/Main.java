package com.kush.interview;

abstract class Abstract {
	int a;
	static int b=78;
	final int c = 10;

	abstract void show();

	public static void print() {
		System.out.println("static method..");
	}

	static void normalMethod() {
		System.out.println("Non static method");
	}

	Abstract() {
		System.out.println("constructor can be used..");
	}
}

public class Main extends Abstract{
	@Override
	void show() {
		System.out.println("this is abstract method implementation : ");
	}
	
	public static void main(String[] args) {
		Main obj=new Main();
		obj.show();
		//obj.print(); it'll show warning bcz for static method object is not required
		Abstract.print();
		Main.print();
		System.out.println(obj.a+" "+obj.b+" "+obj.c);
	}
}

