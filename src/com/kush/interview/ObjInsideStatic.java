package com.kush.interview;

public class ObjInsideStatic {
	static ObjInsideStatic obj;
	static {
		//this.obj=new ObjInsideStatic(); // unresolved compilation problem
		ObjInsideStatic.obj=new ObjInsideStatic();
		obj=new ObjInsideStatic();
	}
	
	public static void main(String[] args) {
		System.out.println(ObjInsideStatic.obj);
	}

}
