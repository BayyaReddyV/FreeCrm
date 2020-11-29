package JavaPrograms;

import java.util.Scanner;

public class ReverseANumber {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		int num = sc.nextInt();
		sc.close();

		
		  StringBuffer sb = new StringBuffer (String.valueOf(num)); 
		  StringBuffer rev = sb.reverse();
		  
		  
			/*
			 * StringBuilder sbl = new StringBuilder (); sbl.append(num); StringBuilder rev
			 * =sbl.reverse();
			 * 
			 * 
			 * int rev=0; while(num !=0)
			 * 
			 * rev = rev*10+num%10; num=num/10; }
			 */
		
		System.out.println(rev);
	}

}
