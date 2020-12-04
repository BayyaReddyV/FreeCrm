package com.crm.qa.tests;

public class CountCharacterOccurence {

	public static void main(String[] args) {

		String s =" java programming java oops";
		
		int count = s.length();
		
		int countAfterRemoving =s.replace("a", "").length();
		
		int NumberOfOccurences = count - countAfterRemoving;
		
		System.out.println(" Number of occurences are :" + NumberOfOccurences);
		
	}
		
}
