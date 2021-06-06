package com.kush.string;

import java.util.ArrayList;

public class P1_IsUnique {
	//Implement an algorithm to determine if a string has all unique characters.
	//What if you cannot use additional data structures?
	// If we don't use additional ds tc would be O(N^2).

	public static void main(String[] args) {
		String[] words = {"abcde", "hello", "apple", "kite", "padle"};
		for (String word : words) {
			System.out.println(word + ": " + isUniqueChars(word));
		}
		System.out.println(isUnique("abcdeghijkl"));
		System.out.println(isUnique("aajojfwohgow"));
	}
	//By book.
	public static boolean isUniqueChars(String str) {
		if (str.length() > 128) {
			return false;
		}
		boolean[] char_set = new boolean[128];
		for (int i = 0; i < str.length(); i++) {
			int val = str.charAt(i);
			if (char_set[val]) return false;
			char_set[val] = true;
		}
		return true;
	}
	
	// My solution.
	private static boolean isUnique(String str) {
		// TC:O(N) SC:O(N)
		ArrayList<Character> al=new ArrayList<>();
		for(Character a:str.toCharArray()) {
			if(!al.contains(a))
				al.add(a);
			else
				return false;
		}
		return true;
	}

}
