package com.kush.pattern;

public class Pattern {

	public static void main(String[] args) {
		//pattern(10, 10);
		//pattern1(10);
		//pattern3(10);
		//pattern2(10);
		//pattern4(10);
		//pattern5(5);
		//pattern6();
		//pattern7(7);
		//pattern8(10);
		//pattern9(9);
		pattern10(9);
	}
	public static void pattern(int r,int c) {
		for(int i=1;i<=r;i++) {
			for(int j=1;j<=c;j++) {
				System.out.print("*\t");
			}
			System.out.println();
		}
	}

	public static void pattern1(int len) {
		int col=1;
		for(int i=1;i<=len;i++) { //row-5
			for(int j=1;j<=col;j++) {
				System.out.print("* ");
			}
			col++;
			System.out.println();
		}
	}
	
	public static void pattern2(int len) {
		int space=0,star=len;
		for(int i=1;i<=len;i++) { // 
			for(int j=1;j<=space;j++) {
				System.out.print("\t");
			}
			for(int j=1;j<=star;j++) {
				System.out.print("*\t");
			}
			space++;
			star--;
			System.out.println();
		}
	}

	public static void pattern3(int len) {
		int col=len;
		for(int i=1;i<=len;i++) { // row
			for(int j=1;j<=col;j++) {
				System.out.print("* ");
			}
			col--;
			System.out.println();
		}
	}
	
	public static void pattern4(int len) {
		int space=len,star=0;
		for(int i=1;i<=len;i++) { // 
			for(int j=1;j<=space;j++) {
				System.out.print("\t");
			}
			for(int j=1;j<=star;j++) {
				System.out.print("*\t");
			}
			space--;
			star++;
			System.out.println();
		}
	}
	
	public static void pattern5(int len) {
		int star=1,space=len-1;
		for(int i=1;i<=len;i++) {
			for(int j=0;j<space;j++) {
				System.out.print("\t");
			}
			for(int j=0;j<star;j++) {
				System.out.print("*\t");
			}
			star+=2;
			space--;
		System.out.println();
		}
	}
	
	public static void pattern6() {
		int star=9,space=0;
		for(int i=1;i<=6;i++) { //row
			for(int j=0;j<space;j++) {
				System.out.print("\t");
			}
			for(int j=0;j<star;j++) {
				System.out.print("*\t");
			}
			star-=2; //star = (star - 2); // 7 
			space++;
		System.out.println();
		}
	}
	
	public static void pattern7(int len) {
		int star=1,space=len/2;
		for(int i=1;i<=len;i++) { //row
			for(int j=0;j<space;j++) {
				System.out.print("\t");
			}
			for(int j=0;j<star;j++) {
				System.out.print("*\t");
			}
			if(i<=len/2) { // upper half
				star+=2;
				space--;
			}else { // lower half (below mid)
				star-=2;
				space++;
			}
		 System.out.println();
		}
	}
	
	public static void pattern8(int len) {
		int star=len-1,space=0;
		for(int i=1;i<len;i++) { //row
			for(int j=0;j<space;j++) {
				System.out.print("\t");
			}
			for(int j=0;j<star;j++) {
				System.out.print("*\t");
			}
			if(i<len/2) { // upper half
				star-=2;
				space++;
			}else { // lower half (below mid)
				star+=2;
				space--;
			}
		System.out.println();
		}
	}
	
	public static void pattern9(int len) {
		int col=1;
		for(int i=1;i<=len;i++) { 
			for(int j=0;j<col;j++) {
				System.out.print("*\t");
			}
			if(i<=len/2) 
			col++;
			else
			col--;
		System.out.println();
		}
	}
	
	public static void pattern10(int len) {
		int star=1,space=len/2-1;
		for(int i=1;i<len;i++) { //row
			for(int j=0;j<space;j++) {
				System.out.print("\t");
			}
			for(int j=0;j<star;j++) {
				System.out.print("*\t");
			}
			if(i<len/2) { // upper half
				star++;
				space--;
			}else { // lower half (below mid)
				star--;
				space++;
			}
		System.out.println();
		}
	}
}
