package com.kush.interview;

// public is not mandatory here like classes
public interface TestingInterface {
	//In interface:
	// Var by default public static final only.
	// Method : only public and abstract.
	// But after jdk 1.8 we can write static and default method inside the interface.
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


interface MyInterface {
    // Constants
    int MAX_VALUE = 100;
    String DEFAULT_NAME = "Default";

    // Abstract method
    void abstractMethod();

    // Default method
    default void defaultMethod() {
        System.out.println("Default method implementation");
    }

    // Static method
    static void staticMethod() {
        System.out.println("Static method implementation");
    }

    // Nested interface
    interface NestedInterface {
        void nestedMethod();
    }

    // Private method (Java 9+)
    private void privateMethod() {
        System.out.println("Private method implementation");
    }

    // Private static method (Java 9+)
    private static void privateStaticMethod() {
        System.out.println("Private static method implementation");
    }

    // Constant expressions (Java 9+)
    int COMPUTED_CONSTANT = calculateConstant();

    private static int calculateConstant() {
        return 10 + 20;
    }
}

/*
public class Main {
    public static void main(String[] args) {
        // Implementing the nested interface
        MyInterface.NestedInterface nested = new MyInterface.NestedInterface() {
            @Override
            public void nestedMethod() {
                System.out.println("Nested method implementation");
            }
        };
        // Calling the nested method
        nested.nestedMethod();
    }
}
*/

