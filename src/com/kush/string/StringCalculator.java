package com.kush.string;

class zeroNotAllowedExp extends Exception {
	
	public zeroNotAllowedExp(String string) {
    // call constructor of parent class
	super(string);
	}
}

public class StringCalculator {
	
	public static int Add(String str) {
		int ans=0;
		if(str.isEmpty()) return ans;
		
		String[] values=str.split("\\s*,\\s*");
		
		for(String a:values) {
		 int temp=Integer.parseInt(a);
		 
		 if(temp < 0) {
			try {
				throw new zeroNotAllowedExp("Negative not allowed "+temp);
			} catch (zeroNotAllowedExp e) {
				e.printStackTrace();
			}
		 }
		else if(noAdditionNumber(temp) && temp <=1000)
			 ans+=temp;
		 else
			 continue;
		}

		return ans;
	}
	private static boolean noAdditionNumber(int temp) {
		while(temp!=0) {
			int a=temp%10;
			temp/=10;
			if(a > 2)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
			System.out.println(Add("")); // empty string
			System.out.println(Add("1,2,1,0"));// only contain 0,1,2.
			// Ignore values contains other then 0,1,2. so 12+2=14 is answer
			System.out.println(Add("134,23,12,2,567")); 
			// Ignore value more than 1000 so answer is 2.
			System.out.println(Add("2,  1001"));
			// Code should handle all the whitespaces with values in string
			System.out.println(Add("2,1,120,  1001 ,     9888"));
			// Show user define exception if negative present with that negative value.
			System.out.println(Add("-1,2,1,0"));
			
	}

}
