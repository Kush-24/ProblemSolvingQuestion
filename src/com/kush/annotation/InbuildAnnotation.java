package com.kush.annotation;

import java.util.ArrayList;

@FunctionalInterface
// Interface which contain only one method.ex Runnable
interface Abc{
	 void oneMethodOnly();
}
//Marker Interface: No method or no members, used to tell the jvm information abt runtime obj.
// ex seriazable, clonnable ,Remote.
interface marker{
	
}

class Parent {
	public void show() {
		System.out.println("Parent method:");
	}
}

class Child extends Parent {
	@Deprecated
	public void oldMethod() {
		
	}
	
	// Annotation showing here we are overriding method,if we write method name diff it gives CE.
	@Override
	@SuppressWarnings("unused")
	public void show() {
		// we are not using al object so suppressWarning annotation to remove warning.
		ArrayList<Integer> al=new ArrayList<>();
		System.out.println("Child method:");
	}
}

public class InbuildAnnotation {
	public static void main(String[] args) {
		Parent p=new Child();
		p.show();
	 //new Child().oldMethod(); deprecated method
	}
}
