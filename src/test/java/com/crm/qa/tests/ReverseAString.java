package com.crm.qa.tests;

import java.util.Scanner;

public class ReverseAString {

	public static void main(String[] args) {
		
		System.out.println("Enter the string :");
		
		Scanner sc = new Scanner(System.in);
		
		String s =sc.next();
		
		sc.close();
		
		String  rev =" ";
		
		for(int i=s.length()-1; i>=0; i--)
			
		{
			rev = rev+s.charAt(i);
		}
		
		System.out.println(rev);
	}

}
