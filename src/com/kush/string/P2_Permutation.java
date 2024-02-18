package com.kush.string;

import java.util.*;

public class P2_Permutation {
	//Given two strings, write a method to decide,if one is a permutation of the other.
	public static void main(String[] args) {
		 String str1 = "listen";
	        String str2 = "silent";
	        System.out.println("Are '" + str1 + "' and '" + str2 + "' permutations? " + arePermutations(str1, str2)); // Output: true

	        String str3 = "hello";
	        String str4 = "world";
	        System.out.println("Are '" + str3 + "' and '" + str4 + "' permutations? " + arePermutations(str3, str4)); // Output: false
		
	}
	
	public static boolean arePermutations(String str1, String str2) {
        // Check if lengths are equal
        if (str1.length() != str2.length()) {
            return false;
        }

        // Count characters in str1
        Map<Character, Integer> charCount = new HashMap<>();
        for (char c : str1.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        // Decrement counts based on characters in str2
        for (char c : str2.toCharArray()) {
            if (!charCount.containsKey(c)) {
                return false; // Character not found in str1
            }
            int count = charCount.get(c);
            if (count == 0) {
                return false; // More occurrences of c in str2 than in str1
            }
            charCount.put(c, count - 1);
        }

        // Check if all counts are zero (indicating same characters in both strings)
        for (int count : charCount.values()) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }

}
