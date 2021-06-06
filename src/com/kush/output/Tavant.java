package com.kush.output;

import java.util.ArrayList;
import java.util.List;

// for 11 answer 5,6

public class Tavant {
public static void main(String[] args) {
	List<Integer> list=check(2);
	list.forEach(val->System.out.print(val+" "));
}

public static List<Integer> check(int target){
    List<Integer> ans=new ArrayList<>();
    int st=1,sum=0;
    
    while(st< target){
        int temp=st;
       if(checkForIndex(temp,target)==true){
           while(sum<target){
               sum+=st;
               ans.add(st);
               st++;
           }
          break; 
       } 
       st++;
    }
    return ans;
}

public static boolean checkForIndex(int i,int t){
    int sum=0;
    
    while(sum < t){
        sum+=i;
        i++;
    }
 return sum==t;
}



}
