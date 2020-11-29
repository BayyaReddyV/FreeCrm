package com.crm.qa.pages;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapConcept {

	public static void main(String[] args) {

		HashMap<Integer,  String> hm = new HashMap<Integer, String>();

		hm.put(1, "Hari");
		hm.put(2, "Kiran");
		hm.put(3, "Venkat");
		
		System.out.println(hm.get(1));
		
		for(Entry<Integer, String> m : hm.entrySet())
		{
			//System.out.println(m);
			
			System.out.println(m.getKey()+ "  "+ m.getValue());	
		}
		
	}

}
