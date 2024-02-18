package com.kush.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Part1 {
public static void main(String[] args) {
	List<Integer> list=Arrays.asList(1,2,3,4,5,6,7);	
/*
 *Can Iterate with-> For index loop, Iterator , foreach loop.
*/
	
	// 1. External Iterator 
	//2. Internal Iterator. [With the help of stream Api)
	// After Java1.8:
	
// Consumer with Anonymous class
	Consumer<Integer> c=new Consumer<Integer>() {
		@Override
		public void accept(Integer t){
			System.out.print(t+" ");
		}
	};
	list.forEach(c);
	
// consumer with lambda expression
	Consumer<Integer> cl=(a->{
			System.out.print(a+" ");
	});
	list.forEach(cl);
	
// We can directly add that consumer class object in foreach()
	list.forEach(a->System.out.print(a+" "));
	
	
	
	
}
}
