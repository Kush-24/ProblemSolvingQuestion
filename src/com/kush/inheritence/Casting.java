package com.kush.inheritence;
/*
 * Casting is the process of making a variable behaves as a variable of another type.
 * Casting an object from a sub class to a super class doesn’t require an explicit cast.(automatically done by the compiler)
 * Casting an object from a super class to a sub class requires an explicit cast.
 */

/*
 Widening Casting (automatically) - converting a smaller type to a larger type size
byte -> short -> char -> int -> long -> float -> double

Narrowing Casting (manually) - converting a larger type to a smaller size type
double -> float -> long -> int -> char -> short -> byte
 */

class Super {
	   void sample() {
	      System.out.println("method of super class");
	   }
}

class Sub extends Super {
	   void sample() {
	      System.out.println("method of sub class");
	   }
}
	  

public class Casting {
public static void main(String[] args) {
	// This is Upcasting
	Super s=new Sub(); // (Super) new Sub(); done by the compiler 
	s.sample();
	
	Sub sub=new Sub();
	Super sup=(Super)sub; // Super sup=sub;
	sup.sample();
	
	// DownCasting
	Super s1=new Sub();
	Sub sub1=(Sub)s1; // here we need casting
	sub1.sample();
/*
 * RE : java.lang.ClassCastException:
 * Super cannot be cast to class Sub 
 
	Super superObj=new Super();
	Sub subObj=(Sub) superObj;
	subObj.sample();
*/
}
}
