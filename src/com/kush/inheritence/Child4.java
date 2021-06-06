package com.kush.inheritence;

// we can't overide static, final and private methods. if we do compilation error.
class Parent4{
	/*
	 static void show() {
		System.out.println("Parent4 show..");
	}
	 final void show() {
			System.out.println("Parent4 show..");
		}
	 private void show() {
			System.out.println("Parent4 show..");
		}
		*/
}

public class Child4 extends Parent4 {
	public void show() {
		System.out.println("Child4 show..");
	}
	public static void main(String[] args) {
		Parent4 p=new Child4();
	//	p.show();we can't call methd with parent ref var which is not present in parent class.
		Child4 c=new Child4();
		c.show();
	}

}

