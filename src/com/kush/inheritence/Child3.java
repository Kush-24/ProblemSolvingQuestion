package com.kush.inheritence;


class Parent3{
	public void show() {
		System.out.println("Parent3 show..");
	}
}

public class Child3 extends Parent3 {
	public void show() {
		System.out.println("Child3 show..");
	}
	public void print() {
		System.out.println("printing child3 meth..");
	}
	public static void main(String[] args) {
		Parent3 p=new Child3();
		p.show();
		//p.print(); CE while using parent obj ref we can only invoke method which is present in parent.
		
		Child3 c=new Child3();
		c.show();
		c.print();
	}
	//Parent p=new Child();
	// p can store any child class object.
	// basically use when we don't know the exact return type like list in collection for al,ll,vector.

}

