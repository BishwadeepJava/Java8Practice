package com.sapient.javaPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@FunctionalInterface
interface Square 
{ 
	Integer sum(Integer x, Integer y); 
} 
  
class Java8Test 
{ 
    public static void main(String args[]) 
    { 
    	Integer a = 5;
    	Integer b = 5;
  
        Square s = (Integer x, Integer y)->x+y; 
  
        Integer ans = s.sum(a,b); 
        System.out.println(ans);
        
        List<Integer> list = new ArrayList<Integer>(); 
        
        list.add(1); 
        list.add(5); 
        list.add(6); 
        list.add(7); 
        list.add(8); 
        list.add(9); 
        list.add(10);
        
        //list.stream().forEach((k)-> s.sum(k, 5));
        list.stream().map((k)-> s.sum(k, 5)).collect(Collectors.toList()).stream().forEach((i) -> System.out.println(i));
        
    }

    
}
