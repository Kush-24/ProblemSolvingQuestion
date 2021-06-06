package com.kush.interview;

public class PatternSearching {

	public static void main(String[] args) {
		withInBuildMethod("thisisindia","india");
		nomalWay("siddharth","sid");

	}

	private static void nomalWay(String string, String text) {
		int c=0,i,j;
		for(i=0,j=0;i<string.length() && j<text.length();i++) {
			if(text.charAt(j)==string.charAt(i)) {
				c++;
				j++;
				if(c==text.length()) {
					System.out.println("Pattern Found:");
					break;
				}
				
			}else {
				c=0;
				j=0;
			}		
		}
		if(i==string.length())
			System.out.println("Pattern Not found:");
		
	}

	private static void withInBuildMethod(String string, String text) {
		boolean res=string.contains(text);
		if(res)
			System.out.println("Pattern Found:");
		else
			System.out.println("Pattern Not Found:");
		
	}
}
