package com.crm.qa.tests;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadTextFile {

	public static void main(String[] args) throws FileNotFoundException {

		File f = new File("D:\\Test.txt");
		
		Scanner sc = new Scanner(f);
		
		while(sc.hasNextLine())
		{
			System.out.println(sc.nextLine());
		}
	}

}
