package com.crm.qa.base;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Sample {

	public static void main(String[] args) {
		
        
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("ratan");
		
		al.add("anu");
		
		al.add("durga");
		
		al.add("sravya");
		
		System.out.println("Printing the ArrayList data before sorting : ");
		
		for(String s : al)
		{
			System.out.println(s);
		}
		
		Collections.sort(al);
		
		System.out.println("Printing the ArrayList data after sorting in Ascending order  : ");
		
		for(String s1 : al)
		{
			System.out.println(s1);
		}
		
		System.out.println("Printing the ArrayList data after sorting in Descending order  : ");
			
		Collections.sort(al, Collections.reverseOrder());
		
		for(String s2 : al)

		{
			System.out.println(s2);
	
	}
		
	}

}
