package com.crm.qa.pages;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapExample {

	public static void main(String[] args) {


		HashMap<Integer, Employee> emp= new HashMap<Integer, Employee>();
		
		Employee e1 = new Employee("Tom", 32, "QA");
		Employee e2 = new Employee("Peter", 44, "Admin");
   		Employee e3 = new Employee("Aravind",10, "Dev");

		emp.put(1, e1);
		emp.put(2, e2);
		emp.put(3, e3);
		
		for(Entry<Integer, Employee> m : emp.entrySet())
		{
			int key = m.getKey();
			Employee e = m.getValue();			
			System.out.println( "Employee"+ key+" "+ "Info: ");
			
			System.out.println(e.name+" "+e.age+" "+e.dept);
		}

		
	}

}
