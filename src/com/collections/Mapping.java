package com.collections;

import java.util.HashMap;
import java.util.Map;

public class Mapping {

	
	public static void main(String[] args) {
		
//		Map <Object, String> m = new HashMap<Object, String>();
//		m.put("Hello",   "Venkatesh");
//		m.put("Welcome", "Rajesh");
//		System.out.println(m);
		int a=541;
		int n = a, i, j = 0;
		while (n>0) {
			i=n%10;
			j=(j*10)+i;
			n=n/10;
		}
		System.out.println("a="+a+";j="+j);
		
		
	}
}
