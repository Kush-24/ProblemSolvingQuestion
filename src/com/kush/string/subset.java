package com.kush.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class subset {

	public static void main(String[] args) {
		subset("abcd","");
		subset2(new int[] {1,2,3},new ArrayList<>(),0);
		subset3(new int[] {1,2,3},new ArrayList<>(),0);
	}

	private static void subset(String ip,String op){
		if(ip.length()==0) {
			System.out.println(op);
			return;
		}
		char ch=ip.charAt(0); // take first char
		ip=ip.substring(1); // remove first char
		
		subset(ip,op+ch); // add first char to result.
		subset(ip,op); // don't add first char to result.
	}
	
	private static void subset2(int[] arr,List<Integer> list,int index) {
		for(int a:list) System.out.print(a+" ");
		System.out.println();
		
		for(int i=index;i<arr.length;i++){
			list.add(arr[i]);
			subset2(arr,list,i+1);
			list.remove(list.size()-1);
		}
	}
	
	private static void subset3(int[] arr,List<Integer> list,int index) {
		if(index>=arr.length) {
		for(int a:list) System.out.print(a+" ");
		System.out.println();
		return;
		}
		
		subset3(arr,list,index+1);
		list.add(arr[index]);
		subset3(arr,list,index+1);
		list.remove(list.size()-1);
	}
	
}
