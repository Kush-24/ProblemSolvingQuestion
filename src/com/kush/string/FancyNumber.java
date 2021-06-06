package com.kush.string;

import java.util.HashMap;

public class FancyNumber {
/*
 * Given a mobile number and some conditions for a fancy number,
 *  find if the given number is fancy ot not.
 *   The conditions are :
-A single number occurs three consecutive times. Like 777.
-3 consecutive digits are either in increasing or decreasing fashion. Like 456 or 987.
-A single number occurs four or more times in the number. Like 9859009976 – Here 9 occurs 4 times.
 */
	public static boolean firstCondition(String str) {
		for(int i=0;i<=str.length()-3;i++) {
			char ch=str.charAt(i);
		 if(str.charAt(i+1)==ch && str.charAt(i+2)==ch)
			 return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		System.out.println(fancyNumberOrNot("98590007976"));
	}

	private static boolean fancyNumberOrNot(String s) {
	 if(firstCondition(s) || secondCondition(s) || thirdCondition(s))
		return true;
	 else 
		 return false;
	}

	private static boolean thirdCondition(String s) {
		HashMap<Character,Integer> map=new HashMap<>();
		for(char ch:s.toCharArray())
			map.put(ch, map.getOrDefault(ch, 0)+1);
		
	   for(int val:map.values()) {
		   if(val >=4) return true;
	   }  
		return false;
	}

	private static boolean secondCondition(String str) {
		for(int i=0;i<=str.length()-3;i++) {
			int val=str.charAt(i);
		 if( (str.charAt(i+1)==val+1 && str.charAt(i+2)==val+2) ||
		     (str.charAt(i+1)==val-1 && str.charAt(i+2)==val-2))
			 return true;
		}
		return false;
	}

}
