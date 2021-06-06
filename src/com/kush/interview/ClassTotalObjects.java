package com.kush.interview;

public class ClassTotalObjects{
	static int objNumber=0;
	public ClassTotalObjects() {
		objNumber++;
	//	System.out.println(this);
	}
	public void counter() {
	/*
	 * Object class toString method for printing object of Class.
	 public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }
	 */
		System.out.println(ClassTotalObjects.this); //com.kush.interview.ClassTotalObjects@24d46ca6
		System.out.println(ClassTotalObjects.objNumber);
	}
	
	public static void main(String[] args) {
		new ClassTotalObjects();
		new ClassTotalObjects();
		new ClassTotalObjects();
		new ClassTotalObjects().counter();
		new ClassTotalObjects();
		new ClassTotalObjects();
		new ClassTotalObjects().counter();
		
	}

}
