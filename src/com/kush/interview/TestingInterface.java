package com.kush.interview;

// public is not mandatory here like classes
public interface TestingInterface {
	//In interface:
	// Var by default public static final only.
	// Method : only public and abstract.
	// But after jdk 1.8 we can write static method inside the interface.
	public static void main(String[] args) {
		System.out.println("Look interface is working without class..");	
		TestingInterface.hello();
	}
	void show();
    void print();
    static void hello() {
    	System.out.println("static method with definition..");
    }

}
